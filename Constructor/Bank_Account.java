import java.util.Scanner;

class Process{

     String proc;
     Double amount;
     private double deposit;
     private double withdraw;

     //Constructor
     Process(String p,Double a){
           
       this.proc = p;
       this.amount = a;

     }
 
     public void MainProcess(Scanner scanner){

     	if(proc.equalsIgnoreCase("Deposit")){
 
             	System.out.print("Enter the deposit amount : ");
             	deposit = scanner.nextDouble();
             	amount = amount+deposit;
             	System.out.println("Amount is deposited");
             	System.out.println("The balance : " + amount);
 
     	}

     	else if(proc.equalsIgnoreCase("Withdraw")){

             	System.out.print("Enter the withdraw amount : ");
             	withdraw = scanner.nextDouble();
                amount = amount-withdraw;
                System.out.println("Amount is withdrawed");
             	System.out.println("The balance : " + amount);

     	}

        else{
        
               System.out.println("\nEnter the correct process and start the process again!!!");
               System.out.println("Thankyou!!");

        }

     }

     

}
class Bank_Account{

   protected static String Bank;
   protected static double balance;
   protected static String process;

   public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n***********************");
        System.out.println(" Welcome To ABC BANK ");
        System.out.println("***********************\n");

        System.out.print("Enter the balance amount : ");
        balance = scanner.nextDouble();
 
        scanner.nextLine();
        System.out.print("Enter your process (Deposit/withdraw) : ");
        process = scanner.nextLine();

        Process pro = new Process(process,balance);
        pro.MainProcess(scanner);

        scanner.close();

   }


}