package domain;

import resource.IDUtil;

public class TrainFactory implements Factory {

	private IDUtil idGenerator = new IDUtil();
	
	public DefaultTrain createTrain(String trainName) {
		DefaultTrain newTrain = new DefaultTrain();
		newTrain.setID((int) idGenerator.getNextId());
		newTrain.setType("Standaard");
		newTrain.setName(trainName);
		return newTrain;
	}

	public DefaultTrain createLocomotief(String trainName) {
		DefaultTrain newTrain = new DefaultTrain();
		newTrain.setID((int) idGenerator.getNextId());
		newTrain.setType("Locomotief");
		newTrain.setName(trainName);
		return newTrain;
	}

}
