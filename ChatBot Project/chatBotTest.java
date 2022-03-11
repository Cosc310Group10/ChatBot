// GROUP 10 COSC 310 Main Class
/*
By:
LANCE ROGAN, STUDENT #62708938 BLAKE ABLITT, STUDENT #37099595 BEN VAN BERGEYK, STUDENT #95307054
GRIFFIN WILCHUK, STUDENT #75303370 CARLA MATHER, STUDENT #22779193
*/

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class chatBotTest {

  // creating a static ryan reynolds object so its accessible by all methods
  static RyanReynolds r = new RyanReynolds("6ft 2", 190, "hazel", "light brown", "male", "Vancouver", "October 23 1976",
      "Blake Lively", "@vancityreynolds", 18900000, 41600000, 18700000, "$150 M", "Scarlett Johansson");
  
  static boolean askAQuestion = false; 
  
  static boolean responseSaid = false;

  static String userInput;
  static String movieTitleAsked;
  static ArrayList<Movie> listOfMovies = new ArrayList<>();
  static ArrayList<String> movieQuestion = new ArrayList<>();
 



// Here we are creating the maps for the different movie attributes
//testMap

     //Initializing the imdb map
     static HashMap<String, String> imdbMap = new HashMap<String, String>();
    //Initializing the year map
    static HashMap<String, String> yearMap = new HashMap<String, String>();
    //Initializing the rating map
    static HashMap<String, String> ratingMap = new HashMap<String, String>();
    //Initializing the cast map
    static HashMap<String, String> castMap = new HashMap<String, String>();
    //Initializing the director map
    static HashMap<String, String> directorMap = new HashMap<String, String>();
    //Initializing the genre map
    static HashMap<String, String> genreMap = new HashMap<String, String>();
    //Initializing the awards map
    static HashMap<String, String> awardsMap = new HashMap<String, String>();
    //Initializing the box office map
    static HashMap<String, String> boxOfficeMap = new HashMap<String, String>();
    //Initializing the location map
    static HashMap<String, String> locationMap = new HashMap<String, String>();
    //Initializing the timeToFilm map
    static HashMap<String, String> timeToFilmMap = new HashMap<String, String>();
    //Initializing the duration map
    static HashMap<String, String> durationMap = new HashMap<String, String>();
    //Initializing the budget map
    static HashMap<String, String> budgetMap = new HashMap<String, String>();

  public static void main(String[] args) {

    // here we are setting up the possible movie questions, and the possible movies to be asked about
    //Initializing Movie Questions ArrayList
    movieQuestion.add("imdb");
    movieQuestion.add("year");
    movieQuestion.add("rating");
    movieQuestion.add("cast");
    movieQuestion.add("director");
    movieQuestion.add("genre");
    movieQuestion.add("awards");
    movieQuestion.add("box office");
    movieQuestion.add("location");
    movieQuestion.add("time");
    movieQuestion.add("film");
    movieQuestion.add("length");
    movieQuestion.add("duration");
    movieQuestion.add("budget");

    //Initializing the list of movie titles
    listOfMovies.add(r.getDeadpool());
    listOfMovies.add(r.getDeadpool2());
    listOfMovies.add(r.getFreeGuy());
    listOfMovies.add(r.getRIPD());
    listOfMovies.add(r.getGreenLantern());
    listOfMovies.add(r.getBuried());
    listOfMovies.add(r.getSixUnderground());
    listOfMovies.add(r.getRedNotice());
    listOfMovies.add(r.getSelfLess());
    listOfMovies.add(r.getTheHitmansBodyguard());
    listOfMovies.add(r.getChangeUp());
    listOfMovies.add(r.getTheProposal());
 

    

      //Initializing the imdb map
     fillInMap(imdbMap,"imdb");
     //Initializing the year map
     fillInMap(yearMap,"year");
     //Initializing the rating map
     fillInMap(ratingMap,"rating");
     //Initializing the cast map
     fillInMap(castMap,"cast");
     //Initializing the director map
     fillInMap(directorMap,"director");
     //Initializing the genre map
     fillInMap(genreMap,"genre");
     //Initializing the awards map
     fillInMap(awardsMap,"awards");
     //Initializing the box office map
     fillInMap(boxOfficeMap,"box office");
     //Initializing the location map
     fillInMap(locationMap,"location");
     //Initializing the timeToFilm map
     fillInMap(timeToFilmMap,"time");
     //Initializing the duration map
     fillInMap(durationMap,"duration");
     //Initializing the budget map
     fillInMap(budgetMap,"budget");

    
    
  
    
    

    // a cool feature saying the chatbot is booting up for a delay of 2 seconds
    System.out.println("Ryan Reynolds Chat bot booting up...");
    try {
      TimeUnit.SECONDS.sleep(2); // delaying the program for 2 seconds
    } catch (Exception e) {
      System.out.println("Error Occurred"); // catching an error
    }
    // prompt for user and creating scanner
    System.out.println(
        "Hello! Nice to meet you! I am Ryan Reynolds, but in chat bot form...\nAsk me a question about myself or my movies!");

    Scanner sc = new Scanner(System.in);

    // initializing user input string
    
    // initializing engaged boolean to continually get user input until user is not
    // engaged and ends conversation
    boolean engaged = false;

    // while engaged, continually ask for user input and store it
    while (!engaged) {
      // if the bot asked a question, reply with cool and take the input
      if (askAQuestion == true) {
        userInput = sc.nextLine();
        System.out.println("Really!");
      }
      // then reset question to false
      askAQuestion = false;
      responseSaid = false;
      // print new line
      System.out.println();
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
  

  // this is a method which fills in each map with its respective key and value depending on which map it is
  // via a process of elimination by if and else which determines what the key will be 
  public static void fillInMap(HashMap<String,String> map,String value){
    
    for(int i=0; i<listOfMovies.size();i++){

      if(value == "imdb"){
        map.put(listOfMovies.get(i).getTitle().toLowerCase()," has " + listOfMovies.get(i).getImdbStars()+" IMDb stars!");

      }else if(value =="year"){
        map.put(listOfMovies.get(i).getTitle().toLowerCase()," was released in " + listOfMovies.get(i).getYear());

      }else if(value =="rating"){
        map.put(listOfMovies.get(i).getTitle().toLowerCase()," is rated " + listOfMovies.get(i).getRating());

      }
      else if(value =="cast"){
        map.put(listOfMovies.get(i).getTitle().toLowerCase(),"'s cast includes: " +listOfMovies.get(i).getCast());

      }
      else if(value =="director"){
        map.put(listOfMovies.get(i).getTitle().toLowerCase(),"'s director was: "+listOfMovies.get(i).getDirector());

      }
      else if(value =="genre"){
        map.put(listOfMovies.get(i).getTitle().toLowerCase(),"'s genre is " + listOfMovies.get(i).getGenre());

      }
      else if(value =="awards"){
        map.put(listOfMovies.get(i).getTitle().toLowerCase()," has won these awards: " +listOfMovies.get(i).getAwards());

      }
      else if(value =="box office"){
        map.put(listOfMovies.get(i).getTitle().toLowerCase(),"'s box office profit is " +listOfMovies.get(i).getBoxOffice());

      }
      else if(value =="location"){
        map.put(listOfMovies.get(i).getTitle().toLowerCase(),"'s filming location was " + listOfMovies.get(i).getLocation());

      }
      else if(value =="time"){
        map.put(listOfMovies.get(i).getTitle().toLowerCase(),"'s time taken to film was " + listOfMovies.get(i).getTimeToFilm());

      }
      else if(value =="duration"){
        map.put(listOfMovies.get(i).getTitle().toLowerCase()," is " + listOfMovies.get(i).getDuration() + " long");

      }
      else if(value =="budget"){
        map.put(listOfMovies.get(i).getTitle().toLowerCase()," had a budget of " + listOfMovies.get(i).getBudgetOfMovie());

      }else{

        return;
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

   // if the userInput contains a movie title, we segregate ithe users query to being about movies
   for(int i=0; i<listOfMovies.size();i++){
       if(userInput.contains(listOfMovies.get(i).getTitle().toLowerCase())){
           movieTitleAsked = listOfMovies.get(i).getTitle().toLowerCase();
           
           //then we send the user input and the movie title asked about to a chat function which determines
           // the robots reponse
           movieChatFunction(userInput,movieTitleAsked);
           break;

       }
   }

  }


  public static void greetingUser(String userInput){
      System.out.println(greetingMap.get(userInput));
  }

  public static void movieChatFunction(String userInput, String movieTitleAsked){

    
      // if the user input contains one of the possible movie questions key word, we respond appropriately
      for(int i=0; i<movieQuestion.size();i++){
          if(userInput.contains(movieQuestion.get(0))){
           
            System.out.println(movieTitleAsked +" " +imdbMap.get(movieTitleAsked));
            break;
    
          }else if(userInput.contains(movieQuestion.get(1))){
            System.out.println(movieTitleAsked +" " + yearMap.get(movieTitleAsked));
            break;

          }else if(userInput.contains(movieQuestion.get(2))){
            System.out.println(movieTitleAsked +" " + imdbMap.get(movieTitleAsked));
            break;
            
          }
          else if(userInput.contains(movieQuestion.get(3))){
            System.out.println(movieTitleAsked +" " + castMap.get(movieTitleAsked));
            break;
          }
          else if(userInput.contains(movieQuestion.get(4))){
            System.out.println(movieTitleAsked +" " + directorMap.get(movieTitleAsked));
            break;
          }
          else if(userInput.contains(movieQuestion.get(5))){
            System.out.println(movieTitleAsked +" " + genreMap.get(movieTitleAsked));
            break;
          }
          else if(userInput.contains(movieQuestion.get(6))){
            System.out.println(movieTitleAsked +" " + awardsMap.get(movieTitleAsked));
            break;
          }
          else if(userInput.contains(movieQuestion.get(7))){
            System.out.println(movieTitleAsked +" " + boxOfficeMap.get(movieTitleAsked));
            break;
          }
          else if(userInput.contains(movieQuestion.get(8))){
            System.out.println(movieTitleAsked +" " + locationMap.get(movieTitleAsked));
            break;
          }
          else if(userInput.contains(movieQuestion.get(9))){
            System.out.println(movieTitleAsked +" " + timeToFilmMap.get(movieTitleAsked));
            break;
          }
          else if(userInput.contains(movieQuestion.get(10))){
            System.out.println(movieTitleAsked +" " + durationMap.get(movieTitleAsked));
            break;
          }
          else if(userInput.contains(movieQuestion.get(11))){
            System.out.println(movieTitleAsked +" " + budgetMap.get(movieTitleAsked));
            break;
          }else{
    
            return;
          }
        }
        
    }
  }


