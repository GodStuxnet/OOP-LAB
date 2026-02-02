import java.util.*;
class Library_Program{

   static Scanner scanner = new Scanner(System.in);
   static String book;
   static String action;

   public static void main(String args[]){
 
         System.out.println("\n******************");
         System.out.println("  Amrita Library  ");
         System.out.println("******************\n");

         System.out.print("Enter Issuing/Receiving : ");
         action = scanner.nextLine();

         last(action);
        
   }

   static void last(String act){

              if(act.equalsIgnoreCase("Issuing") || act.equalsIgnoreCase("Issue")){
                 
                   System.out.print("Enter the book name : ");
                   book = scanner.nextLine();

                   System.out.println("\nBook is found");
                   System.out.println("Book is issued");
              }

              else if(act.equalsIgnoreCase("Receiving") || act.equalsIgnoreCase("Receive")){

                   System.out.print("Enter the book name : ");
                   book = scanner.nextLine();

                   System.out.println("\nBook is found");
                   System.out.println("Book is received");


              }

              else{

                     System.out.println("Enter the correct choice");

              }

              
    }

}