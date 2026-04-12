import java.util.ArrayList;

class Room{

    double getRate(){
  
         return 0;

    }

}


class Deluxe_Room extends Room{

    double getRate(){

         return 5000;

    }

}

class Standard_Room extends Room{

    double getRate(){

         return 2500;

    }

}

class List{

   public static void main(String[] args){

       ArrayList<Room> rooms = new ArrayList<Room>();

       rooms.add(new Deluxe_Room());
       rooms.add(new Standard_Room());
       rooms.add(new Deluxe_Room());
       rooms.add(new Standard_Room());

       double total = 0;

       for(Room room : rooms){
           
           String s = String.valueOf(room);
           int index = s.indexOf("@");
           System.out.println(s.substring(0, index)+ " Rate : " + room.getRate());
           total += room.getRate();

       }

       System.out.println("\n" + "Total Booking Cost : " + total);


   }

}