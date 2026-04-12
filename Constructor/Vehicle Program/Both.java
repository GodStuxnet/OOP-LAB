class Vehicle{
 
   double speed;

   Vehicle(double a){

      this.speed = a;

   }

   void display(){

       System.out.println("Speed : " + speed + " km/hr");

   }

}

class Bike extends Vehicle{

   int engine_capacity;

   Bike(double a, int b){

      super(a);
      this.engine_capacity = b;

   }

   void display(){

       super.display();
       System.out.println("Engine Capacity : " + engine_capacity + " cc");

   }

}

class Both{

  public static void main(String[] args){

     Vehicle v = new Bike(45,1600);

     v.display();


  }



}