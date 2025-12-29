import java.util.Scanner;

class Data_Types{
  
   public static void main(String[] args){

       Scanner scanner = new Scanner(System.in);

       String name;
       char currency = '$';
       String colour;
       String car;
       byte age;
       Double price;
       short discount;
       boolean buy;

       System.out.print("Enter your name : ");
       name = scanner.nextLine();

       System.out.print("Enter your age : ");
       age = scanner.nextByte();

       scanner.nextLine();
       System.out.print("Enter your favourite colour: ");
       colour = scanner.nextLine();


       System.out.print("Enter your favourite car: ");
       car = scanner.nextLine();


       System.out.print("Enter the price of the car : ");
       price = scanner.nextDouble();


       scanner.nextLine();
       System.out.print("Enter the discount of that car : ");
       discount = scanner.nextShort();

       
       scanner.nextLine();
       System.out.print("You want to buy the car(True/False) : ");
       buy = scanner.nextBoolean();

       System.out.println();
       System.out.println("Hello!, " + name);
       System.out.println("You are " + age + " years old");

       Double total = price - discount;
       
       if(buy){

          System.out.println("And Congratulation! you have owned " + colour +  " " + car + " for " + currency +  total );

       }

       else{

          System.out.println("Thanks for comming!  have a nice day!");

       }


   }


}