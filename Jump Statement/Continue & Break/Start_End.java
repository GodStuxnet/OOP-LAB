import java.util.Scanner;

class Start_End{

  public static void main(String[] args){

     Scanner scanner = new Scanner(System.in);

     int start;
     int end;

     System.out.print("Enter the starting number : ");
     start = scanner.nextInt();

     System.out.print("Enter the ending number : ");
     end = scanner.nextInt();

     Number(start,end);
    
     scanner.close();

  }


  static void Number(int start,int end){

     System.out.println("\nNumbers : ");
     for(int i=start;i<end+1;i++){

         if(i==16){
     
               break;

         }

         else if(i%4 == 0){

               continue;

         }

        System.out.println(i);

    }

 }

}