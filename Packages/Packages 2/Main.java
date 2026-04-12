import java.util.Scanner;
import mathoperations.Addition;

class Main{

  public static void main(String[] args){

      Addition add = new Addition();
     
      Scanner scanner = new Scanner(System.in);
   
      System.out.print("Enter the number 1 : ");
      int a = scanner.nextInt();


      System.out.print("Enter the number 2 : ");
      int b = scanner.nextInt();

      System.out.println("Addition : " + add.add(a,b));


  }

}