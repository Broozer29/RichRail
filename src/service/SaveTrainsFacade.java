package service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import domain.Train;

public class SaveTrainsFacade {
	
	public void saveTrainsAsJSon(ArrayList<Train> trainList) throws FileNotFoundException, IOException {
		SaveTrainsAsJSonAdapter saveJSon = new SaveTrainsAsJSonAdapter();
		saveJSon.save(trainList);
	}
	
	public void saveTrainsAsTxt(ArrayList<Train> trainList) throws FileNotFoundException, IOException {
		SaveTrainsAsTxtAdapter saveTxt = new SaveTrainsAsTxtAdapter();
		saveTxt.save(trainList);
	}
}
