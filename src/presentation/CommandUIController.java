package presentation;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import domain.Train;
import domain.Wagon;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;
import parser.RichRailLexer;
import parser.RichRailListener;
import parser.RichRailParser;
import service.RichRailCli;
import service.SaveTrainsFacade;

public class CommandUIController {

	Train currentTrain;
	ParseTreeWalker walker = new ParseTreeWalker();
	RichRailListener listener = new RichRailCli();
	GraphicsContext gc = createTrainConfig();

	@FXML
	private TextField commandInput;

	@FXML
	private TextFlow commandLogger;

	@FXML
	void submitCommand(ActionEvent event) {
		CharStream lineStream = CharStreams.fromString(commandInput.getText());

		Lexer lexer = new RichRailLexer(lineStream);
		CommonTokenStream tokens = new CommonTokenStream(lexer);

		RichRailParser parser = new RichRailParser(tokens);
		ParseTree tree = parser.command();

		walker.walk(listener, tree);
		commandLogger.getChildren().add(new Text(listener.getLastAction() + "\n"));

		currentTrain = listener.getCurrentTrain();
		updateGUI();

	}
	
    @FXML
    void saveConfiguration(ActionEvent event) throws FileNotFoundException, IOException {
    	ArrayList<Train> trainList = listener.getTrainList();
    	SaveTrainsFacade facade = new SaveTrainsFacade();
    	facade.saveTrainsAsJSon(trainList);
    	facade.saveTrainsAsTxt(trainList);
    }
	
	
	public GraphicsContext createTrainConfig() {

		Stage window = new Stage();
		Group root = new Group();
		Canvas canvas = new Canvas(720, 400);
		GraphicsContext gc = canvas.getGraphicsContext2D();

		root.getChildren().add(canvas);
		window.setScene((new Scene(root)));
		window.toFront();
		window.show();

		return gc;
	}

	public void createCommandUI() throws IOException, CloneNotSupportedException {
		Stage dslStage = new Stage();
		SplitPane mainWindow = FXMLLoader.load(Main.class.getResource("CommandUIRichrail.fxml"));
		dslStage.setScene(new Scene(mainWindow));
		dslStage.show();
	}
	
	private void drawTrain(GraphicsContext gc) {
		gc.setFill(Color.BLACK);
		gc.fillRect(30, 80, 80, 40);
		gc.fillRect(80, 60, 30, 30);
		gc.setStroke(Color.BLACK);
		gc.fillRoundRect(35, 120, 20, 20, 20, 20);
		gc.fillRoundRect(80, 120, 20, 20, 20, 20);
	}

	private void drawWagon(GraphicsContext gc, Wagon wagon, int iteratorNumber) {
		int wagonOffset = iteratorNumber * 100;
		if (wagon.getType().equals("wagon1")) {
			gc.setFill(Color.GREEN);
		} else if (wagon.getType().equals("wagon2")) {
			gc.setFill(Color.RED);
		} else if (wagon.getType().equals("wagon3")) {
			gc.setFill(Color.BLUE);
		}
		gc.fillRect(120 + wagonOffset, 80, 80, 40);
		gc.fillRoundRect(125 + wagonOffset, 120, 20, 20, 20, 20);
		gc.fillRoundRect(165 + wagonOffset, 120, 20, 20, 20, 20);

	}

	private void updateGUI() {
		gc.clearRect(0, 0, 720, 400);
		if (currentTrain != null) {
			drawTrain(gc);
			ArrayList<Wagon> wagonList = currentTrain.getWagons();
			int iteratorNumber = 0;
			for (Wagon wagon : wagonList) {
				drawWagon(gc, wagon, iteratorNumber);
				iteratorNumber++;
			}
		}
	}
	

}
