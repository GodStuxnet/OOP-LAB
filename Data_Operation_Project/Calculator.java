import java.util.Scanner;

class Calculator{

     public static void main(String[] args){
       
         Scanner scanner = new Scanner(System.in);

         double num1;
         double num2;
         String operation;
         double Addition;
         double Subtraction;
         double Multiplication;
         double Division;


         System.out.print("Enter the number1 : ");
         num1 = scanner.nextDouble();
 

         System.out.print("Enter the number2 : ");
         num2 = scanner.nextDouble();
         
         scanner.nextLine();
         System.out.print("Enter the operation (Addition/Subtraction/Multiplication/Division) : "); 
         operation = scanner.nextLine();


         Addition = num1+num2;
         Subtraction = num1-num2;
         Multiplication = num1*num2;
         Division = num1/num2;

         if(operation.equals("Addition")){
           
           System.out.println(Addition);

         }


         else if(operation.equals("Subtraction")){
           
           System.out.println(Subtraction);

         }

         else if(operation.equals("Multiplication")){
           
           System.out.println(Multiplication);

         }

         else{

           System.out.println(Division);

         }




     }


}