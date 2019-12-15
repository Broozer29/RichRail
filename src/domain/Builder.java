package domain;

public interface Builder {
   void setSeats(int seats);

   void setId(int id);

   void setType(String type);
   
   Wagon build();
}
