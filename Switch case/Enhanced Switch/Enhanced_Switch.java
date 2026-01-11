import java.util.Scanner;
class Enhanced_Switch{

    public static void main(String[] args){

       //Enhanced switch = A replacement to many else if statements (Java14 feature)

       Scanner scanner = new Scanner(System.in);
       String day;

       System.out.print("Enter the day of the week : ");
       day = scanner.nextLine();

       switch(day){
          //if(day == "Monday") == switch(day){case "Monday"}
          //                       here it is assigning like : day(in switch) = "Monday"(in case)

          case "Monday","Tuesday","Wednesday","Thursday","Friday" -> System.out.println("It is a weekday");
          case "Saturday","Sunday" -> System.out.println("It is a weekend");
          /*
          case "Monday" -> System.out.println("It is a weekday");
          case "Tuesday" -> System.out.println("It is a weekday");
          case "Wednesday" -> System.out.println("It is a weekday");
          case "Thursday" -> System.out.println("It is a weekday");
          case "Friday" -> System.out.println("It is a weekday");
          case "Saturnday" -> System.out.println("It is a weekend");
          case "Sunday" -> System.out.println("It is a weekend");
          */
          default -> System.out.println(day + " is not a day!");

 
       }


    }

}