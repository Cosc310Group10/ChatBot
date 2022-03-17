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
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    //----------------------------------------------------------------------------------------------------------------------------
public class ChatBot extends JFrame implements ActionListener {


    //----------------------------------------------------------------------------------------------------------------------------

// creating a static ryan reynolds object so its accessible by all methods
static RyanReynolds r = new RyanReynolds("6ft 2", 190, "hazel", "light brown", "male", "Vancouver", "October 23 1976",
"Blake Lively", "@vancityreynolds", 18900000, 41600000, 18700000, "$150 M", "Scarlett Johansson");

// boolean to keep track if the bot asked a question
static boolean askAQuestion = false;
//boolean for start up statements
static boolean startUp = true;

// string to track user inputs
static String userInput;
static String userInputUnformatted;
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

public static JFrame frame;
public static JPanel panel;
public static JTextArea chatArea;
public static JTextField chatField;
public static JScrollBar scrollBar;
public static JButton button;
public static ImageIcon image;
 
    //---------------------------------------------------------------------------------------------------------------------------- 
  //BELOW WE ARE CREATING A GUI FOR THE CHATBOT
  public ChatBot(){

    //getting the laptop screen size, and setting the frame to be full screen
    GraphicsEnvironment graphics = GraphicsEnvironment.getLocalGraphicsEnvironment();
    GraphicsDevice device = graphics.getDefaultScreenDevice();
    frame = new JFrame("Fullscreen");
    device.setFullScreenWindow(frame);
        panel = new JPanel();
        
        image = new ImageIcon("ryan_reynolds.jpg");
        
        chatArea = new JTextArea(50,90);
        chatField = new JTextField(40);
        scrollBar = new JScrollBar();
       
        button = new JButton("Ask:");

        
       
  }

  public void setUpMyGUI(){

    panel.setBackground(Color.red);

    frame.add(panel);
    
   
    button.addActionListener(this);
    chatArea.setBackground(Color.black);
    chatArea.setForeground(Color.yellow);
    chatArea.setLineWrap(true);


    chatField.setBackground(Color.black);
    chatField.setForeground(Color.yellow);

    panel.add(chatArea);
    panel.add(button);
    panel.add(chatField);
    

    frame.setIconImage(image.getImage()); //changes icon of frame
    frame.setTitle("Ryan Reynold's ChatBot");
   
    frame.setVisible(true);
    frame.setResizable(false);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


}
    


    //----------------------------------------------------------------------------------------------------------------------------
    // HERE WE ARE CREATING AN ACTION LISTENER AND MAKING AN ACTION PERFORMED METHOD WHICH INCLUDES ALL OF OUR MAIN CODE
    //EXCEPT FOR THE METHODS USED IN THE CODE WHICH ARE OUTSIDE THIS ACTION PERFORMED METHOD
    

    public void actionPerformed(ActionEvent e){

      
     if(e.getSource()==button){
      
     
        
    
 // initializing the greeting repsonse list
 greetingResponses.add("hi");
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

   
    if (startUp == true){
    // a cool feature saying the chatbot is booting up for a delay of 2 seconds
    chatArea.setText("Ryan Reynolds Chat bot booting up...\n");
    try {
      TimeUnit.SECONDS.sleep(2); // delaying the program for 2 seconds
    } catch (Exception g) {
      chatArea.setText("Error Occurred"); // catching an error
    }
    // prompt for user and creating scanner
    chatArea.setText("Ryan Reynolds: " + 
        "Hello! Nice to meet you! I am Ryan Reynolds, but in chat bot form...\nAsk me a question about myself or my movies!\n");
        startUp = false;
  }

   

    // initializing user input string

    // Continually ask for user input and store it
    
      // if the bot asked a question, reply with cool and take the input
      
      //otherwise, re prompt for input and repeat
      askAQuestion = false;
      // print new line
      chatArea.append("\n");
      // grab user input
      userInputUnformatted = chatField.getText();
      userInput = chatField.getText().toLowerCase();
      chatField.setText("");
      chatArea.append("You: " + userInputUnformatted+"\n"); 
      
      
      
      // if the user input equals end, then engaged is set to true, the scanner
      // closes, and we break from the loop to end conversation
      // otherwise we continually ask for user input
      if (userInput.equals("goodbye")) {
        chatArea.append("Ryan Reynolds: "+"Goodbye! Nice meeting you! I am shutting down now."+"\n");
        try {
          TimeUnit.SECONDS.sleep(3); // delaying the program for 2 seconds
        } catch (Exception g) {
          chatArea.append("Error Occurred"); // catching an error
        }
        System.exit(0);
        

        // otherwise, call the chatbot function which calls the analyze function
        // which analyzes the input and then the method figures out how the chat bot
        // responds
      } else {
        chatBot(userInput);
      }

    
    


  }
}


