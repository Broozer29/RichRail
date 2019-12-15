package domain;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class TextFileCreator {
	
	public void createTxtFile(ArrayList<Train> trainList) throws IOException {
		FileOutputStream file = new FileOutputStream("Trains.txt");
		ObjectOutputStream out = new ObjectOutputStream(file);
		out.writeObject(trainList);
		out.close();
	}

}
