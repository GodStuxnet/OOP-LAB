class Computer{

   void showConfiguration(){
       
       System.out.println("RAM : 16GB");
       System.out.println("RYZEN 3050");
       System.out.println("SSD CARD");
       System.out.println("ALL BASIC PORTS");
   
   };

}

class Laptop extends Computer{

   String battery;

   Laptop(String charge){

       battery = charge;

   }

   void showConfiguration(){

       super.showConfiguration();
       System.out.println("Battery : " + battery);

   }


}


class Main{

  public static void main(String[] args){

      Laptop l = new Laptop("60W");
      
      l.showConfiguration();

  }

}