package service;

import java.util.ArrayList;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import domain.DefaultTrain;
import domain.Train;
import domain.TrainFactory;
import domain.Wagon;
import domain.WagonBuilder;
import parser.RichRailListener;
import parser.RichRailParser.AddcommandContext;
import parser.RichRailParser.CommandContext;
import parser.RichRailParser.DelcommandContext;
import parser.RichRailParser.GetcommandContext;
import parser.RichRailParser.NewcommandContext;
import parser.RichRailParser.NewlocomotivecommandContext;
import parser.RichRailParser.NewtraincommandContext;
import parser.RichRailParser.NewwagononecommandContext;
import parser.RichRailParser.NewwagonthreecommandContext;
import parser.RichRailParser.NewwagontwocommandContext;
import parser.RichRailParser.RemcommandContext;
import parser.RichRailParser.TypeContext;
import resource.IDUtil;

public class RichRailCli implements RichRailListener {

	Train currentTrain = null;

	ArrayList<Wagon> wagonList;
	ArrayList<Train> trainList;

	String lastAction = null;

	@Override
	public void enterEveryRule(ParserRuleContext arg0) {
		if (wagonList == null || wagonList.isEmpty()) {
			wagonList = new ArrayList<Wagon>();
		}
		
		if (trainList == null || trainList.isEmpty()) {
			trainList = new ArrayList<Train>();
		}
	}

	@Override
	public void exitEveryRule(ParserRuleContext arg0) {
	}

	@Override
	public void visitErrorNode(ErrorNode arg0) {
	}

	@Override
	public void visitTerminal(TerminalNode arg0) {
	}

	@Override
	public void enterCommand(CommandContext ctx) {
	}

	@Override
	public void exitCommand(CommandContext ctx) {
	}

	@Override
	public void enterNewcommand(NewcommandContext ctx) {
	}

	@Override
	public void exitNewcommand(NewcommandContext ctx) {
	}

	@Override
	public void enterNewtraincommand(NewtraincommandContext ctx) {
		String trainName = ctx.getChild(2).getText();
		TrainFactory factory = createFactory();
		DefaultTrain train = factory.createTrain(trainName);
		trainList.add(train);
		System.out.println(trainList.size());
		currentTrain = train;
		lastAction = "Created a new train with name: " + trainName;
	}

	@Override
	public void exitNewtraincommand(NewtraincommandContext ctx) {
	}

	@Override
	public void enterNewwagononecommand(NewwagononecommandContext ctx) {
		int seatCount = 10;

		if (ctx.getChildCount() == 5) {
			String seatCountString = ctx.getChild(4).getText();
			seatCount = Integer.parseInt(seatCountString);
		}

		Wagon wagon = buildWagon(ctx.getChild(2).getText(), seatCount, "wagon1");
		wagonList.add(wagon);
	}

	@Override
	public void exitNewwagononecommand(NewwagononecommandContext ctx) {
	}

	@Override
	public void enterNewwagontwocommand(NewwagontwocommandContext ctx) {
		int seatCount = 20;

		if (ctx.getChildCount() == 5) {
			String seatCountString = ctx.getChild(4).getText();
			seatCount = Integer.parseInt(seatCountString);
		}

		Wagon wagon = buildWagon(ctx.getChild(2).getText(), seatCount, "wagon2");
		wagonList.add(wagon);

	}

	@Override
	public void exitNewwagontwocommand(NewwagontwocommandContext ctx) {
	}

	@Override
	public void enterNewwagonthreecommand(NewwagonthreecommandContext ctx) {
		int seatCount = 30;

		if (ctx.getChildCount() == 5) {
			String seatCountString = ctx.getChild(4).getText();
			seatCount = Integer.parseInt(seatCountString);
		}

		Wagon wagon = buildWagon(ctx.getChild(2).getText(), seatCount, "wagon3");
		wagonList.add(wagon);
	}

	@Override
	public void exitNewwagonthreecommand(NewwagonthreecommandContext ctx) {
	}

	@Override
	public void enterNewlocomotivecommand(NewlocomotivecommandContext ctx) {
		String trainName = ctx.getChild(2).getText();
		TrainFactory factory = createFactory();
		DefaultTrain train = factory.createLocomotief(trainName);
		trainList.add(train);
		currentTrain = train;
		lastAction = "Created a new locomotive with name: " + trainName;
	}

	@Override
	public void exitNewlocomotivecommand(NewlocomotivecommandContext ctx) {
	}

