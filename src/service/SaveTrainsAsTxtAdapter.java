package service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import domain.TextFileCreator;
import domain.Train;

public class SaveTrainsAsTxtAdapter implements SaveTrains {
	@Override
	public void save(ArrayList<Train> trainList) throws FileNotFoundException, IOException {
		saveTrainsAsTxt(trainList);
	}
	public void saveTrainsAsTxt(ArrayList<Train> trainList) throws FileNotFoundException, IOException {
		TextFileCreator textFileCreator = new TextFileCreator();
		textFileCreator.createTxtFile(trainList);
	}
}
