package service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import domain.Train;

public interface SaveTrains {
	public void save(ArrayList<Train> trainList) throws FileNotFoundException, IOException;
}
