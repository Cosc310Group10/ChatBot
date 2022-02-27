import java.util.Scanner;
public class Main{
    public static void main(String[] args){
       //This is an example of how to access a movie that ryan reynolds is in
        RyanReynolds r = new RyanReynolds();
        System.out.println("Hello, this is an example: \n" + r.getDeadpool().toString());

        //prompt for user and creating scanner
        System.out.println("Ask your question:");
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
          }
          //call analyze function
          System.out.println(r.respond(userInput));
        }



    }
}
