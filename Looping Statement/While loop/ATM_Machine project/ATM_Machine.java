import java.util.Scanner;

class ATM_Machine{

      public static void main(String[] args){

         //ATM MACHINE PROJECT

         Scanner scanner = new Scanner(System.in);
         
         String option;
         double amount = 5200;
         double withdraw;
         double deposit;
         boolean end = true;

         System.out.println("Welcome to our ABC BANK ATM\n");
         System.out.println("Your Bank Balance : " + amount);
         System.out.println("Your Minimum Balance : 1000");
         System.out.println("Choose option : ");
         System.out.println("1.Withdraw  or   2.Deposit\n");
         System.out.println("NOTE : SAY NO TO STOP THE WITHDRAWING/DEPOSITING THE AMOUNT");

         do{

                  System.out.print("Enter your choice(1/2) : ");
                  option = scanner.nextLine();


                  if(option.equals("1")){

                        System.out.print("Enter the withdrawing amount : ");
                        withdraw = scanner.nextDouble();
                        scanner.nextLine();
                        
                        if(amount-withdraw < 1000){

                                 System.out.println("You cannot withdraw ! You reached your minimum balance !");
                                 end = false;

                        }
                         
                        else{

                                 amount -= withdraw;
                                 System.out.println("Your Bank Balance : " + amount);
                                
                        }
                       

                  }

                  else if(option.equals("2")){

                        System.out.print("Enter the Depositing amount : ");
                        withdraw = scanner.nextDouble();
                        scanner.nextLine();

                        amount += withdraw;
                        System.out.println("Your Bank Balance : " + amount);

                  }

                  else if(option.equalsIgnoreCase("NO")){
                     
                         System.out.println("Thankyou for using our ABC BANK ATM !");
                         end = false;

                  }
               
                  else if(option.equals("")){

                         end = true;
                  
                  }

                  else{
                  
                         System.out.println("Enter the valid option");

                  }


       }while(end);

      }

}