package student;
import java.util.Scanner;
import result.Grade_info;

class Student_info{
 
   public static void main(String[] args){

      Scanner scanner = new Scanner(System.in);
    
      Grade_info g = new Grade_info();
  
      System.out.print("Student name : ");
      String name = scanner.nextLine();


      System.out.print("Student mark : ");
      int mark = scanner.nextInt();

      g.grade(name, mark);


   }

}