package banking;

public class Account{

  private double balance;

  public Account(double a){

     this.balance = a;

  }

  private void showbalance(){

     System.out.println("Balance : " + balance);

  }

  protected void deposit(double amount){

      balance += amount;
      System.out.println("Deposite amount : " + amount);
      System.out.println("Updated balance : " + balance);

  }

  public void displayAccountInfo(double amount){

      System.out.println("Account information : ");
      showbalance();
      deposit(amount);
 
  }


}