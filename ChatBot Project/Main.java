import java.util.Scanner;
public class Main{
 
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    //This is an example of how to access a movie that ryan reynolds is in
        RyanReynolds r = new RyanReynolds("6'5",220, "blue","blonde","male");
        System.out.println("Hello, this is an example: \n" + r.getDeadpool().toString());
        
        //prompt for user and creating scanner
        System.out.println("Hello how are you?");
       

<<<<<<< Updated upstream
        //initializing user input string
        String userInput = null;
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
          }else if(userInput.contains("who") || userInput.contains("Who")){
            System.out.println(r.whresp(userInput)); 
            

          }

=======
    // initializing user input string
    String userInput;
    // initializing engaged boolean to continually get user input until user is not
    // engaged and ends conversation
    boolean engaged = false;

    // while engaged, continually ask for user input and store it
    while (!engaged) {
      //if the bot asked a question, reply with cool and take the input
      if(askAQuestion == true){
        userInput = sc.nextLine();
        System.out.println("Cool!");
      }
      //then reset question to false
      askAQuestion = false;
      // grab user input
      userInput = sc.nextLine().toLowerCase();

      // if the user input equals end, then engaged is set to true, the scanner
      // closes, and we break from the loop to end conversation
      // otherwise we continually ask for user input
      if (userInput.equals("goodbye")) {
        System.out.println("Goodbye! Nice meeting you!");
        sc.close();
        engaged = true;
        break;

        // otherwise, call the chatbot function which calls the analyze function
        // which analyzes the input and then the method figures out how the chat bot
        // responds
      } else {
        chatBot(userInput);
      }

    }

  }

  // ------------------------------------------------------------------------------------------------------------------
  // below is the chatbot and analyze function methods to determine chatbots
  // reponse

  // this method is the chatbot method which calls the analyze function method to
  // determine the chatbot response
  public static void chatBot(String userInput) {
    analyzeInput(userInput);
  }

  // this method takes in the users input and directs how the robot is going to
  // respond by creating sub problems to solve
  // with other methods
  public static void analyzeInput(String userInput) {

    if (userInput.contains("hi") || userInput.contains("hey") || userInput.contains("hello")) {
      greetingResponse(userInput);

    } else if (userInput.contains("who")) {
      whoResponse(userInput);

    } else if (userInput.contains("what")) {
      whatResponse(userInput);

    } else if (userInput.contains("where")) {
      whereResponse(userInput);

    } else if (userInput.contains("when")) {
      whenResponse(userInput);

    } else if (userInput.contains("how")) {
      howResponse(userInput);

    } else {
      defaultResponse(userInput);

    }

  }

  // ------------------------------------------------------------------------------------------------------------------
  // below is the greeting method

  // this is the greeting method, this method generates a randopm number from 0 to
  // 10 and determines how the chatbot would
  // respond to the user saying hello
  public static void greetingResponse(String userInput) {

    // generate random number from 0 to 10
    int randomNumber = (int) (Math.random() * 11);

    // switch statement to determine responses
    switch (randomNumber) {
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

  // ------------------------------------------------------------------------------------------------------------------
  // below are the methods to determine if the question being asked is a who what
  // where when or how question

  public static void whoResponse(String userInput) {
    // Here we check if the who question contains any of the movie names, if so,
    // then we respond using the who responses for movie questions
    whoMovieResponse(userInput);

    // Otherwise, we check if the what question is about his personal attributes and
    // if so we respond with the
    // what responses for personal questions
    whoPersonalResponse(userInput);

  }

  public static void whatResponse(String userInput) {

    // Here we check if the what question contains any of the movie names, if so,
    // then we respond using the what responses for movie questions
    whatMovieReponse(userInput);

    // Otherwise, we check if the what question is about his personal attributes and
    // if so we respond with the
    // what responses for personal questions
    whatPersonalResponse(userInput);

  }

  public static void whereResponse(String userInput) {

    // Here we check if the where question contains any of the movie names, if so,
    // then we respond using the where responses for movie questions
    whereMovieResponse(userInput);

    // Otherwise, we check if the where question is about his personal attributes
    // and if so we respond with the
    // where responses for personal questions
    whatPersonalResponse(userInput);

  }

  public static void whenResponse(String userInput) {
    // Here we check if the when question contains any of the movie names, if so,
    // then we respond using the when responses for movie questions
    whenMovieResponse(userInput);

    // Otherwise, we check if the when question is about his personal attributes and
    // if so we respond with the
    // when responses for personal questions
    whenPersonalResponse(userInput);

  }

  public static void howResponse(String userInput) {
    // Here we check if the how question contains any of the movie names, if so,
    // then we respond using the how responses for movie questions
    howMovieResponse(userInput);

    // Otherwise, we check if the what question is about his personal attributes and
    // if so we respond with the
    // what responses for personal questions
    howPersonalResponse(userInput);

  }

  // ------------------------------------------------------------------------------------------------------------------
  // below is the ask a question method which determines if the bot asks the
  // question back to the user

  public static void askAQuestionResponse(String userInput) {
    int random = (int) (Math.random() * 3); // 1/3 of the time the chat bot asks a question back to the user

    if (random == 1) {
      System.out.println("\nHow about you?");
     askAQuestion = true;
      
    } else {
      return;
    }

  }

  // ------------------------------------------------------------------------------------------------------------------
  // below are is the deafult response depending if the question asked from the
  // user is not understandable by the chatbot

  // this is a method that is called as a default response if the chat bot is
  // unable to determine how to respond
  public static void defaultResponse(String userInput) {
    // If all else fails and the chat bot does not not how to respond, we have this
    // statement set as
    // the chat bot's default response to a question it does not know

    System.out.println("Sorry, I am unsure of how to respond to this question");
    System.out.println("Please ask me another question about my life or my movies, I would be happy to answer!");

  }

  // ------------------------------------------------------------------------------------------------------------------
  // below are the movie responses depending if the question asked from the user
  // contains who what where when and how

  // This is the who movie response method which determines responses for who
  // questions about movies
  public static void whoMovieResponse(String userInput) {

    if (userInput.contains("movie") || userInput.contains("movies")) {
      // add your content here

    } else if (userInput.contains("deadpool")) {
      // add your content here

    } else if (userInput.contains("deadpool 2")) {
      // add your content here

    } else if (userInput.contains("free guy")) {
      // add your content here

    } else if (userInput.contains("r.i.p.d")) {
      // add your content here

    } else if (userInput.contains("green lantern")) {
      // add your content here

    } else if (userInput.contains("6 underground")) {
      // add your content here

    } else if (userInput.contains("red notice")) {
      // add your content here

    } else if (userInput.contains("selfless") || userInput.contains("self/less")) {
      // add your content here
      
    } else if (userInput.contains("hitman")) {
      // add your content here
      
    } else if (userInput.contains("changeup")) {
      // add your content here
      
    } else if (userInput.contains("proposal")) {
      // add your content here
     
    } else {
      return;
    }
  }

  // This is the what movie response method which determines responses for what
  // questions about the different movies
  public static void whatMovieReponse(String userInput) {

    if (userInput.contains("movie")) {
      
    } else if (userInput.contains("deadpool")) {
     
      if (userInput.contains("rating")) {
        System.out.print("The rating is " + r.getDeadpool().getRating() + "\n");
      } else if (userInput.contains("genre")) {
        System.out.print("The genre is " + r.getDeadpool().getGenre() + "\n");
      } else if (userInput.contains("location")) {
        System.out.print("The location the movie was filmed in is " + r.getDeadpool().getLocation() + "\n");
      } else if (userInput.contains("awards")) {
        System.out.print("The awards for this movie are " + r.getDeadpool().getAwards() + "\n");
      } else if (userInput.contains("cast")) {
        System.out.print("The cast members are " + r.getDeadpool().getCast() + "\n");
      } else if (userInput.contains("director")) {
        System.out.print("The director for this movie is " + r.getDeadpool().getDirector() + "\n");
      } else if (userInput.contains("box office")) {
        System.out.print("The gross box office $" + r.getDeadpool().getBoxOffice() + "\n");
      } else if (userInput.contains("stars")) {
        System.out.print("The stars are " + r.getDeadpool().getImdbStars() + "\n");
      } else {
        return;
      }
    } else if (userInput.contains("deadpool2")) {
      
      if (userInput.contains("rating")) {
        System.out.print("The rating is " + r.getDeadpool2().getRating() + "\n");
      } else if (userInput.contains("genre")) {
        System.out.print("The genre is " + r.getDeadpool2().getGenre() + "\n");
      } else if (userInput.contains("location")) {
        System.out.print("The location the movie was filmed in is " + r.getDeadpool2().getLocation() + "\n");
      } else if (userInput.contains("awards")) {
        System.out.print("The awards for this movie are " + r.getDeadpool2().getAwards() + "\n");
      } else if (userInput.contains("cast")) {
        System.out.print("The cast members are " + r.getDeadpool2().getCast() + "\n");
      } else if (userInput.contains("director")) {
        System.out.print("The director for this movie is " + r.getDeadpool2().getDirector() + "\n");
      } else if (userInput.contains("box office")) {
        System.out.print("The gross box office $" + r.getDeadpool2().getBoxOffice() + "\n");
      } else if (userInput.contains("stars")) {
        System.out.print("The stars are " + r.getDeadpool2().getImdbStars() + "\n");
      } else {
        return;
      }
    } else if (userInput.contains("free guy")) {
      
      if (userInput.contains("rating")) {
        System.out.print("The rating is " + r.getFreeGuy().getRating() + "\n");
      } else if (userInput.contains("genre")) {
        System.out.print("The genre is " + r.getFreeGuy().getGenre() + "\n");
      } else if (userInput.contains("location")) {
        System.out.print("The location the movie was filmed in is " + r.getFreeGuy().getLocation() + "\n");
      } else if (userInput.contains("awards")) {
        System.out.print("The awards for this movie are " + r.getFreeGuy().getAwards() + "\n");
      } else if (userInput.contains("cast")) {
        System.out.print("The cast members are " + r.getFreeGuy().getCast() + "\n");
      } else if (userInput.contains("director")) {
        System.out.print("The director for this movie is " + r.getFreeGuy().getDirector() + "\n");
      } else if (userInput.contains("box office")) {
        System.out.print("The gross box office $" + r.getFreeGuy().getBoxOffice() + "\n");
      } else if (userInput.contains("stars")) {
        System.out.print("The stars are " + r.getFreeGuy().getImdbStars() + "\n");
      } else {
        return;
      }
    } else if (userInput.contains("r.i.p.d")) {
      
      if (userInput.contains("rating")) {
        System.out.print("The rating is " + r.getRIPD().getRating() + "\n");
      } else if (userInput.contains("genre")) {
        System.out.print("The genre is " + r.getRIPD().getGenre() + "\n");
      } else if (userInput.contains("location")) {
        System.out.print("The location the movie was filmed in is " + r.getRIPD().getLocation() + "\n");
      } else if (userInput.contains("awards")) {
        System.out.print("The awards for this movie are " + r.getRIPD().getAwards() + "\n");
      } else if (userInput.contains("cast")) {
        System.out.print("The cast members are " + r.getRIPD().getCast() + "\n");
      } else if (userInput.contains("director")) {
        System.out.print("The director for this movie is " + r.getRIPD().getDirector() + "\n");
      } else if (userInput.contains("box office")) {
        System.out.print("The gross box office $" + r.getRIPD().getBoxOffice() + "\n");
      } else if (userInput.contains("stars")) {
        System.out.print("The stars are " + r.getRIPD().getImdbStars() + "\n");
      } else {
        return;
      }
    } else if (userInput.contains("green lantern")) {
      
      if (userInput.contains("rating")) {
        System.out.print("The rating is " + r.getGreenLantern().getRating() + "\n");
      } else if (userInput.contains("genre")) {
        System.out.print("The genre is " + r.getGreenLantern().getGenre() + "\n");
      } else if (userInput.contains("location")) {
        System.out.print("The location the movie was filmed in is " + r.getGreenLantern().getLocation() + "\n");
      } else if (userInput.contains("awards")) {
        System.out.print("The awards for this movie are " + r.getGreenLantern().getAwards() + "\n");
      } else if (userInput.contains("cast")) {
        System.out.print("The cast members are " + r.getGreenLantern().getCast() + "\n");
      } else if (userInput.contains("director")) {
        System.out.print("The director for this movie is " + r.getGreenLantern().getDirector() + "\n");
      } else if (userInput.contains("box office")) {
        System.out.print("The gross box office $" + r.getGreenLantern().getBoxOffice() + "\n");
      } else if (userInput.contains("stars")) {
        System.out.print("The stars are " + r.getGreenLantern().getImdbStars() + "\n");
      } else {
        return;
      }
    } else if (userInput.contains("6 underground")) {
      
      if (userInput.contains("rating")) {
        System.out.print("The rating is " + r.getSixUnderground().getRating() + "\n");
      } else if (userInput.contains("genre")) {
        System.out.print("The genre is " + r.getSixUnderground().getGenre() + "\n");
      } else if (userInput.contains("location")) {
        System.out.print("The location the movie was filmed in is " + r.getSixUnderground().getLocation() + "\n");
      } else if (userInput.contains("awards")) {
        System.out.print("The awards for this movie are " + r.getSixUnderground().getAwards() + "\n");
      } else if (userInput.contains("cast")) {
        System.out.print("The cast members are " + r.getSixUnderground().getCast() + "\n");
      } else if (userInput.contains("director")) {
        System.out.print("The director for this movie is " + r.getSixUnderground().getDirector() + "\n");
      } else if (userInput.contains("box office")) {
        System.out.print("The gross box office $" + r.getSixUnderground().getBoxOffice() + "\n");
      } else if (userInput.contains("stars")) {
        System.out.print("The stars are " + r.getSixUnderground().getImdbStars() + "\n");
      } else {
        return;
      }
    } else if (userInput.contains("red notice")) {
      
      if (userInput.contains("rating")) {
        System.out.print("The rating is " + r.getRedNotice().getRating() + "\n");
      } else if (userInput.contains("genre")) {
        System.out.print("The genre is " + r.getRedNotice().getGenre() + "\n");
      } else if (userInput.contains("location")) {
        System.out.print("The location the movie was filmed in is w" + r.getRedNotice().getLocation() + "\n");
      } else if (userInput.contains("awards")) {
        System.out.print("The awards for this movie are " + r.getRedNotice().getAwards() + "\n");
      } else if (userInput.contains("cast")) {
        System.out.print("The cast members are " + r.getRedNotice().getCast() + "\n");
      } else if (userInput.contains("director")) {
        System.out.print("The director for this movie is " + r.getRedNotice().getDirector() + "\n");
      } else if (userInput.contains("box office")) {
        System.out.print("The gross box office $" + r.getRedNotice().getBoxOffice() + "\n");
      } else if (userInput.contains("stars")) {
        System.out.print("The stars are " + r.getRedNotice().getImdbStars() + "\n");
      } else {
        return;
      }

    } else if (userInput.contains("selfless") || userInput.contains("self/less")) {
     
      if (userInput.contains("rating")) {
        System.out.print("The rating is " + r.getSelfLess().getRating() + "\n");
      } else if (userInput.contains("genre")) {
        System.out.print("The genre is " + r.getSelfLess().getGenre() + "\n");
      } else if (userInput.contains("location")) {
        System.out.print("The location the movie was filmed in is w" + r.getSelfLess().getLocation() + "\n");
      } else if (userInput.contains("awards")) {
        System.out.print("The awards for this movie are " + r.getSelfLess().getAwards() + "\n");
      } else if (userInput.contains("cast")) {
        System.out.print("The cast members are " + r.getSelfLess().getCast() + "\n");
      } else if (userInput.contains("director")) {
        System.out.print("The director for this movie is " + r.getSelfLess().getDirector() + "\n");
      } else if (userInput.contains("box office")) {
        System.out.print("The gross box office $" + r.getSelfLess().getBoxOffice() + "\n");
      } else if (userInput.contains("stars")) {
        System.out.print("The stars are " + r.getSelfLess().getImdbStars() + "\n");
      } else {
        return;
      }
    } else if (userInput.contains("hitman")) {
      
      if (userInput.contains("rating")) {
        System.out.print("The rating is " + r.getTheHitmansBodyguard().getRating() + "\n");
      } else if (userInput.contains("genre")) {
        System.out.print("The genre is " + r.getTheHitmansBodyguard().getGenre() + "\n");
      } else if (userInput.contains("location")) {
        System.out.print("The location the movie was filmed in is w" + r.getTheHitmansBodyguard().getLocation() + "\n");
      } else if (userInput.contains("awards")) {
        System.out.print("The awards for this movie are " + r.getTheHitmansBodyguard().getAwards() + "\n");
      } else if (userInput.contains("cast")) {
        System.out.print("The cast members are " + r.getTheHitmansBodyguard().getCast() + "\n");
      } else if (userInput.contains("director")) {
        System.out.print("The director for this movie is " + r.getTheHitmansBodyguard().getDirector() + "\n");
      } else if (userInput.contains("box office")) {
        System.out.print("The gross box office $" + r.getTheHitmansBodyguard().getBoxOffice() + "\n");
      } else if (userInput.contains("stars")) {
        System.out.print("The stars are " + r.getTheHitmansBodyguard().getImdbStars() + "\n");
      } else {
        return;
      }
    } else if (userInput.contains("changeup")) {
      
      if (userInput.contains("rating")) {
        System.out.print("The rating is " + r.getChangeUp().getRating() + "\n");
      } else if (userInput.contains("genre")) {
        System.out.print("The genre is " + r.getChangeUp().getGenre() + "\n");
      } else if (userInput.contains("location")) {
        System.out.print("The location the movie was filmed in is w" + r.getChangeUp().getLocation() + "\n");
      } else if (userInput.contains("awards")) {
        System.out.print("The awards for this movie are " + r.getChangeUp().getAwards() + "\n");
      } else if (userInput.contains("cast")) {
        System.out.print("The cast members are " + r.getChangeUp().getCast() + "\n");
      } else if (userInput.contains("director")) {
        System.out.print("The director for this movie is " + r.getChangeUp().getDirector() + "\n");
      } else if (userInput.contains("box office")) {
        System.out.print("The gross box office $" + r.getChangeUp().getBoxOffice() + "\n");
      } else if (userInput.contains("stars")) {
        System.out.print("The stars are " + r.getChangeUp().getImdbStars() + "\n");
      } else {
        return;
      }
    } else if (userInput.contains("proposal")) {
      
      if (userInput.contains("rating")) {
        System.out.print("The rating is " + r.getTheProposal().getRating() + "\n");
      } else if (userInput.contains("genre")) {
        System.out.print("The genre is " + r.getTheProposal().getGenre() + "\n");
      } else if (userInput.contains("location")) {
        System.out.print("The location the movie was filmed in is w" + r.getTheProposal().getLocation() + "\n");
      } else if (userInput.contains("awards")) {
        System.out.print("The awards for this movie are " + r.getTheProposal().getAwards() + "\n");
      } else if (userInput.contains("cast")) {
        System.out.print("The cast members are " + r.getTheProposal().getCast() + "\n");
      } else if (userInput.contains("director")) {
        System.out.print("The director for this movie is " + r.getTheProposal().getDirector() + "\n");
      } else if (userInput.contains("box office")) {
        System.out.print("The gross box office $" + r.getTheProposal().getBoxOffice() + "\n");
      } else if (userInput.contains("stars")) {
        System.out.print("The stars are " + r.getTheProposal().getImdbStars() + "\n");
      } else {
        return;
      }
    } else {
      return;
    }
  }

  // This is the where movie response method which determines responses for where
  // questions about movies
  public static void whereMovieResponse(String userInput) {

    if (userInput.contains("movie") || userInput.contains("movies")) {
      System.out.println("My favourite place to shoot a movie is Vancouver!");

    } else if (userInput.contains("deadpool")) {
      System.out.println("We filmed Deadpool in " + r.getDeadpool().getLocation());

    } else if (userInput.contains("deadpool 2")) {
      System.out.println("We filmed Deadpool 2 in " + r.getDeadpool2().getLocation());

    } else if (userInput.contains("free guy")) {
      System.out.println("We filmed Free Guy in " + r.getFreeGuy().getLocation());

    } else if (userInput.contains("r.i.p.d")) {
      System.out.println("We filmed R.I.P.D. in " + r.getRIPD().getLocation());

    } else if (userInput.contains("green lantern")) {
      System.out.println("We filmed Green Lantern in " + r.getGreenLantern().getLocation());

    } else if (userInput.contains("6 underground")) {
      System.out.println("We filmed 6 Underground in " + r.getSixUnderground().getLocation());

    } else if (userInput.contains("red notice")) {
      System.out.println("We filmed Red Notice in " + r.getRedNotice().getLocation());

    } else if (userInput.contains("selfless") || userInput.contains("self/less")) {
      // add your content here
      
    } else if (userInput.contains("hitman")) {
      // add your content here
     
    } else if (userInput.contains("changeup")) {
      // add your content here
      
    } else if (userInput.contains("proposal")) {
      // add your content here
   
    } else {
      return;
    }

  }

  // This is the when movie response method which determines responses for when
  // questions about movies
  public static void whenMovieResponse(String userInput) {
    if ((userInput.contains("movie") || userInput.contains("movies")) && userInput.contains("first")) {
      // When did you film your first movie?
      System.out.println("I filmed my first movie in the year 1993!");
    } else if (userInput.contains("deadpool")) {
      // When was deadpool filmed?
      if(userInput.contains("when was")&& userInput.contains("filmed")){
        System.out.println(r.getDeadpool().getTitle() + " was filmed in the year " + r.getDeadpool().getYear());
      }

    } else if (userInput.contains("deadpool 2")) {
      // When was Deadpool 2 filmed?
      if(userInput.contains("when was")&& userInput.contains("filmed")){
        System.out.println(r.getDeadpool2().getTitle() + " was filmed in the year " + r.getDeadpool2().getYear());
      }

    } else if (userInput.contains("free guy")) {
      // When was Free Guy filmed?
      if(userInput.contains("when was")&& userInput.contains("filmed")){
        System.out.println(r.getFreeGuy().getTitle() + " was filmed in the year " + r.getFreeGuy().getYear());
      }

    } else if (userInput.contains("r.i.p.d")) {
      // When was R.I.P.D filmed?
      if(userInput.contains("when was")&& userInput.contains("filmed")){
        System.out.println(r.getRIPD().getTitle() + " was filmed in the year " + r.getRIPD().getYear());
      }

    } else if (userInput.contains("green lantern")) {
      // When was Green Lantern filmed?
      if(userInput.contains("when was")&& userInput.contains("filmed")){
        System.out.println(r.getGreenLantern().getTitle() + " was filmed in the year " + r.getGreenLantern().getYear());
      }

    } else if (userInput.contains("6 underground")) {
      // When was 6 Underground filmed?
      if(userInput.contains("when was")&& userInput.contains("filmed")){
        System.out.println(r.getSixUnderground().getTitle() + " was filmed in the year " + r.getSixUnderground().getYear());
      }

    } else if (userInput.contains("red notice")) {
      // When was the Red Notice filmed?
      if(userInput.contains("when was") && userInput.contains("filmed")){
        System.out.println(r.getRedNotice().getTitle() + " was filmed in the year " + r.getRedNotice().getYear());
      }

    } else if (userInput.contains("selfless") || userInput.contains("self/less")) {
      // When was selfless filmed?
      if(userInput.contains("when was")&& userInput.contains("filmed")){
        System.out.println(r.getSelfLess().getTitle() + " was filmed in the year " + r.getSelfLess().getYear());
      }
      
    } else if (userInput.contains("hitman")) {
      // When was the The hitmans bodyguard filmed?
      if(userInput.contains("when was")&& userInput.contains("filmed")){
        System.out.println(r.getTheHitmansBodyguard().getTitle() + " was filmed in the year " + r.getTheHitmansBodyguard().getYear());
      }
     
    } else if (userInput.contains("changeup")) {
      // When was the Changeup filmed?
      if(userInput.contains("when was")&& userInput.contains("filmed")){
        System.out.println(r.getChangeUp().getTitle() + " was filmed in the year " + r.getChangeUp().getYear());
      }
      
    } else if (userInput.contains("proposal")) {
      // When was the Proposal Filmed?

      if(userInput.contains("when was")&& userInput.contains("filmed")){
        System.out.println(r.getTheProposal().getTitle() + " was filmed in the year "  + r.getTheProposal().getYear());
      }
   
    } else {
      return;
    }

  }

  // This is the how movie response method which determines responses for how
  // questions about the different movies
  public static void howMovieResponse(String userInput) {
    if (userInput.contains("movie") || userInput.contains("movies")) {
      

    } else if (userInput.contains("deadpool")) {
      // These statements check the user input for various questions about this particular movie and then provide the proper 
      // output depending on which question was asked
      //NOTE: This is the same process for each movie, so for simplicity, These comments will not be repeated for the other movies

      //this checks for: How many awards has + movie + received?
      if(userInput.contains("awards") || userInput.contains("many")){
        int count =0;
        for(int i=0; i<r.getDeadpool().getAwards().size(); i++){
          count++;
        }
        System.out.println(r.getDeadpool().getTitle() + " has " + count + " awards!");
      
        //this checks for: How much box office profit has + movie + made?
      }else if(userInput.contains("box office") || userInput.contains("profit")){
        System.out.println(r.getDeadpool().getTitle() + " made a box office profit of $" + r.getDeadpool().getBoxOffice());
      

        //this checks for: How long was + movie ?
      } else if(userInput.contains("long") || userInput.contains("duration")){
        System.out.println(r.getDeadpool().getTitle() + " is " + r.getDeadpool().getDuration());
      
        //this checks for: How long did it take to film + movie?
      } else if(userInput.contains("long") && userInput.contains("film")){
        System.out.println("It took " + r.getDeadpool().getTimeToFilm() + " to film");
      
        //this checks for: How much was the budget for + movie?
      } else if (userInput.contains("budget")){
        System.out.println("The budget for " + r.getDeadpool().getTitle() + " was $" + r.getDeadpool().getBudgetOfMovie());
     // if all else fails, just return nothing
      }else{
        return;
      }

      // this section if for deadpool 2
    } else if (userInput.contains("deadpool 2")) {
     
      if(userInput.contains("awards") || userInput.contains("many")){
        int count =0;
        for(int i=0; i<r.getDeadpool2().getAwards().size(); i++){
          count++;
        }
        System.out.println(r.getDeadpool2().getTitle() + " has " + count + " awards!");
     
      }else if(userInput.contains("box office") || userInput.contains("profit")){
        System.out.println(r.getDeadpool2().getTitle() + " made a box office profit of $" + r.getDeadpool2().getBoxOffice());
     
      }else if(userInput.contains("long") || userInput.contains("duration")){
        System.out.println(r.getDeadpool2().getTitle() + " is " + r.getDeadpool2().getDuration());
      
      } else if(userInput.contains("long") && userInput.contains("film")){
        System.out.println("It took " + r.getDeadpool2().getTimeToFilm() + " to film");
      
      } else if (userInput.contains("budget")){
        System.out.println("The budget for " + r.getDeadpool2().getTitle() + " was $" + r.getDeadpool2().getBudgetOfMovie());
      }else{
        return;
      }

      //this section is for free guy
    } else if (userInput.contains("free guy")) {
      
      if(userInput.contains("awards") || userInput.contains("many")){
        int count =0;
        for(int i=0; i<r.getFreeGuy().getAwards().size(); i++){
          count++;
        }
        System.out.println(r.getFreeGuy().getTitle() + " has " + count + " awards!");
      
      }else if(userInput.contains("box office") || userInput.contains("profit")){
        System.out.println(r.getFreeGuy().getTitle() + " made a box office profit of $" + r.getFreeGuy().getBoxOffice());
     
      }else if(userInput.contains("long") || userInput.contains("duration")){
        System.out.println(r.getFreeGuy().getTitle() + " is " + r.getFreeGuy().getDuration());
      
      } else if(userInput.contains("long") && userInput.contains("film")){
        System.out.println("It took " + r.getFreeGuy().getTimeToFilm() + " to film");
      
      } else if (userInput.contains("budget")){
        System.out.println("The budget for " + r.getFreeGuy().getTitle() + " was $" + r.getFreeGuy().getBudgetOfMovie());
      }else{
        return;
      }

      //this section is for RIPD
    } else if (userInput.contains("r.i.p.d")) {
      
      if(userInput.contains("awards") || userInput.contains("many")){
        int count =0;
        for(int i=0; i<r.getRIPD().getAwards().size(); i++){
          count++;
        }
        System.out.println(r.getRIPD().getTitle() + " has " + count + " awards!");
      }else if(userInput.contains("box office") || userInput.contains("profit")){
        System.out.println(r.getRIPD().getTitle() + " made a box office profit of $" + r.getRIPD().getBoxOffice());
      
      }else if(userInput.contains("long") || userInput.contains("duration")){
        System.out.println(r.getRIPD().getTitle() + " is " + r.getRIPD().getDuration());
      
      } else if(userInput.contains("long") && userInput.contains("film")){
        System.out.println("It took " + r.getRIPD().getTimeToFilm() + " to film");
      
      } else if (userInput.contains("budget")){
        System.out.println("The budget for " + r.getRIPD().getTitle() + " was $" + r.getRIPD().getBudgetOfMovie());
      }else{
        return;
      }

      //this section is for green lantern
    } else if (userInput.contains("green lantern")) {
     
      if(userInput.contains("awards") || userInput.contains("many")){
        int count =0;
        for(int i=0; i<r.getGreenLantern().getAwards().size(); i++){
          count++;
        }
        System.out.println(r.getGreenLantern().getTitle() + " has " + count + " awards!");
      }else if(userInput.contains("box office") || userInput.contains("profit")){
        System.out.println(r.getGreenLantern().getTitle() + " made a box office profit of $" + r.getGreenLantern().getBoxOffice());
      
      }else if(userInput.contains("long") || userInput.contains("duration")){
        System.out.println(r.getGreenLantern().getTitle() + " is " + r.getGreenLantern().getDuration());
      
      } else if(userInput.contains("long") && userInput.contains("film")){
        System.out.println("It took " + r.getGreenLantern().getTimeToFilm() + " to film");
      
      } else if (userInput.contains("budget")){
        System.out.println("The budget for " + r.getGreenLantern().getTitle() + " was $" + r.getGreenLantern().getBudgetOfMovie());
      }else{
        return;
      }

      //this section is for 6 underground
    } else if (userInput.contains("6 underground")) {
      
      if(userInput.contains("awards") || userInput.contains("many")){
        int count =0;
        for(int i=0; i<r.getSixUnderground().getAwards().size(); i++){
          count++;
        }
        System.out.println(r.getSixUnderground().getTitle() + " has " + count + " awards!");
      }else if(userInput.contains("box office") || userInput.contains("profit")){
        System.out.println(r.getSixUnderground().getTitle() + " made a box office profit of $" + r.getSixUnderground().getBoxOffice());
      
      }else if(userInput.contains("long") || userInput.contains("duration")){
        System.out.println(r.getSixUnderground().getTitle() + " is " + r.getSixUnderground().getDuration());
      
      } else if(userInput.contains("long") && userInput.contains("film")){
        System.out.println("It took " + r.getSixUnderground().getTimeToFilm() + " to film");
      
      } else if (userInput.contains("budget")){
        System.out.println("The budget for " + r.getSixUnderground().getTitle() + " was $" + r.getSixUnderground().getBudgetOfMovie());
      }else{
        return;
      }

      // this section is for rednotice
    } else if (userInput.contains("red notice")) {
     
      if(userInput.contains("awards") || userInput.contains("many")){
        int count =0;
        for(int i=0; i<r.getRedNotice().getAwards().size(); i++){
          count++;
        }
        System.out.println(r.getRedNotice().getTitle() + " has " + count + " awards!");
      }else if(userInput.contains("box office") || userInput.contains("profit")){
        System.out.println(r.getRedNotice().getTitle() + " made a box office profit of $" + r.getRedNotice().getBoxOffice());
      
      }else if(userInput.contains("long") || userInput.contains("duration")){
        System.out.println(r.getRedNotice().getTitle() + " is " + r.getRedNotice().getDuration());
      
      } else if(userInput.contains("long") && userInput.contains("film")){
        System.out.println("It took " + r.getRedNotice().getTimeToFilm() + " to film");
      
      } else if (userInput.contains("budget")){
        System.out.println("The budget for " + r.getRedNotice().getTitle() + " was $" + r.getRedNotice().getBudgetOfMovie());
      }else{
        return;
      }

      //this section is for selfless
    } else if (userInput.contains("selfless") || userInput.contains("self/less")) {
      
      if(userInput.contains("awards") || userInput.contains("many")){
        int count =0;
        for(int i=0; i<r.getSelfLess().getAwards().size(); i++){
          count++;
        }
        System.out.println(r.getSelfLess().getTitle() + " has " + count + " awards!");
      }else if(userInput.contains("box office") || userInput.contains("profit")){
        System.out.println(r.getSelfLess().getTitle() + " made a box office profit of $" + r.getSelfLess().getBoxOffice());
      
      }else if(userInput.contains("long") || userInput.contains("duration")){
        System.out.println(r.getSelfLess().getTitle() + " is " + r.getSelfLess().getDuration());
      
      } else if(userInput.contains("long") && userInput.contains("film")){
        System.out.println("It took " + r.getSelfLess().getTimeToFilm() + " to film");
      
      } else if (userInput.contains("budget")){
        System.out.println("The budget for " + r.getSelfLess().getTitle() + " was $" + r.getSelfLess().getBudgetOfMovie());
      }else{
        return;
      }
      

      //this section is for the hitmans bodyguard
    } else if (userInput.contains("hitman")) {
     
      if(userInput.contains("awards") || userInput.contains("many")){
        int count =0;
        for(int i=0; i<r.getTheHitmansBodyguard().getAwards().size(); i++){
          count++;
        }
        System.out.println(r.getTheHitmansBodyguard().getTitle() + " has " + count + " awards!");
      }else if(userInput.contains("box office") || userInput.contains("profit")){
        System.out.println(r.getTheHitmansBodyguard().getTitle() + " made a box office profit of $" + r.getTheHitmansBodyguard().getBoxOffice());
      
      }else if(userInput.contains("long") || userInput.contains("duration")){
        System.out.println(r.getTheHitmansBodyguard().getTitle() + " is " + r.getTheHitmansBodyguard().getDuration());
      
      } else if(userInput.contains("long") && userInput.contains("film")){
        System.out.println("It took " + r.getTheHitmansBodyguard().getTimeToFilm() + " to film");
      
      } else if (userInput.contains("budget")){
        System.out.println("The budget for " + r.getTheHitmansBodyguard().getTitle() + " was $" + r.getTheHitmansBodyguard().getBudgetOfMovie());
      }else{
        return;
      }
     
      //this section is for changeup
    } else if (userInput.contains("changeup")) {
     
      if(userInput.contains("awards") || userInput.contains("many")){
        int count =0;
        for(int i=0; i<r.getChangeUp().getAwards().size(); i++){
          count++;
>>>>>>> Stashed changes
        }

       
      


    }
    

<<<<<<< Updated upstream
<<<<<<< Updated upstream
    public static void textresponse(String string){
        System.out.println("Ryan: " + string);
=======
    // this calls the ask a question response for the chatbot to ask a question back
    // to the user
    askAQuestionResponse(userInput);

  }

  // This is the when personal response method which determines responses for when
  // questions about the chat bots personal life
  public static void whenPersonalResponse(String userInput) {

    if (userInput.contains("born") && userInput.contains("year")) {
      // add your content here
      System.out.println("I was born in 1976");
    } else if (userInput.contains("marry") || userInput.contains("married")) {
      // add your content here
      if(userInput.contains("blake") || userInput.contains("wife")){
        System.out.println("I married my beautiful wife in September 2012");
      }else if(userInput.contains("scarlett")){
        System.out.println("We really should not talk about this, but we got married in September of 2008.");
      }
    } else {
      return;
    }

    // this calls the ask a question response for the chatbot to ask a question back
    // to the user
    askAQuestionResponse(userInput);

  }

  // This is the how personal response method which determines responses for how
  // questions about the chat bots personal life
  public static void howPersonalResponse(String userInput) {

    if (userInput.contains("old")) {
      // Chat bots repsonse to the user asking how old Ryan Reynolds is

      // initializing birthDate, current date and period between the two dates
      LocalDate birthDate = LocalDate.of(1976, 6, 23);
      LocalDate currentDate = LocalDate.now();
      Period difference = Period.between(birthDate, currentDate);
      // taking current age as the years of the period determined above
      int currentAge = difference.getYears();
      // printing how old Ryan Reynolds currently is as of today
      System.out.println("I am currently " + currentAge + " years old!");

      // converting Ryan Reynolds age to days, hours, minutes, and seconds
      int currentDays = currentAge * 365;
      int currentHours = currentAge * 8760;
      int currentMinutes = currentAge * 525600;
      // initialize as long since this value exceeds integer storage
      long currentSeconds = (currentAge) * 31540000000L;
      // print statement with all of the data above
      System.out.println("Haha, or just because I am a robot, more specifically I am " + currentDays + " days, "
          + currentHours + " hours, " + currentMinutes + " minutes, and " + currentSeconds + " seconds " + "old!");

    } else if (userInput.contains("kid")) {
      // Chat bots response to the user asking how many kids Ryan Reynolds has
      int count = 0;
      for (int i = 0; i < r.getkidNames().size(); i++) {
        count++;
      }

      System.out.println("I have " + count + " kids");

    } else if (userInput.contains("instagram") || userInput.contains("instagram followers")) {
      // Chat bots response to user asking how many instagram followers Ryan Reynolds has
      System.out.println("I have " + r.getinstagramFollowers() + " followers on instgram!");

    } else if (userInput.contains("twitter") || userInput.contains("twitter followers")) {
      // Chat bots response to user asking how many twitter followers Ryan Reynolds has
      System.out.println("I have " + r.gettwitterFollowers() + " followers on Twitter!");

    } else if (userInput.contains("tiktok") || userInput.contains("tiktok followers")) {
      // Chat bots response to user asking how many TikTok followers Ryan Reynolds has
      System.out.println("I have " + r.gettiktokFollowers() + " followers on TikTok!");

    } else if ((userInput.contains("personal") || userInput.contains("other")) && userInput.contains("awards")) {
      // Chat bots response to user asking how many personal / other awards Ryan Reynolds has
      int count = 0;
      for (int i = 0; i < r.getotherAwards().size(); i++) {
        count++;
      }
      System.out.println("I have " + count + " personal awards");

    } else {
      return;
>>>>>>> Stashed changes
    }
=======
    
>>>>>>> Stashed changes
}
