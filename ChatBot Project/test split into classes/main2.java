package test;


import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import Movie;
import RyanReynolds;

public class main2 {

 //setting up variables, arrays, lists, maps

 // creating a static ryan reynolds object so its accessible by all methods
 static RyanReynolds r = new RyanReynolds("6ft 2", 190, "hazel", "light brown", "male", "Vancouver", "October 23 1976",
 "Blake Lively", "@vancityreynolds", 18900000, 41600000, 18700000, "$150 M", "Scarlett Johansson");

// boolean to keep track if the bot asked a question
static boolean askAQuestion = false;

// string to track user input
static String userInput;
// string to track which movie title was asked about
static String movieTitleAsked;
// string to track which personal question was asked about
static String personalQuestionAsked;
// arraylists for the list of movies, movie questions, personal questions, and
// greeting responses
static ArrayList<Movie> listOfMovies = new ArrayList<>();
static ArrayList<String> movieQuestion = new ArrayList<>();
static ArrayList<String> personalQuestion = new ArrayList<>();
static ArrayList<String> greetingResponses = new ArrayList<>();

// creating the map for the personal attributes
static HashMap<String, String> personalQuestionMap = new HashMap<String, String>();

// Here we are creating the maps for the different movie attributes
// Initializing the imdb map
static HashMap<String, String> imdbMap = new HashMap<String, String>();
// Initializing the year map
static HashMap<String, String> yearMap = new HashMap<String, String>();
// Initializing the rating map
static HashMap<String, String> ratingMap = new HashMap<String, String>();
// Initializing the cast map
static HashMap<String, String> castMap = new HashMap<String, String>();
// Initializing the director map
static HashMap<String, String> directorMap = new HashMap<String, String>();
// Initializing the genre map
static HashMap<String, String> genreMap = new HashMap<String, String>();
// Initializing the awards map
static HashMap<String, String> awardsMap = new HashMap<String, String>();
// Initializing the box office map
static HashMap<String, String> boxOfficeMap = new HashMap<String, String>();
// Initializing the location map
static HashMap<String, String> locationMap = new HashMap<String, String>();
// Initializing the timeToFilm map
static HashMap<String, String> timeToFilmMap = new HashMap<String, String>();
// Initializing the duration map
static HashMap<String, String> durationMap = new HashMap<String, String>();
// Initializing the budget map
static HashMap<String, String> budgetMap = new HashMap<String, String>();

// --------------------------------------------------------------------------------------------------

}
//the main function that is called to draw the frame
public static void main(String[] args) {
    //the only thing that should be called in main is the function for the 
    //chat frame to be drawn the rest needs to go in a new function


// initializing the greeting repsonse list
/*greetingResponses.add("hi");
greetingResponses.add("hello");
greetingResponses.add("hey");

// here we are setting up the possible movie questions, and the possible movies
// to be asked about
// Initializing Movie Questions ArrayList
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

// Initializing the list of movies
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

// Initializing the imdb map
fillInMovieMap(imdbMap, "imdb");
// Initializing the year map
fillInMovieMap(yearMap, "year");
// Initializing the rating map
fillInMovieMap(ratingMap, "rating");
// Initializing the cast map
fillInMovieMap(castMap, "cast");
// Initializing the director map
fillInMovieMap(directorMap, "director");
// Initializing the genre map
fillInMovieMap(genreMap, "genre");
// Initializing the awards map
fillInMovieMap(awardsMap, "awards");
// Initializing the box office map
fillInMovieMap(boxOfficeMap, "box office");
// Initializing the location map
fillInMovieMap(locationMap, "location");
// Initializing the timeToFilm map
fillInMovieMap(timeToFilmMap, "time");
// Initializing the duration map
fillInMovieMap(durationMap, "duration");
// Initializing the budget map
fillInMovieMap(budgetMap, "budget");

// ---------------------------------------------------------------------------------------------------------

// here we add all the key words into the personal question list
personalQuestion.add("height");
personalQuestion.add("weight");
personalQuestion.add("hair colour");
personalQuestion.add("eye colour");
personalQuestion.add("gender");
personalQuestion.add("birthplace");
personalQuestion.add("birthdate");
personalQuestion.add("wife");
personalQuestion.add("kids names");
personalQuestion.add("social media handle");
personalQuestion.add("twitter followers");
personalQuestion.add("instagram followers");
personalQuestion.add("tiktok followers");
personalQuestion.add("net worth");
personalQuestion.add("previous marriage");
personalQuestion.add("other awards");
personalQuestion.add("old");

// here we are initializing the personal question map
fillInPersonalMap(personalQuestionMap);

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
*/
}

// ---------------------------------------------------------------------------------------------------------
  // this is a method which fills in each movie map with its respective key and
  // value depending on which map it is
  // via a process of elimination by if and else which determines what the key
  // will be
