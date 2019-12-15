package domain;

import java.util.ArrayList;

public interface Train {
	public void setID(int ID);
	public int getID();
	
	public void setType(String type);
	public String getType(String type);
	
	public void setName(String name);
	public String getName();
	
	public ArrayList<Wagon> getWagons();
	
	public void addWagon(Wagon wagon);
	public void removeWagon(String wagonType);
	
	public String toString();
}
