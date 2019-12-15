package domain;

public class WagonBuilder implements Builder {
   private int seats;
   private int id;
   private String type;

   public void setSeats(int seats) {
      this.seats = seats;
   }

   public void setId(int id) {
      this.id = id;
   }

   public void setType(String type) {
      this.type = type;
   }

   public Wagon build() {
      return new Wagon(this.seats, this.id, this.type);
   }
   
}
