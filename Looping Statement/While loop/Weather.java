import java.util.Scanner;

class Weather{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String temp = "0";
        String weather = "Sunny";
        boolean check = true;
        String again;
        boolean execute = false;
        
        do{
           
           while(check){

                System.out.print("Enter the temperature (in Celsius) : ");
                temp = scanner.nextLine();

                if(temp.matches(".*\\p{Punct}.*") ||temp.matches(".*[a-zA-Z].*")){            
                    check = true;
                }

                else if(temp.isEmpty()){
                    System.out.println("You didn't enter the temperature !");
                }

                else{
  
                    check = false;
                }
           }

           if(Integer.parseInt(temp) >= 28 && Integer.parseInt(temp) <= 35){
                      weather = "Sunny";
               }
     
           else if(Integer.parseInt(temp) >= 22 && Integer.parseInt(temp) <= 27){
                      weather = "Cloudy";
               }
               
           else if(Integer.parseInt(temp) >= 15 && Integer.parseInt(temp) <= 21){
                      weather = "Rainy";
               }
 
           else if(Integer.parseInt(temp) < 15){
                      weather = "Too Cold (Snow)!";
               }

            else if(Integer.parseInt(temp) > 35){
                      weather = "Too Hot !";
               }
           
               
             System.out.println(weather);
             System.out.print("You want to check weather again ? (Yes/No) : ");
             again = scanner.nextLine();

             if(again.equalsIgnoreCase("Yes")){
               
                     execute = true;   
                     check = true;       

             }
   
             else{
                    
                     execute = false;
                     System.out.println("See you next time ! bye !");

            }

           }while(execute);

    }

}