  // --------------------------------------------------------------------------------------------------
  public static void main(String[] args) {

    //USE THIS TO ENSURE JAVA IMAGE ICON WORKS, make sure image is in here!
    //String dir = System.getProperty("user.dir");
  // directory from where the program was launched
  //System.out.println(dir);

    //GUI STUFF
    ChatBot gui = new ChatBot();
    gui.setUpMyGUI();

   

   

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

    // here we check if the input is a greeting or not
    for (int i = 0; i < greetingResponses.size(); i++) {
      // if the user input contains a greeting we simply call the greeting function to
      // respond
      if (userInput.contains(greetingResponses.get(i).toLowerCase())) {
        greetingChatFunction();
        return;
      }
    }

    // if the userInput contains a movie title, we segregate ithe users query to
    // being about movies
    for (int j = 0; j < listOfMovies.size(); j++) {
      if (userInput.contains(listOfMovies.get(j).getTitle().toLowerCase())) {
        movieTitleAsked = listOfMovies.get(j).getTitle().toLowerCase();

        // then we send the user input and the movie title asked about to a chat
        // function which determines
        // the robots reponse
        movieChatFunction(userInput, movieTitleAsked);
        return;

      }
    }

    // if the userInput does not contain a movie title,
    // we segregate the users query to being about the bots personal life
    for (int k = 0; k < personalQuestion.size(); k++) {

      if (userInput.contains(personalQuestion.get(k).toLowerCase())) {
        personalQuestionAsked = personalQuestion.get(k).toLowerCase();
        // then we send the user input and the personal question asked about to a chat
        // function which determines
        // the robots reponse
        personalChatFunction(userInput, personalQuestionAsked);
        return;
      }
    }

    // otherwise we call the default response
    defaultResponse();
    return;

  }

  // ---------------------------------------------------------------------------------------------------------
  // This is the movie chat function for the chatbot, which loops through the
  // movie questions and determines
  // depending on which question is asked how the bot will respond using the
  // corresponding map and key value pair
  public static void movieChatFunction(String userInput, String movieTitleAsked) {

    for (int i = 0; i < movieQuestion.size(); i++) {
      if (userInput.contains(movieQuestion.get(0))) {

       chatArea.append("Ryan Reynolds: " + movieTitleAsked + " " + imdbMap.get(movieTitleAsked)+"\n");
        break;

      } else if (userInput.contains(movieQuestion.get(1))) {
        chatArea.append("Ryan Reynolds: " + movieTitleAsked + " " + yearMap.get(movieTitleAsked)+"\n");
        break;

      } else if (userInput.contains(movieQuestion.get(2))) {
        chatArea.append("Ryan Reynolds: " + movieTitleAsked + " " + ratingMap.get(movieTitleAsked)+"\n");
        break;

      } else if (userInput.contains(movieQuestion.get(3))) {
        chatArea.append("Ryan Reynolds: " + movieTitleAsked + " " + castMap.get(movieTitleAsked)+"\n");
        break;
      } else if (userInput.contains(movieQuestion.get(4))) {
        chatArea.append("Ryan Reynolds: " + movieTitleAsked + " " + directorMap.get(movieTitleAsked)+"\n");
        break;
      } else if (userInput.contains(movieQuestion.get(5))) {
        chatArea.append("Ryan Reynolds: " + movieTitleAsked + " " + genreMap.get(movieTitleAsked)+"\n");
        break;
      } else if (userInput.contains(movieQuestion.get(6))) {
        chatArea.append("Ryan Reynolds: " + movieTitleAsked + " " + awardsMap.get(movieTitleAsked)+"\n");
        break;
      } else if (userInput.contains(movieQuestion.get(7))) {
        chatArea.append("Ryan Reynolds: " + movieTitleAsked + " " + boxOfficeMap.get(movieTitleAsked)+"\n");
        break;
      } else if (userInput.contains(movieQuestion.get(8))) {
        chatArea.append("Ryan Reynolds: " + movieTitleAsked + " " + locationMap.get(movieTitleAsked)+"\n");
        break;
      } else if (userInput.contains(movieQuestion.get(9))) {
        chatArea.append("Ryan Reynolds: " + movieTitleAsked + " " + timeToFilmMap.get(movieTitleAsked)+"\n");
        break;
      } else if (userInput.contains(movieQuestion.get(10))) {
        chatArea.append("Ryan Reynolds: " + movieTitleAsked + " " + durationMap.get(movieTitleAsked)+"\n");
        break;
      } else if (userInput.contains(movieQuestion.get(11))) {
        chatArea.append("Ryan Reynolds: " + movieTitleAsked + " " + budgetMap.get(movieTitleAsked)+"\n");
        break;
      } else {

        return;
      }
    }

  }

