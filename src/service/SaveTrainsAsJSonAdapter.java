package service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import domain.JsonCreator;
import domain.Train;

public class SaveTrainsAsJSonAdapter implements SaveTrains{
	@Override
	public void save(ArrayList<Train> trainList) throws FileNotFoundException, IOException {
		saveAsJSon(trainList);		
	}

	public void saveAsJSon(ArrayList<Train> trainList) {
		JsonCreator jsonCreator = new JsonCreator();
		jsonCreator.createJson(trainList);
	}
}
