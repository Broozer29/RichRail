package domain;

import java.io.Serializable;

public class Wagon implements Serializable{
   private int seats;
   private int id;
   private int trainId;
   private String type;
   private String name;

   public Wagon(int seats, int id, String type) {
      this.seats = seats;
      this.id = id;
      this.type = type;
   }

   public int getSeats() {
      return this.seats;
   }
   
   public void setName(String name) {
	   this.name = name;
   }
   
   public String getName() {
	   return this.name;
   }

   public int getId() {
      return this.id;
   }

   public int getTrainId() {
      return this.trainId;
   }

   public String getType() {
      return this.type;
   }

   public void setTrainId(int id) {
      this.trainId = id;
   }

   public boolean equals(Wagon wagon) {
      boolean sameTrain = false;
      if (wagon.getId() == this.id && wagon.getTrainId() == this.trainId) {
         sameTrain = true;
      }

      return sameTrain;
   }
}
