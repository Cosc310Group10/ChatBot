import java.util.Scanner;
public class Main{
  //creating a static ryan reynolds object so its accessible by all methods
  static RyanReynolds r = new RyanReynolds("6'2", 185,"Brown","Brown","Male","N/A","2022-02-06","Blake Lively","social media handle","NetWorth","ex wife",null);
    public static void main(String[] args){
       //This is an example of how to access a movie that ryan reynolds is in
        
        System.out.println("Hello, this is an example: \n" + r.getDeadpool().toString());

        //prompt for user and creating scanner
        System.out.println("Hello! I am Ryan Reynolds, but in chat bot form...\nAsk me a question about myself or my movies!");
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
            System.out.println("Goodbye! Nice meeting you!");
            sc.close();
            engaged = true;
            break;

          //otherwise, analyze the input and this method figures out how the chat bot responds
          }else{
            analyzeInput(userInput);
          }

        }


        //example questions:
        /*
        Testing questions:
        1.) Who is your wife?
        2.) How many kids do you have?
        3.) What are some of the movies you have been in?
        4.) Have you ever acted in a movie with your current wife?
        5.) What was deadpools box office profit?
        6.) 

        1.) What are some movies you have been in?
        2.) What is your highest rated movie
        3.) How many deadpool movies are there?
        */


    }

    // this method takes in the users input and directs how the robot is going to respond by creating sub problems
    // with other methods
    public static void analyzeInput(String userInput){
     
      if(userInput.contains("Hi") || userInput.contains("hi")|| userInput.contains("Hey") || userInput.contains("hey") || userInput.contains("Hello") || userInput.contains("hello")){
          greetingResponse(userInput);

      }else if(userInput.contains("Who") || userInput.contains("who")){
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
    
    


    //------------------------------------------------------------------------------------------------------------------

      public static void greetingResponse(String userInput){

        int randomNumber = (int)(Math.random()*11);

        switch(randomNumber){
          case 0:
          System.out.println("Hello!");
          break;
          case 1:
          System.out.println("Hey Hey!");
          break;
          case 2:
          System.out.println("Hi there");
          break;
          case 3:
          System.out.println("Bon.. jo.. jour.. haha, Hi how are ya!");
          break;
          case 4:
          System.out.println("Hello there");
          break;
          case 5:
          System.out.println("Hey! I am Ryan Reynolds, nice to meet you!");
          break;
          case 6:
          System.out.println("What a beautiful day to meet someone as great as me hey?");
          break;
          case 7:
          System.out.println("Yo!");
          break;
          case 8:
          System.out.println("Hey there");
          break;
          case 9:
          System.out.println("Hi, nice to meet you!");
          break;
          case 10:
          System.out.println("Hola!");
          break;
          default:
        }


      }


    public static void whoResponse(String userInput){
       // Here we check if the who question contains any of the movie names, if so,
      // then we respond using the who responses for movie questions
      whoMovieResponse(userInput);

      // Otherwise, we check if the what question is about his personal attributes and if so we respond with the
      // what responses for personal questions
      whoPersonalResponse(userInput);



// ***************************************
// I am thinking to move the askAQuestion into the personal questions considering the user or fan will have not been in any movies
//but could respond to the personal questions



      // This methods lets the chat bot have a 50/50 chance of asking the user the same question back or
      // asking a different question to the user
      askAQuestionResponse(userInput);



    }

    public static void whatResponse(String userInput){

      // Here we check if the what question contains any of the movie names, if so,
      // then we respond using the what responses for movie questions
      whatMovieReponse(userInput);

      // Otherwise, we check if the what question is about his personal attributes and if so we respond with the
      // what responses for personal questions
      whatPersonalResponse(userInput);

      // This methods lets the chat bot have a 50/50 chance of asking the user the same question back or
      // asking a different question to the user
      askAQuestionResponse(userInput);
      

    }

    public static void whereResponse(String userInput){

       // Here we check if the where question contains any of the movie names, if so,
      // then we respond using the where responses for movie questions
      whereMovieReponse(userInput);

      // Otherwise, we check if the where question is about his personal attributes and if so we respond with the
      // where responses for personal questions
      whatPersonalResponse(userInput);

      // This methods lets the chat bot have a 50/50 chance of asking the user the same question back or
      // asking a different question to the user
      askAQuestionResponse(userInput);

    }

    public static void whenResponse(String userInput){
       // Here we check if the when question contains any of the movie names, if so,
      // then we respond using the when responses for movie questions
      whenMovieReponse(userInput);

      // Otherwise, we check if the when question is about his personal attributes and if so we respond with the
      // when responses for personal questions
      whenPersonalResponse(userInput);

      // This methods lets the chat bot have a 50/50 chance of asking the user the same question back or
      // asking a different question to the user
      askAQuestionResponse(userInput);

    }

    public static void howResponse(String userInput){
       // Here we check if the how question contains any of the movie names, if so,
      // then we respond using the how responses for movie questions
      howMovieResponse(userInput);

      // Otherwise, we check if the what question is about his personal attributes and if so we respond with the
      // what responses for personal questions
      howPersonalResponse(userInput);

      // This methods lets the chat bot have a 50/50 chance of asking the user the same question back or
      // asking a different question to the user
      askAQuestionResponse(userInput);

    }

    

    public static void askAQuestionResponse(String userInput){
      int random = (int) (Math.random()*3); //1/3 of the time the chat bot asks a question back to the user

      if(random == 1){
        System.out.println("\nHow about you?");
      }else{
        return;
      }

    }

    

    public static void defaultResponse(String userInput){
      //If all else fails and the chat bot does not not how to respond, we have this statement set as
      // the chat bot's default response to a question it does not know

      System.out.println("Sorry, I am unsure of how to respond to this question");
      System.out.println("Please ask me another question about my life or my movies, I would be happy to answer!");

    }



    //------------------------------------------------------------------------------------------------------------------
    //below are the movie responses depending if the question asked from the user contains who what where when and how


    public static void whoMovieResponse(String userInput){

      if(userInput.contains("movie") || userInput.contains("movies")){

      }else if(userInput.contains("deadpool") || userInput.contains("Deadpool")){


      }else if(userInput.contains("deadpool 2") || userInput.contains("Deadpool 2")){


      }else if(userInput.contains("free guy") || userInput.contains("Free Guy")){


      }else if(userInput.contains("r.i.p.d") || userInput.contains("R.I.P.D")){


      }else if(userInput.contains("green lantern") || userInput.contains("buried")){


      }else if(userInput.contains("6 underground") || userInput.contains("6 Underground")){


      }else if(userInput.contains("red notice") || userInput.contains("Red Notice")){


      }else{
        return;
      }
    }


    public static void whatMovieReponse(String userInput){


      if(userInput.contains("movie") || userInput.contains("movies")){

      }else if(userInput.contains("deadpool") || userInput.contains("Deadpool")){
        System.out.println("Deadpools box office is $" + r.getDeadpool().getBoxOffice());


      }else if(userInput.contains("deadpool 2") || userInput.contains("Deadpool 2")){


      }else if(userInput.contains("free guy") || userInput.contains("Free Guy")){


      }else if(userInput.contains("r.i.p.d") || userInput.contains("R.I.P.D")){


      }else if(userInput.contains("green lantern") || userInput.contains("buried")){


      }else if(userInput.contains("6 underground") || userInput.contains("6 Underground")){


      }else if(userInput.contains("red notice") || userInput.contains("Red Notice")){


      }else{
        defaultResponse(userInput);
      }
    }

    public static void whereMovieResponse(String userInput){
      if(userInput.contains("movie") || userInput.contains("movies")){

      }else if(userInput.contains("deadpool") || userInput.contains("Deadpool")){


      }else if(userInput.contains("deadpool 2") || userInput.contains("Deadpool 2")){


      }else if(userInput.contains("free guy") || userInput.contains("Free Guy")){


      }else if(userInput.contains("r.i.p.d") || userInput.contains("R.I.P.D")){


      }else if(userInput.contains("green lantern") || userInput.contains("buried")){


      }else if(userInput.contains("6 underground") || userInput.contains("6 Underground")){


      }else if(userInput.contains("red notice") || userInput.contains("Red Notice")){


      }else{
        defaultResponse(userInput);
      }

    }

    public static void whenMovieResponse(String userInput){
      if(userInput.contains("movie") || userInput.contains("movies")){

      }else if(userInput.contains("deadpool") || userInput.contains("Deadpool")){


      }else if(userInput.contains("deadpool 2") || userInput.contains("Deadpool 2")){


      }else if(userInput.contains("free guy") || userInput.contains("Free Guy")){


      }else if(userInput.contains("r.i.p.d") || userInput.contains("R.I.P.D")){


      }else if(userInput.contains("green lantern") || userInput.contains("buried")){


      }else if(userInput.contains("6 underground") || userInput.contains("6 Underground")){


      }else if(userInput.contains("red notice") || userInput.contains("Red Notice")){


      }else{
        defaultResponse(userInput);
      }

    }

    public static void howMovieResponse(String userInput){
      if(userInput.contains("movie") || userInput.contains("movies")){

      }else if(userInput.contains("deadpool") || userInput.contains("Deadpool")){


      }else if(userInput.contains("deadpool 2") || userInput.contains("Deadpool 2")){


      }else if(userInput.contains("free guy") || userInput.contains("Free Guy")){


      }else if(userInput.contains("r.i.p.d") || userInput.contains("R.I.P.D")){


      }else if(userInput.contains("green lantern") || userInput.contains("buried")){


      }else if(userInput.contains("6 underground") || userInput.contains("6 Underground")){


      }else if(userInput.contains("red notice") || userInput.contains("Red Notice")){


      }else{
        return;
      }

    }

    //------------------------------------------------------------------------------------------------------------------
    //below are the personal responses depending if the question asked from the user contains who what where when and how


    public static void whoPersonalResponse(String userInput){

      if(userInput.contains("Wife") || userInput.contains("wife")){
        System.out.println("My wife is " + r.getwifeName());
      }

    }


    public static void whatPersonalResponse(String userInput){


     
    }

    public static void wherePersonalResponse(String userInput){

    }

    public static void whenPersonalResponse(String userInput){

    }

    public static void howPersonalResponse(String userInput){
      if(userInput.contains("Kids") || userInput.contains("kids")){
        System.out.println("I have __ kids");
        // System.out.println("I have 2 kids" + r.getKids());
      }

    }



}
