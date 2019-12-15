package presentation;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import domain.DefaultTrain;
import domain.Train;
import domain.TrainFactory;
import domain.Wagon;
import domain.WagonBuilder;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import resource.IDUtil;
import service.SaveTrainsFacade;

public class RichrailController {

	private ArrayList<Train> trainList = new ArrayList<Train>();
	ObservableList<String> exisitingTrainNames = FXCollections.observableArrayList(getTrainNames());
	private Train currentTrain;
	public GraphicsContext gc = createTrainConfig();
	
	public void createInteractiveUi() throws IOException {
		Stage trainBuilder = new Stage();
		Pane mainWindow =  FXMLLoader.load(Main.class.getResource("Richrail.fxml"));
		trainBuilder.setScene(new Scene(mainWindow));
		trainBuilder.show();
	}
	
	private GraphicsContext createTrainConfig() {
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

	@FXML
	private TextField trainNameInput;

	@FXML
	private ChoiceBox<String> trainSelectDropdown;

	@FXML
	void addWagonType1(ActionEvent event) {
		Wagon wagon = createNewWagon(10, "10 Stoelen");
		currentTrain.addWagon(wagon);
		updateGUI();

	}

	@FXML
	void addWagonType2(ActionEvent event) {
		Wagon wagon = createNewWagon(20, "20 Stoelen");
		currentTrain.addWagon(wagon);
		updateGUI();
	}

	@FXML
	void addWagonType3(ActionEvent event) {
		Wagon wagon = createNewWagon(30, "30 Stoelen");
		currentTrain.addWagon(wagon);
		updateGUI();
	}

	@FXML
	void deleteTrain(ActionEvent event) {
		deleteTrain();
		updateTrainList();
		updateGUI();
	}

	@FXML
	void deleteWagonType1(ActionEvent event) {
		currentTrain.removeWagon("10 Stoelen");
		updateGUI();
	}

	@FXML
	void deleteWagonType2(ActionEvent event) {
		currentTrain.removeWagon("20 Stoelen");
		updateGUI();
	}

	@FXML
	void deleteWagonType3(ActionEvent event) {
		currentTrain.removeWagon("30 Stoelen");
		updateGUI();
	}

	@FXML
	void newTrain(ActionEvent event) {
		currentTrain = createNewTrain();
		trainList.add(currentTrain);
		updateTrainList();
		drawTrain(gc);
	}

	@FXML
	void selectTrain(ActionEvent event) {
		String trainName = trainSelectDropdown.getValue();
		for (Train train : trainList) {
			if (train.getName().equals(trainName)) {
				currentTrain = train;
				updateGUI();
			}
		}
	}
	
    @FXML
    void newTrainLocomotive(ActionEvent event) {
		currentTrain = createNewLocomotief();
		trainList.add(currentTrain);
		updateTrainList();
		drawTrain(gc);
    }

	@FXML
	private void updateTrainList() {
		exisitingTrainNames = FXCollections.observableArrayList(getTrainNames());
		trainSelectDropdown.setItems(exisitingTrainNames);
	}
	
    @FXML
    void saveTrains(ActionEvent event) throws FileNotFoundException, IOException {
    	SaveTrainsFacade facade = new SaveTrainsFacade();
    	facade.saveTrainsAsJSon(trainList);
    	facade.saveTrainsAsTxt(trainList);
    }


	private DefaultTrain createNewTrain() {
		TrainFactory trainFactory = new TrainFactory();
		DefaultTrain newTrain = trainFactory.createTrain(trainNameInput.getText());
		return newTrain;
	}

	private DefaultTrain createNewLocomotief() {
		TrainFactory trainFactory = new TrainFactory();
		DefaultTrain newTrain = trainFactory.createLocomotief(trainNameInput.getText());
		trainList.add(newTrain);
		return newTrain;
	}

	private Wagon createNewWagon(int seatTotal, String type) {
		IDUtil idGenerator = new IDUtil();
		WagonBuilder wagonBuilder = new WagonBuilder();
		wagonBuilder.setId((int) idGenerator.getNextId());
		wagonBuilder.setSeats(seatTotal);
		wagonBuilder.setType(type);
		return wagonBuilder.build();
	}

	private void deleteTrain() {
		trainList.remove(currentTrain);
		currentTrain = null;
		updateGUI();
	}

	private ArrayList<String> getTrainNames() {
		ArrayList<String> trainNameList = new ArrayList<String>();
		for (Train train : trainList) {
			trainNameList.add(train.getName());
		}
		return trainNameList;
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
		if (wagon.getType().equals("10 Stoelen")) {
			gc.setFill(Color.GREEN);
		} else if (wagon.getType().equals("20 Stoelen")) {
			gc.setFill(Color.RED);
		} else if (wagon.getType().equals("30 Stoelen")) {
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