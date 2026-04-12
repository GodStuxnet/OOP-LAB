package result;

public class Grade_info{

   public void grade(String a, int b){

      if(b >= 50){

        System.out.println(a + " passed the exam !!");
        
        if(b >= 50 && b < 60){

           System.out.println("Grade : B");

        }

        else if(b >= 60 && b < 70){

           System.out.println("Grade : B+");

        }

        else if(b >= 70 && b < 80){

           System.out.println("Grade : A");

        }

        else if(b >= 80 && b < 90){

           System.out.println("Grade : A+");

        }

        else{

           System.out.println("Grade : O");

        }


      }


      else{

         System.out.println(a + " failed the exam !!!");

      }


   }

}