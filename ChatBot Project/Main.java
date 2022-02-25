import java.util.Scanner;
public class Main{
  //creating a static ryan reynolds object so its accessible by all methods
  static RyanReynolds r = new RyanReynolds();
    public static void main(String[] args){
       //This is an example of how to access a movie that ryan reynolds is in
        
        System.out.println("Hello, this is an example: \n" + r.getDeadpool().toString());

        //prompt for user and creating scanner
        System.out.println("Hello how are you?");
        Scanner sc = new Scanner(System.in);

        //initializing user input string
        String userInput;
        //initializing engaged boolean to continually get user input until user is not engaged and ends conversation
        boolean engaged = false;

        //while engaged, continually ask for user input and store it
        while (!engaged) {
          //grab user input
          userInput = sc.nextLine();
          //if the user input equals end, then engaged is set to true, the scanner closes, and we break from the loop to end conversation
          //otherwise we continually ask for user input
          if (userInput.equals("End")) {
            sc.close();
            engaged = true;
            break;

          //otherwise, analyze the input and this method figures out how the chat bot responds
          }else{
            analyzeInput(userInput);
          }

        }



    }

    // this method takes in the users input and directs how the robot is going to respond by creating sub problems
    // with other methods
    public static void analyzeInput(String userInput){
     
        if(userInput.contains("Who") || userInput.contains("who")){
        whoResponse(userInput);
        
        } else if(userInput.contains("What")|| userInput.contains("what")){
        whatResponse(userInput);
        
        } else if(userInput.contains("Where")|| userInput.contains("where")){
        whereResponse(userInput);
        
         } else if(userInput.contains("When")|| userInput.contains("when")){
        whenResponse(userInput);
        
         }else if (userInput.contains("How")|| userInput.contains("how")){
        howResponse(userInput);
        
         }else{
        defaultResponse(userInput);
        
         }

      }
    
    


    /*
    public static void analyzeInput(String userInput){
      switch(userInput){
        case (userInput.contains("Who") || userInput.contains("who")):
        whoResponse(userInput);
        break;

        case (userInput.contains("What")|| userInput.contains("what")):
        whatResponse(userInput);
        break;

        case (userInput.contains("Where")|| userInput.contains("where")):
        whereResponse(userInput);
        break;

        case (userInput.contains("When")|| userInput.contains("when")):
        whenResponse(userInput);
        break;

        case (userInput.contains("How")|| userInput.contains("how")):
        howResponse(userInput);
        break;

        //add these into the who what where when how as another filtering mechanism
        // case (userInput.contains("Personal")):
        // personalResponse(userInput);
        // break;

        // case (userInput.contains("?")):
        // askAQuestionResponse(userInput);
        // break;

        default:
        defaultResponse(userInput);
        break;

      }

    }
    */

    public static void whoResponse(String userInput){



    }

    public static void whatResponse(String userInput){
      System.out.println("Deadpool earned $" + r.getDeadpool().getBoxOffice());

    }

    public static void whereResponse(String userInput){

    }

    public static void whenResponse(String userInput){

    }

    public static void howResponse(String userInput){

    }

    public static void personalResponse(String userInput){

    }

    public static void askAQuestionResponse(String userInput){

    }

    public static void defaultResponse(String userInput){

    }
}