public static void fillInMovieMap(HashMap<String, String> map, String value) {

    // this loops through each movie object, and initializes the respective map with
    // this movie key
    for (int i = 0; i < listOfMovies.size(); i++) {

      if (value == "imdb") {
        map.put(listOfMovies.get(i).getTitle().toLowerCase(),
            " has " + listOfMovies.get(i).getImdbStars() + " IMDb stars!");

      } else if (value == "year") {
        map.put(listOfMovies.get(i).getTitle().toLowerCase(), " was released in " + listOfMovies.get(i).getYear());

      } else if (value == "rating") {
        map.put(listOfMovies.get(i).getTitle().toLowerCase(), "is rated " + listOfMovies.get(i).getRating());

      } else if (value == "cast") {
        map.put(listOfMovies.get(i).getTitle().toLowerCase(), "'s cast includes: " + listOfMovies.get(i).getCast());

      } else if (value == "director") {
        map.put(listOfMovies.get(i).getTitle().toLowerCase(), "'s director was: " + listOfMovies.get(i).getDirector());

      } else if (value == "genre") {
        map.put(listOfMovies.get(i).getTitle().toLowerCase(), "'s genre is " + listOfMovies.get(i).getGenre());

      } else if (value == "awards") {
        map.put(listOfMovies.get(i).getTitle().toLowerCase(),
            " has won these awards: " + listOfMovies.get(i).getAwards());

      } else if (value == "box office") {
        map.put(listOfMovies.get(i).getTitle().toLowerCase(),
            "'s box office profit is " + listOfMovies.get(i).getBoxOffice());

      } else if (value == "location") {
        map.put(listOfMovies.get(i).getTitle().toLowerCase(),
            "'s filming location was " + listOfMovies.get(i).getLocation());

      } else if (value == "time") {
        map.put(listOfMovies.get(i).getTitle().toLowerCase(),
            "'s time taken to film was " + listOfMovies.get(i).getTimeToFilm());

      } else if (value == "duration") {
        map.put(listOfMovies.get(i).getTitle().toLowerCase(), " is " + listOfMovies.get(i).getDuration() + " long");

      } else if (value == "budget") {
        map.put(listOfMovies.get(i).getTitle().toLowerCase(),
            " had a budget of " + listOfMovies.get(i).getBudgetOfMovie());

      } else {

        return;
      }

    }
  }
// ---------------------------------------------------------------------------------------------------------
  // this is a method which fills in the personal map with its respective key and
  // value depending on which map it is
  // via a process of elimination by if and else which determines what the key
  // will be
  public static void fillInPersonalMap(HashMap<String, String> map) {
    // loops through the personal questions and adds into the map the correcy value
    // for each key
    for (int i = 0; i < personalQuestion.size(); i++) {
      if (personalQuestion.get(i) == "height") {
        map.put(personalQuestion.get(i).toLowerCase(), "I am " + r.getheight() + "!");

      } else if (personalQuestion.get(i) == "weight") {
        map.put(personalQuestion.get(i).toLowerCase(), "I am " + r.getweight() + "lbs!");

      } else if (personalQuestion.get(i) == "hair colour") {
        map.put(personalQuestion.get(i).toLowerCase(), "I have " + r.gethaircolour() + " hair.");

      } else if (personalQuestion.get(i) == "eye colour") {
        map.put(personalQuestion.get(i).toLowerCase(), "I have " + r.geteyecolour() + " eyes.");

      } else if (personalQuestion.get(i) == "gender") {
        map.put(personalQuestion.get(i).toLowerCase(), "I am a " + r.getgender());

      } else if (personalQuestion.get(i) == "birthplace") {
        map.put(personalQuestion.get(i).toLowerCase(), "I was born in " + r.getbirthPlace() + "!");

      } else if (personalQuestion.get(i) == "birthdate") {
        map.put(personalQuestion.get(i).toLowerCase(), "My birthdate is " + r.getbirthDate() + "!");

      } else if (personalQuestion.get(i) == "wife") {
        map.put(personalQuestion.get(i).toLowerCase(), "My wife is " + r.getwifeName() + "!");

      } else if (personalQuestion.get(i) == "kids names") {
        map.put(personalQuestion.get(i).toLowerCase(), "My kids names are: " + r.getkidNames());

      } else if (personalQuestion.get(i) == "social media handle") {
        map.put(personalQuestion.get(i).toLowerCase(), "My social media handle is " + r.getsocialMediaHandle());

      } else if (personalQuestion.get(i) == "twitter followers") {
        map.put(personalQuestion.get(i).toLowerCase(), "I have " + r.gettwitterFollowers() + " followers on Twitter");

      } else if (personalQuestion.get(i) == "instagram followers") {
        map.put(personalQuestion.get(i).toLowerCase(),
            "I have " + r.getinstagramFollowers() + " followers on Instagram");

      } else if (personalQuestion.get(i) == "tiktok followers") {
        map.put(personalQuestion.get(i).toLowerCase(), "I have " + r.getinstagramFollowers() + " followers on TikTok");

      } else if (personalQuestion.get(i) == "net worth") {
        map.put(personalQuestion.get(i).toLowerCase(), "My net worth is " + r.getnetWorth());

      } else if (personalQuestion.get(i) == "previous marriage") {
        map.put(personalQuestion.get(i).toLowerCase(), "I was previously married to " + r.getpreviousMarriage());

      } else if (personalQuestion.get(i) == "other awards") {
        map.put(personalQuestion.get(i).toLowerCase(), "Some of my other awards include: " + r.getotherAwards());

      } else if (personalQuestion.get(i) == "old") {
        // initializing birthDate, current date and period between the two dates
        LocalDate birthDate = LocalDate.of(1976, 6, 23);
        LocalDate currentDate = LocalDate.now();
        Period difference = Period.between(birthDate, currentDate);
        // taking current age as the years of the period determined above
        int currentAge = difference.getYears();

        // converting Ryan Reynolds age to days, hours, minutes, and seconds
        int currentDays = currentAge * 365;
        int currentHours = currentAge * 8760;
        int currentMinutes = currentAge * 525600;
        // initialize as long since this value exceeds integer storage
        long currentSeconds = (currentAge) * 31540000000L;
        // print statement with all of the data above

        map.put(personalQuestion.get(i).toLowerCase(), "I am currently " + currentAge + " years old!"
            + " Haha, or just because I am a robot, more specifically I am " + currentDays + " days, "
            + currentHours + " hours, " + currentMinutes + " minutes, and " + currentSeconds + " seconds " + "old!");

      } else {
        return;
      }
    }
  }
}