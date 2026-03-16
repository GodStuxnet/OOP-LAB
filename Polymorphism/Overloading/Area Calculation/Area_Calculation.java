import java.lang.Math;
class Area_Calculation{
 
   double area(int a){

        double area = a*a;
        return area;

   }

   double area(int a, int b){

       double area = a*b;
       return area;

   }

   double area(double a){

      double area = Math.PI*(Math.pow(a,2));
      return area;

   }

   public static void main(String[] args){

        Area_Calculation pd = new Area_Calculation();

        System.out.println("Area of Square : " + pd.area(3));
        System.out.println("Area of Rectangle : " + pd.area(3,5));
        System.out.println("Area of Circle : " + pd.area(9.0));

   }


}