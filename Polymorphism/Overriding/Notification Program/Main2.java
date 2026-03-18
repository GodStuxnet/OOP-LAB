abstract class Notification{
   
    void send(){}

}

class Email extends Notification{

       @Override
       void send(){
 
          System.out.println("You got an Email!!!");

       }

}
 

class SMS extends Notification{

       @Override
       void send(){
 
          System.out.println("You got an SMS!!!");

       }

}

class Call extends Notification{

       @Override
       void send(){
 
          System.out.println("You got an Call!!!");

       }

}


class Main2{

   public static void main(String[] args){

       Notification b = new Email();
       Notification c = new SMS();
       Notification d = new Call();

       b.send();
       c.send();
       d.send();
       


   }




}
