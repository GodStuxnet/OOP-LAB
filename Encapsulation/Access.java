class Bank_Account{

  private double balance;

  public void setBalance(double a){
 
      if(a >= 0){

          balance = a; 

      }

      else{
         
          System.out.println("Invalid balance !!!");

      }

  }

  public void Deposit(double a){
   
    if(a >= 0){

     	balance += a;
     	System.out.println("Deposit amount : " + a);
     	System.out.println("Updated Balance : " + balance + "\n");

    }

    else{

        System.out.println("You cannot deposit the amount !!!");

    }

  }

  public void Withdraw(double b){

      if(balance > 0 && b > 0 && b <= balance){

          	balance -= b;
       	  	System.out.println("Withdraw Amount : " + b);
          	System.out.println("Updated balance : " + balance);

      }

      else{

         System.out.println("You cannot withdraw the amount !!!");

      }
       

  }

  public double getBalance(){

        return balance;

  }


}


class Access{

   public static void main(String[] args){

       Bank_Account bank = new Bank_Account();
 
       bank.setBalance(5000);
       bank.Deposit(2000);
       bank.Withdraw(1000);
       
       System.out.println("\n" + "Bank balance : " + bank.getBalance());

   }


}