	@Override
	public void enterAddcommand(AddcommandContext ctx) {
		String wagonName = ctx.getChild(1).getText();
		String trainName = ctx.getChild(3).getText();

		
		for (Train train : trainList) {
			if (train.getName().equals(trainName)) {
				currentTrain = train;
			}
		}

		if (currentTrain != null) {
			for (Wagon wagon : wagonList) {
				if (wagon.getName().equals(wagonName)) {
					currentTrain.addWagon(wagon);
					System.out.println("Wagen toegevoegd!");
					lastAction = "Added wagon with name: " + wagonName + " to train/locomotive: " + trainName;
				}
			}
		}

	}

	@Override
	public void exitAddcommand(AddcommandContext ctx) {
	}

	@Override
	public void enterGetcommand(GetcommandContext ctx) {
		String typeOfSeatsRequested = ctx.getChild(1).getText();
		String objectName = ctx.getChild(2).getText();
		int seatCount = 0;

		if (typeOfSeatsRequested.equals("train") || typeOfSeatsRequested.equals("locomotive")) {
			for (Train train : trainList) {
				if (train.getName().equals(objectName)) {
					ArrayList<Wagon> trainWagons = train.getWagons();
					for (Wagon wagon : trainWagons) {
						seatCount += wagon.getSeats();
					}
				}
			}
		}

		if (typeOfSeatsRequested.equals("wagon1") || typeOfSeatsRequested.equals("wagon1")
				|| typeOfSeatsRequested.equals("wagon1")) {
			for (Wagon wagon : wagonList) {
				seatCount = wagon.getSeats();

			}
		}

		lastAction = "Number of seats in " + typeOfSeatsRequested + " " + objectName + " " + seatCount;

	}

	@Override
	public void exitGetcommand(GetcommandContext ctx) {
	}

	@Override
	public void enterDelcommand(DelcommandContext ctx) {
		String typeOfDeleteRequested = ctx.getChild(1).getText();
		String objectName = ctx.getChild(2).getText();
		boolean objectDeleted = false;
		boolean deleteATrain = false;
		Train trainToDelete = null;
		
		if (typeOfDeleteRequested.equals("train") || typeOfDeleteRequested.equals("locomotive")) {
			for (Train train : trainList) {
				if (train.getName().equals(objectName)) {
					trainToDelete = train;
					deleteATrain = true;
				}
			}
		}
		
		if (deleteATrain) {
			trainList.remove(trainToDelete);
			objectDeleted = true;
		}
		
		if (objectDeleted) {
			lastAction = typeOfDeleteRequested + " " + objectName + " deleted.";
		} else {
			lastAction =  typeOfDeleteRequested + " " + objectName + " does not exist.";
		}
		

	}

	@Override
	public void exitDelcommand(DelcommandContext ctx) {
	}

	@Override
	public void enterRemcommand(RemcommandContext ctx) {
		String wagonType = ctx.getChild(1).getText();
		String trainName = ctx.getChild(3).getText();
		boolean deletedWagon = false;
		boolean deleteAWagon = false;
		Wagon wagonToDelete = null;
		
		for (Train train : trainList) {
			if (train.getName().equals(trainName)) {
				currentTrain = train;
			}
		}
		
		for (Wagon wagon : currentTrain.getWagons()) {
			if (wagon.getName().equals(wagonType)) {
				deleteAWagon = true;
				wagonToDelete = wagon;
			}
		}
		
		if (deleteAWagon) {
			currentTrain.removeWagon(wagonToDelete.getName());
			deletedWagon = true;
		}
		
		if (deletedWagon) {
			lastAction = "Deleted " + wagonType + " from train/locomotive " + trainName; 
		} else {
			lastAction = "Couldn't find a wagon from that type for train : " + trainName;
		}
	}

	@Override
	public void exitRemcommand(RemcommandContext ctx) {
	}

	@Override
	public void enterType(TypeContext ctx) {
	}

	@Override
	public void exitType(TypeContext ctx) {
	}

	public Train getCurrentTrain() {
		return currentTrain;
	}
	
	public ArrayList<Train> getTrainList(){
		return trainList;
	}

	public String getLastAction() {
		return lastAction;
	}

	private TrainFactory createFactory() {
		return new TrainFactory();
	}

	private int generateID() {
		IDUtil idGenerator = new IDUtil();
		return (int) idGenerator.getNextId();
	}

	private Wagon buildWagon(String name, int seatCount, String type) {
		WagonBuilder builder = new WagonBuilder();
		builder.setId(generateID());
		builder.setSeats(seatCount);
		builder.setType(type);
		Wagon wagon = builder.build();
		wagon.setName(name);
		lastAction = "Created a new wagon with type: " + type + " with " + seatCount + " seats and with this name: "
				+ name;
		return wagon;
	}

}
