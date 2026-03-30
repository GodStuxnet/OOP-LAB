import java.util.Scanner;

interface Command{

   void execute(String a);

}


interface Redo{

   void redo(int b);

}

interface Undo{

   void undo(int c);

}

public class Main implements Command,Undo{

      static String write;
      static String undo;
      static String redo;

      Scanner scanner = new Scanner(System.in);

      public void execute(String a){
        
         write = a;
         System.out.println("Notepad : " + write);

      }

      public void undo(int c){

         int num1 = c;
         undo = "";
         for(int i = 0; i < write.length() - num1 ; i++){

              undo += write.charAt(i);

         }

         System.out.println("Notepad : " + undo);

      }

      public void redo(int d){

         int num2 = d;
         redo = undo;

         for(int i= undo.length()-1; i < undo.length()+num2; i++){

              redo  += write.charAt(i);

         }

         System.out.println("Notepad : " + redo);

      }
  
      public static void main(String[] args){
   
                Main m = new Main();
      		System.out.print("Enter the statement : ");
      		String word = m.scanner.nextLine();
          
      		m.execute(word);

                System.out.print("How many times you want to undo : ");
                int num3 = m.scanner.nextInt();

                m.undo(num3);
                
                System.out.print("How many times you want to redo : ");
                int num4 = m.scanner.nextInt();

                m.redo(num4);


      }

}