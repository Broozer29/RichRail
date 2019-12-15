package domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.ListIterator;

public class DefaultTrain implements Train, Serializable {
	private ArrayList<Wagon> wagonList = new ArrayList<Wagon>();;
	private int ID;
	private String type;
	private String name;

	public int getID() {
		return ID;
	}

	public void setID(int id) {
		this.ID = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType(String type) {
		return this.type;
	}

	public void addWagon(Wagon wagon) {
		this.wagonList.add(wagon);
	}

	public void removeWagon(String wagonType) {
		ListIterator<Wagon> listIter = wagonList.listIterator(wagonList.size());
		while (listIter.hasPrevious()) {
			Wagon lastWagon = listIter.previous();
			if (lastWagon.getType().equals(wagonType) || lastWagon.getName().equals(wagonType)) {
				wagonList.remove(lastWagon);
				return;
			}
		}
	}

	public ArrayList<Wagon> getWagons() {
		return wagonList;
	}

	public String toString() {
		String returnString = "Deze trein heeft nog geen informatie!";
		if (this.type != null && this.name != null) {
			returnString = "Naam: " + this.name + "ID: " + this.ID + " met type: " + this.type + " met "
					+ this.wagonList.size() + " wagons.";
		}
		return returnString;
	}

}
