class Overloading{

   //Addition
   void calculator(int a, int b){

         int add = a+b;
         System.out.println("Additon : "+ add);

   }

   //Subtraction
   void calculator(int a, int b, int c){

         int sub = a-b;
         System.out.println("Subtraction : " + sub);

   }

   //Multiplication
   void calculator(double a, double b){

        double mul = a*b;
        System.out.println("Multiplication : "+  mul);

   }

   //Division
   void calculator(double a, int b){

        double div = a/b;
        System.out.println("Division : " +  div);

   }

  

   public static void main(String[] args){

           Overloading cal = new Overloading();


           cal.calculator(1,2);
           cal.calculator(1,2,0);
           cal.calculator(5.0,7.0);
           cal.calculator(4.0,2);

   }


}