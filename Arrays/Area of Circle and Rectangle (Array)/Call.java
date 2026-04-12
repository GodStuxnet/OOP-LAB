import java.lang.*;

abstract class Shape{

  abstract void area();

}

class Circle extends Shape{

    double radius;

    Circle(double a){

        this.radius = a;

    }

    void area(){

        System.out.println("Area of a circle : " + (Math.PI*(radius*radius)));

    }

}

class Rectangle extends Shape{

    double length;
    double breath;

    Rectangle(double a, double b){

         this.length = a;
         this.breath = b;

    }


    void area(){

        System.out.println("Area of a rectangle : " + (length*breath));

    }

}

class Call{

  public static void main(String[] args){

     Shape[] A = {
 
               new Circle(5.0),
               new Rectangle(3.0,2.0),
               new Circle(2.0),
               new Rectangle(8.0,5.0)

     };

     for(Shape a : A){

           a.area();

     }


  }


}