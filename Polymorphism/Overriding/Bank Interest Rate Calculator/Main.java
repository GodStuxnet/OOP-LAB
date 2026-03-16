abstract class Bank{
   
    void display(){}

}

class SBI extends Bank{

       double interest;

       SBI(double a){

           this.interest = a;

       }
   
       @Override
       void display(){
 
          System.out.println("Bank Interest of SBI : " + interest);

       }

}
 

class ICICI extends Bank{
   
       double interest;

       ICICI(double a){

          this.interest = a;

       }

       @Override
       void display(){
 
          System.out.println("Bank Interest of ICICI : " + interest);

       }

}

class HDFC extends Bank{
   
       double interest;

       HDFC(double a){

          this.interest = a;

       }

       @Override
       void display(){
 
          System.out.println("Bank Interest of HDFC : " + interest);

       }

}


class Main{

   public static void main(String[] args){

       Bank b = new SBI(78);
       Bank c = new ICICI(50);
       Bank d = new HDFC(60);

       b.display();
       c.display();
       d.display();
       


   }




}