  // ---------------------------------------------------------------------------------------------------------

  // This is the personal chat function for the chatbot which prints out the
  // response from the personal map
  // that gets the key of the question asked and prints the value of that key
  // value pair
  public static void personalChatFunction(String userInput, String personalQuestionAsked) {

    chatArea.append("Ryan Reynolds: " + personalQuestionMap.get(personalQuestionAsked)+"\n");
    askAQuestionResponse(); // asks a question back to the user
  }

  // ---------------------------------------------------------------------------------------------------------

  // ------------------------------------------------------------------------------------------------------------------
  // below is the greeting method
  // this is the greeting method, this method generates a random number from 0 to
  // 10 and determines how the chatbot would
  // respond to the user saying hello
  public static void greetingChatFunction() {

    // generate random number from 0 to 10
    int randomNumber = (int) (Math.random() * 11);

    // switch statement to determine responses
    switch (randomNumber) {
      case 0:
      chatArea.append("Ryan Reynolds: " + "Hello!"+"\n");
        break;
      case 1:
      chatArea.append("Ryan Reynolds: " + "Hey Hey!"+"\n");
        break;
      case 2:
      chatArea.append("Ryan Reynolds: " + "Hi there"+"\n");
        break;
      case 3:
      chatArea.append("Ryan Reynolds: " + "Hi how are ya!"+"\n");
        break;
      case 4:
      chatArea.append("Ryan Reynolds: " + "Hello there"+"\n");
        break;
      case 5:
      chatArea.append("Ryan Reynolds: " + "Hey! I am Ryan Reynolds, nice to meet you!"+"\n");
        break;
      case 6:
      chatArea.append("Ryan Reynolds: " + "What a beautiful day to meet someone as great as me hey? Haha, Hi nice to meet you!"+"\n");
        break;
      case 7:
      chatArea.append("Ryan Reynolds: " + "Yo!"+"\n");
        break;
      case 8:
      chatArea.append("Ryan Reynolds: " + "Hey there"+"\n");
        break;
      case 9:
      chatArea.append("Ryan Reynolds: " + "Hi, nice to meet you!"+"\n");
        break;
      case 10:
      chatArea.append("Ryan Reynolds: " + "Hey!"+"\n");
        break;
      default:
        return;

    }

  }

  // ------------------------------------------------------------------------------------------------------------------
  // below is the ask a question method which determines if the bot asks the
  // question back to the user or not

  public static void askAQuestionResponse() {
    int random = (int) (Math.random() * 2); // 1/6 of the time the chat bot asks a question back to the user

    if (random == 1) {
      chatArea.append("Ryan Reynolds: " + "How about you?"+"\n");
        userInputUnformatted = chatField.getText();
        chatField.setText("");
        chatArea.append("You: " + userInputUnformatted+"\n");
        chatArea.append("Ryan Reynolds: Really!\n");
      

    } else {
      return;
    }

  }

  // ------------------------------------------------------------------------------------------------------------------
  // this is a method that is called as a default response if the chat bot is
  // unable to determine how to respond
  public static void defaultResponse() {
    //If all else fails and the chat bot does not not how to respond, we have these 5 statements set as
      // the chat bot's default responses to any questions it does not know

      //random value to select a response
      int selector = (int) (Math.random()*5);
     
      switch(selector){
      // case statements: each is a unique response when the question is not understood
        case 0 :
        chatArea.append("Ryan Reynolds: " + "I'm sorry I don't understand the question. Please ask me again!"+"\n");
          break;
        case 1 :
        chatArea.append("Ryan Reynolds: " + "Pardon? I didn't quite get that."+"\n");
          break;
        case 2 :
        chatArea.append("Ryan Reynolds: " + "I'm sorry I don't understand the question. Maybe it's because of your accent hahaha!"+"\n");
          break;
        case 3 :
        chatArea.append("Ryan Reynolds: " + "Sorry, you will have to ask that again."+"\n");
          break;
        case 4 :
        chatArea.append("Ryan Reynolds: " + "That was a confusing question! Can you ask me again?"+"\n");
          break;
        default : 
      }
  }

}
