package domain;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import com.google.gson.Gson;

public class JsonCreator {

	private String fileName = "TrainList.json";
	private BufferedWriter writer;

	public void createJson(ArrayList<Train> trainList) {
		Gson gson = new Gson();
		String jsonString = "";

		if (!trainList.isEmpty()) {
			for (Train train : trainList) {
				jsonString += gson.toJson(train);
			}
		}

		try {
			writer = new BufferedWriter(new FileWriter(fileName));
			writer.write(jsonString);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
