import java.util.Scanner;

class Age_Identifier{
 
     public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
 
        String name;
        int age;
        String student;


        //Part 1 

        System.out.print("Enter your name : ");
        name = scanner.nextLine();

        System.out.print("Enter the age : ");
        age = scanner.nextInt();

        scanner.nextLine();
        System.out.print("You are a Student/Educator/Worker : ");
        student = scanner.nextLine();

        System.out.println();
        
        if(name.isEmpty()){
            
           System.out.println("You didn't enter your name");

        }

         else{
            
           System.out.println("Hello, " + name + "!");
         
         }
        


        //Part 2
      
      
        if(age >= 65){
           
           System.out.println("You are a Senior!");

        }
         
        else if(age >= 18){
           
           System.out.println("You are a adult!");

        }

        else if(age < 0){
           
           System.out.println("You haven't Yet born!");

        }

        else if(age == 0){
           
           System.out.println("You are a born now!");

        }

        else{
           
           System.out.println("You are a child!");

        }



        //Part 3
        
        if(student.isEmpty()){

            System.out.println("You didn't enter your proffesion");
          
        }

        else{

            System.out.println("Great! You are a " + student +  "! of " + age + " years old");

        }

         scanner.close();

     }


}