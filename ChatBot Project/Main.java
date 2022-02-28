// GROUP 10 COSC 310 Main Class

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main{


  //creating a static ryan reynolds object so its accessible by all methods
  static RyanReynolds r = new RyanReynolds();
    public static void main(String[] args){


       
        // a cool feature saying the chatbot is booting up for a delay of 2 seconds
        System.out.println("Ryan Reynolds Chat bot booting up...");
        try{
        TimeUnit.SECONDS.sleep(2); //delaying the program for 2 seconds
        }catch (Exception e){
          System.out.println("Error Occurred"); //catching an error 
        }
         //prompt for user and creating scanner
        System.out.println("Hello! Nice to meet you! I am Ryan Reynolds, but in chat bot form...\nAsk me a question about myself or my movies!");


        Scanner sc = new Scanner(System.in);
        

        //initializing user input string
        String userInput;
        //initializing engaged boolean to continually get user input until user is not engaged and ends conversation
        boolean engaged = false;

        //while engaged, continually ask for user input and store it
        while (!engaged) {
          //grab user input
          userInput = sc.nextLine().toLowerCase();
          
          //if the user input equals end, then engaged is set to true, the scanner closes, and we break from the loop to end conversation
          //otherwise we continually ask for user input
          if (userInput.equals("End")) {
            System.out.println("Goodbye! Nice meeting you!");
            sc.close();
            engaged = true;
            break;

          //otherwise, call the chatbot function which calls the analyze function
          // which analyzes the input and then the method figures out how the chat bot responds
          }else{
            chatBot(userInput);
          }

        }




    }

    //------------------------------------------------------------------------------------------------------------------
    //below is the chatbot and analyze function methods to determine chatbots reponse

    // this method is the chatbot method which calls the analyze function method to determine the chatbot response
    public static void chatBot(String userInput){
      analyzeInput(userInput);
    }


    // this method takes in the users input and directs how the robot is going to respond by creating sub problems to solve
    // with other methods
    public static void analyzeInput(String userInput){
     
      if(userInput.contains("hi")|| userInput.contains("hey") || userInput.contains("hello")){
          greetingResponse(userInput);

      }else if(userInput.contains("who")){
        whoResponse(userInput);
        
        } else if(userInput.contains("what")){
        whatResponse(userInput);
        
        } else if(userInput.contains("where")){
        whereResponse(userInput);
        
         } else if(userInput.contains("when")){
        whenResponse(userInput);
        
         }else if (userInput.contains("how")){
        howResponse(userInput);
        
         }else{
        defaultResponse(userInput);
        
         }

      }
    
    


    //------------------------------------------------------------------------------------------------------------------
      //below is the greeting method

    // this is the greeting method, this method generates a randopm number from 0 to 10 and determines how the chatbot would
    // respond to the user saying hello
      public static void greetingResponse(String userInput){

        //generate random number from 0 to 10
        int randomNumber = (int)(Math.random()*11);

        //switch statement to determine responses
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
          System.out.println("Hi how are ya!");
          break;
          case 4:
          System.out.println("Hello there");
          break;
          case 5:
          System.out.println("Hey! I am Ryan Reynolds, nice to meet you!");
          break;
          case 6:
          System.out.println("What a beautiful day to meet someone as great as me hey? Haha, Hi nice to meet you!");
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
          System.out.println("Hey!");
          break;
          default:
          return;

        }


      }

 //------------------------------------------------------------------------------------------------------------------
 //below are the methods to determine if the question being asked is a who what where when or how question

    public static void whoResponse(String userInput){
       // Here we check if the who question contains any of the movie names, if so,
      // then we respond using the who responses for movie questions
      whoMovieResponse(userInput);

      // Otherwise, we check if the what question is about his personal attributes and if so we respond with the
      // what responses for personal questions
      whoPersonalResponse(userInput);

    }

    public static void whatResponse(String userInput){

      // Here we check if the what question contains any of the movie names, if so,
      // then we respond using the what responses for movie questions
      whatMovieReponse(userInput);

      // Otherwise, we check if the what question is about his personal attributes and if so we respond with the
      // what responses for personal questions
      whatPersonalResponse(userInput);

    }

    public static void whereResponse(String userInput){

       // Here we check if the where question contains any of the movie names, if so,
      // then we respond using the where responses for movie questions
      whereMovieResponse(userInput);

      // Otherwise, we check if the where question is about his personal attributes and if so we respond with the
      // where responses for personal questions
      whatPersonalResponse(userInput);


    }

    public static void whenResponse(String userInput){
       // Here we check if the when question contains any of the movie names, if so,
      // then we respond using the when responses for movie questions
      whenMovieResponse(userInput);

      // Otherwise, we check if the when question is about his personal attributes and if so we respond with the
      // when responses for personal questions
      whenPersonalResponse(userInput);


    }

    public static void howResponse(String userInput){
       // Here we check if the how question contains any of the movie names, if so,
      // then we respond using the how responses for movie questions
      howMovieResponse(userInput);

      // Otherwise, we check if the what question is about his personal attributes and if so we respond with the
      // what responses for personal questions
      howPersonalResponse(userInput);


    }

    
  //------------------------------------------------------------------------------------------------------------------
    //below is the ask a question method which determines if the bot asks the question back to the user

    public static void askAQuestionResponse(String userInput){
      int random = (int) (Math.random()*3); // 1/3 of the time the chat bot asks a question back to the user

      if(random == 1){
        System.out.println("\nHow about you?");
      }else{
        return;
      }

    }

     //------------------------------------------------------------------------------------------------------------------
    //below are is the deafult response depending if the question asked from the user is not understandable by the chatbot

     //this is a method that is called as a default response if the chat bot is unable to determine how to respond
    public static void defaultResponse(String userInput){
      //If all else fails and the chat bot does not not how to respond, we have this statement set as
      // the chat bot's default response to a question it does not know

      System.out.println("Sorry, I am unsure of how to respond to this question");
      System.out.println("Please ask me another question about my life or my movies, I would be happy to answer!");

    }



    //------------------------------------------------------------------------------------------------------------------
    //below are the movie responses depending if the question asked from the user contains who what where when and how

    // This is the who movie response method which determines responses for who questions about movies
    public static void whoMovieResponse(String userInput){

      if(userInput.contains("movie") || userInput.contains("movies")){
        // add your content here

      }else if(userInput.contains("deadpool")){
        // add your content here

      }else if(userInput.contains("deadpool 2")){
        // add your content here

      }else if(userInput.contains("free guy")){
        // add your content here

      }else if(userInput.contains("r.i.p.d")){
        // add your content here

      }else if(userInput.contains("green lantern")){
        // add your content here

      }else if(userInput.contains("6 underground")){
        // add your content here

      }else if(userInput.contains("red notice")){
        // add your content here

      }else{
        return;
      }
    }

