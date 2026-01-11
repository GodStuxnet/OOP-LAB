import java.util.Scanner;
class Calculator{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
       
        double num1;
        double num2;
        double result = 0;
        String operator;
        boolean value = true;

        System.out.print("Enter the number 1 : ");
        num1 = scanner.nextDouble();
          
        scanner.nextLine();
        System.out.print("Enter the operator : ");
        operator = scanner.nextLine();

        System.out.print("Enter the number 2 : ");
        num2 = scanner.nextDouble();
        
        switch(operator){

          case "+" -> result = num1 + num2;
          case "-" -> result = num1 - num2;
          case "*" -> result = num1*num2;
          case "/" -> {
                   
                 if(num2 == 0){

                     System.out.println("Cannot divide by zero !");
                     value = false;

                 }

                 else{
                        
                      result = num1/num2;
                
                 }

          }
  
          case "^" -> result = Math.pow(num1,num2);
          
          default ->{
 
               System.out.println("Invalid Operator");
               value = false;

          }

        };

        if(value){

                System.out.println(result);
 
       }

    }

}