// This is the what movie response method which determines responses for what questions about movies
    public static void whatMovieReponse(String userInput){


      if(userInput.contains("movie") || userInput.contains("movies")){
        // add your content here

      }else if(userInput.contains("deadpool")){
        // add your content here

      }else if(userInput.contains("deadpool 2")){
        // add your content here

      }else if(userInput.contains("free guy")){
        // add your content here

      }else if(userInput.contains("r.i.p.d")){
        // add your content here

      }else if(userInput.contains("green lantern")){
        // add your content here

      }else if(userInput.contains("6 underground")){
        // add your content here

      }else if(userInput.contains("red notice")){
        // add your content here

      }else{
        return;
      }
    }

    // This is the where movie response method which determines responses for where questions about movies
    public static void whereMovieResponse(String userInput){

      if(userInput.contains("movie") || userInput.contains("movies")){
        System.out.println("My favourite place to shoot a movie is Vancouver!");

      }else if(userInput.contains("deadpool")){
        System.out.println("We filmed Deadpool in "+r.getDeadpool().getLocation());

      }else if(userInput.contains("deadpool 2")){
        System.out.println("We filmed Deadpool 2 in "+r.getDeadpool2().getLocation());

      }else if(userInput.contains("free guy")){
        System.out.println("We filmed Free Guy in "+r.getFreeGuy().getLocation());

      }else if(userInput.contains("r.i.p.d")){
         System.out.println("We filmed R.I.P.D. in "+r.getRIPD().getLocation());

      }else if(userInput.contains("green lantern")){
        System.out.println("We filmed Green Lantern in "+r.getGreenLantern().getLocation());

      }else if(userInput.contains("6 underground")){
        System.out.println("We filmed 6 Underground in "+r.getSixUnderground().getLocation());

      }else if(userInput.contains("red notice")){
        System.out.println("We filmed Red Notice in "+r.getRedNotice().getLocation());

      }else{
        return;
      }

    }

    // This is the when movie response method which determines responses for when questions about movies
    public static void whenMovieResponse(String userInput){
     if(userInput.contains("movie") || userInput.contains("movies")){
        // add your content here

      }else if(userInput.contains("deadpool")){
        // add your content here

      }else if(userInput.contains("deadpool 2")){
        // add your content here

      }else if(userInput.contains("free guy")){
        // add your content here

      }else if(userInput.contains("r.i.p.d")){
        // add your content here

      }else if(userInput.contains("green lantern")){
        // add your content here

      }else if(userInput.contains("6 underground")){
        // add your content here

      }else if(userInput.contains("red notice")){
        // add your content here

      }else{
        return;
      }

    }


    // This is the how movie response method which determines responses for how questions about movies
    public static void howMovieResponse(String userInput){
      if(userInput.contains("movie") || userInput.contains("movies")){
        // add your content here

      }else if(userInput.contains("deadpool")){
        // add your content here

      }else if(userInput.contains("deadpool 2")){
        // add your content here

      }else if(userInput.contains("free guy")){
        // add your content here

      }else if(userInput.contains("r.i.p.d")){
        // add your content here

      }else if(userInput.contains("green lantern")){
        // add your content here

      }else if(userInput.contains("6 underground")){
        // add your content here

      }else if(userInput.contains("red notice")){
        // add your content here

      }else{
        return;
      }

    }

    //------------------------------------------------------------------------------------------------------------------
    //below are the personal responses depending if the question asked from the user contains who what where when and how


    // This is the who personal response method which determines responses for who questions about the chat bots personal life
    public static void whoPersonalResponse(String userInput){

      if(userInput.contains("Your text here")){
        //add your content here
      } else if(userInput.contains("Your text here")){
        //add your content here
      }else{
        return;
      }

      //this calls the ask a question response for the chatbot to ask a question back to the user
      askAQuestionResponse(userInput);

    }


    // This is the what personal response method which determines responses for what questions about the chat bots personal life
    public static void whatPersonalResponse(String userInput){

      if(userInput.contains("Your text here")){
        //add your content here
      } else if(userInput.contains("Your text here")){
        //add your content here
      }else{
        return;
      }

      //this calls the ask a question response for the chatbot to ask a question back to the user
      askAQuestionResponse(userInput);

     
    }

    // This is the where personal response method which determines responses for where questions about the chat bots personal life
    public static void wherePersonalResponse(String userInput){

      if(userInput.contains("birth place")||userInput.contains("grow up")){
        System.out.println("I was born and raised in " + r.getbirthPlace());
      }else{
        return;
      }

      //this calls the ask a question response for the chatbot to ask a question back to the user
      askAQuestionResponse(userInput);

    }

    // This is the when personal response method which determines responses for when questions about the chat bots personal life
    public static void whenPersonalResponse(String userInput){

      if(userInput.contains("Your text here")){
        //add your content here
      } else if(userInput.contains("Your text here")){
        //add your content here
      }else{
        return;
      }

      //this calls the ask a question response for the chatbot to ask a question back to the user
      askAQuestionResponse(userInput);

    }

    // This is the how personal response method which determines responses for how questions about the chat bots personal life
    public static void howPersonalResponse(String userInput){

       if(userInput.contains("Your text here")){
        //add your content here
      } else if(userInput.contains("Your text here")){
        //add your content here
      }else{
        return;
      }

      //this calls the ask a question response for the chatbot to ask a question back to the user
      askAQuestionResponse(userInput);

    }



}
