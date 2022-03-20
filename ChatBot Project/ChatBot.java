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

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

    //----------------------------------------------------------------------------------------------------------------------------
public class ChatBot extends JFrame implements ActionListener {


    //----------------------------------------------------------------------------------------------------------------------------

// creating a static ryan reynolds object so its accessible by all methods
static RyanReynolds r = new RyanReynolds("6ft 2", 190, "hazel", "light brown", "male", "Vancouver", "October 23 1976",
"Blake Lively","@vancityreynolds", 18900000, 41600000, 18700000, "$150 M", "Scarlett Johansson");

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
// string to track which business name was asked about
static String businesNameAsked;

// arraylists for the list of movies, movie questions, personal questions, and
// greeting responses
static ArrayList<Movie> listOfMovies = new ArrayList<>();
static ArrayList<String> movieQuestion = new ArrayList<>();
static ArrayList<String> personalQuestion = new ArrayList<>();
static ArrayList<String> greetingResponses = new ArrayList<>();

// creating the map for the personal attributes
static HashMap<String, String> personalQuestionMap = new HashMap<String, String>();

// creating the arrays for the business attributes
static ArrayList<Business> listOfBusiness = new ArrayList<>();  /*adding list of businesses*/
static ArrayList<String> businessQuestion = new ArrayList<>();   /*adding business questions*/

// creating the maps for the differentbusiness attributes
static HashMap<String, String> businessNameMap = new HashMap<String, String>(); /*adding business hashmap*/
static HashMap<String, String> yearStartedMap = new HashMap<String, String>(); /*adding business hashmap*/
static HashMap<String, String> businessLocationMap = new HashMap<String, String>(); /*adding business hashmap*/
static HashMap<String, String> businessPositionMap = new HashMap<String, String>(); /*adding business hashmap*/

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
public static JScrollPane scrollPane;
public static JButton button;
public static ImageIcon image;
public static JPanel panel2;
public static JPanel panel3;
static boolean speltCorrectly = false;
static String[] splitInput;
static boolean oneWordWrong;
public static Font font;


 //creating variables
 JTextField  userName;
 JFrame      preFrame;
 JTextField userTextField;
 JButton userEnterButton;
 JTextArea chat;
 public static String  name;
//-----------------------------------------------------------------------------------------------------------------
 //creating a display for user to enter in their user name
 public void preDisplay(){
  //creating a new frame
  JFrame newFrame = new JFrame();
  //setting the frame to not be visible
  newFrame.setVisible(false);
   //creating a user name frame before arriving to the main frame
  preFrame = new JFrame("Ryan Reynold's ChatBot");
    image = new ImageIcon("ryan_reynolds.jpg");
    preFrame.setIconImage(image.getImage()); //changes icon of frame

  //creating a label for the user to to enter name
  JLabel userNameLabel = new JLabel("Enter your name: ");

  //creating a new text field to type in user name
  userName = new JTextField(15);
  Font font2 = new Font("Monospaced", Font.PLAIN, 12);
  userName.setFont(font2);
  userName.setBackground(Color.black);
  userName.setForeground(Color.yellow);
  userName.setCaretColor(Color.yellow);
  //creating a button to enter the Ryan Reynolds ChatBot frame
  JButton ryanReynoldsChatBot = new JButton("Enter");

  //calling the actionlistener class when button is pressed
  ryanReynoldsChatBot.addActionListener(new ryanReynoldsChatBotButtonListener());
  
  //creating a prepanel with grid layout
  // A GridBagLayout places components in a grid of rows and columns, 
  //allowing specified components to span multiple rows or columns. 
  JPanel prePanel = new JPanel(new GridBagLayout());
  
  //The way the program specifies the size and position characteristics of its 
  //components is by specifying constraints for each component. 
  //The preferred approach to set constraints on a component is to use the 
  //Container.add variant, passing it a GridBagConstraints object,
  //as demonstrated in the next sections.

  //setting up the left and right constraints for the prepanel
  GridBagConstraints preRight = new GridBagConstraints();
  GridBagConstraints preLeft = new GridBagConstraints();

  //Insets: Specifies the external padding of the component -- 
  //the minimum amount of space between the component and 
  //the edges of its display area. The value is specified as an Insets object. 
  //By default, each component has no external padding.
  preRight.insets = new Insets(0,0,0,10);
  preLeft.insets = new Insets(0,10,10,10);

  //anchor:is used when the component is smaller than its display area to determine where
  // (within the area) to place the component. Valid values (defined as GridBagConstraints constants) 
  //are CENTER (the default), PAGE_START, PAGE_END, LINE_START, LINE_END, FIRST_LINE_START, FIRST_LINE_END, LAST_LINE_END, and LAST_LINE_START.
  preRight.anchor = GridBagConstraints.LINE_END;
  preLeft.anchor = GridBagConstraints.LINE_START;

  //Fill: is used when the component's display area is larger than the component's requested
  // size to determine whether and how to resize the component. Valid values (defined as GridBagConstraints constants) 
  //include NONE (the default), HORIZONTAL (make the component wide enough to fill its display area horizontally, but do not change its height),
  // VERTICAL (make the component tall enough to fill its display area vertically, but do not change its width), and BOTH (make the component fill its display area entirely).
  preRight.fill = GridBagConstraints.HORIZONTAL;//HORIZONTAL (make the component wide enough to fill its display area horizontally
  
  //Gridwidth and Gridheight: Specify the number of columns (for gridwidth) or rows (for gridheight) in the component's display area. 
  //These constraints specify the number of cells the component uses, not the number of pixels it uses. 
  //The default value is 1. Use GridBagConstraints.REMAINDER to specify that the component be the last one in its row (for gridwidth) or column (for gridheight). 
  //Use GridBagConstraints.RELATIVE to specify that the component be the next to last one in its row (for gridwidth) or column (for gridheight). 
  //We recommend specifying the gridwidth and gridheight values for each component rather than just using GridBagConstraints.RELATIVE and GridBagConstraints.REMAINDER; this tends to result in more predictable layouts.
  preRight.gridwidth = GridBagConstraints.REMAINDER; //to specify that the component be the last one in its row (for gridwidth)
 
  //____________________________________________________________________________________________________________________________

  prePanel.setBackground(Color.decode("#8b1a1a"));
  //adding the panels to draw
  //panel for user name label on left
  prePanel.add(userNameLabel, preLeft);
  //panel for user name text on right
  prePanel.add(userName, preRight);
  //panel center
  preFrame.add(prePanel, BorderLayout.CENTER);
  //panel for Ryan Renolds chatbot name 
  preFrame.add(ryanReynoldsChatBot, BorderLayout.SOUTH);
  //setting the size of the frame
  preFrame.setSize(500, 500);
 
  //making the frame visible
  preFrame.setVisible(true);
}



//-----------------------------------------------------------------------------------------------------------------


        //user enters their name and when button is pushed this listener is activated
class ryanReynoldsChatBotButtonListener implements ActionListener {
    public void actionPerformed(ActionEvent event) {
        //user name equals the text entered
        name = userName.getText();
        //if user name is less then 1 character then try again is printed
        if (name.length() < 1) {
            System.out.println("Try entering your name again!");
        } else {
            //sets the preFrame to not visiable
            preFrame.setVisible(false);
            // //calls display method
            ChatBot gui = new ChatBot();
            gui.setUpMyGUI();
        }
    }

}



    //---------------------------------------------------------------------------------------------------------------------------- 
  //BELOW WE ARE CREATING A GUI FOR THE CHATBOT
  public ChatBot(){

    // //getting the laptop screen size, and setting the frame to be full screen
    // GraphicsEnvironment graphics = GraphicsEnvironment.getLocalGraphicsEnvironment();
    // GraphicsDevice device = graphics.getDefaultScreenDevice();
    // frame = new JFrame("Fullscreen");
    frame = new JFrame();
    // device.setFullScreenWindow(frame);

    frame.setSize(500, 500);

        panel = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        image = new ImageIcon("ryan_reynolds.jpg");
        
        font = new Font("Monospaced", Font.PLAIN, 12);
        chatArea = new JTextArea(36,130);
        chatArea.setFont(font);
        // chatArea = new JTextArea();
        chatField = new JTextField();
       
        button = new JButton("Ask:");
        scrollPane = new JScrollPane(chatArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
       
        
        
       
  }

  public void setUpMyGUI(){

    
    button.addActionListener(this);


    
    
    
    chatArea.setBackground(Color.black);
    chatArea.setForeground(Color.yellow);
    chatArea.setLineWrap(true);

    chatField = new JTextField(40);

    
    chatField.setFont(font);
    chatField.setCaretColor(Color.yellow);
    chatField.setBackground(Color.black);
    chatField.setForeground(Color.yellow);

    // navy blue is #00117
    panel2.setBackground(Color.decode("#8b1a1a"));
    panel.setBackground(Color.decode("#8b1a1a"));
    panel.add(scrollPane);
    panel2.add(button);
    panel2.add(chatField);

    

    
    frame.add(panel,BorderLayout.CENTER);
    frame.add(panel2, BorderLayout.PAGE_END);
    
   
    

    // panel.add(chatArea);
    // panel.add(button);
    // panel.add(chatField);
    
    
    frame.setIconImage(image.getImage()); //changes icon of frame
    frame.setTitle("Ryan Reynold's ChatBot");
   
    frame.setVisible(true);
    frame.setResizable(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    


}
    


    //----------------------------------------------------------------------------------------------------------------------------
    // HERE WE ARE CREATING AN ACTION LISTENER AND MAKING AN ACTION PERFORMED METHOD WHICH INCLUDES ALL OF OUR MAIN CODE
    //EXCEPT FOR THE METHODS USED IN THE CODE WHICH ARE OUTSIDE THIS ACTION PERFORMED METHOD
    

    public void actionPerformed(ActionEvent e){

      
     if(e.getSource()==button){
      
     
        if (chatField.getText().length() < 1) {
            // do nothing
        } else if (chatField.getText().equals(".clear")) {
            chatArea.setText("Cleared all messages\n");
            chatField.setText("");
        } else {
            
        
    
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



    // here we are setting up the possible business questions, and the possible business
    // to be asked about
   // Initializing business Questions ArrayList
    // businessQuestion.add("business name");
    businessQuestion.add("year");
    businessQuestion.add("location");
    businessQuestion.add("position");


    // Initializing the list of business
    listOfBusiness.add(r.getMintMoblie());
    listOfBusiness.add(r.getMaximumEffort());
    listOfBusiness.add(r.getAviationAmericanGin());
    listOfBusiness.add(r.getwrexhamAFC());
    listOfBusiness.add(r.getgroupEffortInitiative());
    listOfBusiness.add(r.getMNTN());
   

    // Initializing the businessName map
    // fillInBusinessMap(businessNameMap, "business name");
    // Initializing the yearStarted map
    fillInBusinessMap(yearStartedMap, "year");
    // Initializing the businessLocation map
    fillInBusinessMap(businessLocationMap, "location");
    // Initializing the businessPosition map
    fillInBusinessMap(businessPositionMap, "position");


    // ---------------------------------------------------------------------------------------------------------

   
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

    // TODO: Specify your translation requirements here:
    String fromLang = "es";
    String toLang = "en";
    // try{
    // userInput = Translate.translate(fromLang, toLang, userInput).toLowerCase();
    // // System.out.println(userInput);
    // }catch(Exception g){
    //   return;
    // }

      chatField.setText("");
      chatArea.append(name+": " + userInputUnformatted+"\n"); 
      
      
      
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
}


  // --------------------------------------------------------------------------------------------------
  public static void main(String[] args) {

    //USE THIS TO ENSURE JAVA IMAGE ICON AND DICTONARY WORKS, make sure image is in here!
   // String dir = System.getProperty("user.dir");
  // directory from where the program was launched
  // System.out.println(dir);


  SwingUtilities.invokeLater(new Runnable() {
    @Override
    //run method
    public void run() {
        
        try {
            UIManager.setLookAndFeel(UIManager
                    .getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        //creating a new gui
        ChatBot preChatGUI = new ChatBot();
        //calling the preDisplay gui first
        preChatGUI.preDisplay();
        
        
    }
});

    
    


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



  // ---------------------------------------------------------------------------------------------------------
   // this is a method which fills in the business map with its respective key and
  // value depending on which map it is
  // via a process of elimination by if and else which determines what the key
  // will be
  public static void fillInBusinessMap(HashMap<String, String> map, String value) {

    // this loops through each movie object, and initializes the respective map with
    // this movie key
    for (int i = 0; i < listOfBusiness.size(); i++) {

      // if (value == "business name") {
      //   map.put(listOfBusiness.get(i).getbusinessName().toLowerCase(), "Ryan Reynolds is the " + listOfBusiness.get(i).getbusinessPosition().toLowerCase() + " of " + listOfBusiness.get(i).getbusinessName().toLowerCase());

      // } else 
      if (value == "year") {
        map.put(listOfBusiness.get(i).getbusinessName().toLowerCase(), "The year that Ryan Reynolds started " + listOfBusiness.get(i).getbusinessName().toLowerCase() + " is " + listOfBusiness.get(i).getyearStarted());

      } else if (value == "location") {
        map.put(listOfBusiness.get(i).getbusinessName().toLowerCase(), " The location is " + listOfBusiness.get(i).getbusinessLocation().toLowerCase());
      
      } else if (value == "position") {
        map.put(listOfBusiness.get(i).getbusinessName().toLowerCase(), " The position is " + listOfBusiness.get(i).getbusinessPosition().toLowerCase() + " of " + listOfBusiness.get(i).getbusinessName());
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

    wordForWord(userInput);

    if(speltCorrectly == true){
    analyzeInput(userInput);
  }else{
    chatArea.append("Your message is spelt wrong! Try again.\n");
  }
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

    // if the userInput does not contain a movie title but contains a personal question,
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

    // if the userInput contains a business name , we segregate ithe users query to
    // being about business
    for (int j = 0; j < listOfBusiness.size(); j++) {
      if (userInput.contains(listOfBusiness.get(j).getbusinessName().toLowerCase())) {
        businesNameAsked = listOfBusiness.get(j).getbusinessName().toLowerCase();

        // then we send the user input and the movie title asked about to a chat
        // function which determines
        // the robots reponse
        businessChatFunction(userInput, businesNameAsked);
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

    
      if (userInput.contains(movieQuestion.get(0))) {

       chatArea.append("Ryan Reynolds: " + movieTitleAsked + " " + imdbMap.get(movieTitleAsked)+"\n");
       return;

      } else if (userInput.contains(movieQuestion.get(1))) {
        chatArea.append("Ryan Reynolds: " + movieTitleAsked + " " + yearMap.get(movieTitleAsked)+"\n");
        return;

      } else if (userInput.contains(movieQuestion.get(2))) {
        chatArea.append("Ryan Reynolds: " + movieTitleAsked + " " + ratingMap.get(movieTitleAsked)+"\n");
        return;

      } else if (userInput.contains(movieQuestion.get(3))) {
        chatArea.append("Ryan Reynolds: " + movieTitleAsked + " " + castMap.get(movieTitleAsked)+"\n");
        return;
      } else if (userInput.contains(movieQuestion.get(4))) {
        chatArea.append("Ryan Reynolds: " + movieTitleAsked + " " + directorMap.get(movieTitleAsked)+"\n");
        return;
      } else if (userInput.contains(movieQuestion.get(5))) {
        chatArea.append("Ryan Reynolds: " + movieTitleAsked + " " + genreMap.get(movieTitleAsked)+"\n");
        return;
      } else if (userInput.contains(movieQuestion.get(6))) {
        chatArea.append("Ryan Reynolds: " + movieTitleAsked + " " + awardsMap.get(movieTitleAsked)+"\n");
        return;
      } else if (userInput.contains(movieQuestion.get(7))) {
        chatArea.append("Ryan Reynolds: " + movieTitleAsked + " " + boxOfficeMap.get(movieTitleAsked)+"\n");
        return;
      } else if (userInput.contains(movieQuestion.get(8))) {
        chatArea.append("Ryan Reynolds: " + movieTitleAsked + " " + locationMap.get(movieTitleAsked)+"\n");
        return;
      } else if (userInput.contains(movieQuestion.get(9)) || userInput.contains(movieQuestion.get(10))) {
        chatArea.append("Ryan Reynolds: " + movieTitleAsked + " " + timeToFilmMap.get(movieTitleAsked)+"\n");
        return;
      } else if (userInput.contains(movieQuestion.get(11)) || userInput.contains(movieQuestion.get(12))) {
        chatArea.append("Ryan Reynolds: " + movieTitleAsked + " " + durationMap.get(movieTitleAsked)+"\n");
        return;
      } else if (userInput.contains(movieQuestion.get(13))) {
        chatArea.append("Ryan Reynolds: " + movieTitleAsked + " " + budgetMap.get(movieTitleAsked)+"\n");
        return;
      } else {

        return;
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

   // ---------------------------------------------------------------------------------------------------------
  // This is the business chat function for the chatbot, which loops through the
  // business questions and determines
  // depending on which question is asked how the bot will respond using the
  // corresponding map and key value pair
  public static void businessChatFunction(String userInput, String businessNameAsked) {

    
      if (userInput.contains(businessQuestion.get(0))) {
       chatArea.append("Ryan Reynolds: " + yearStartedMap.get(businessNameAsked) +"\n");
       return;

      } else if (userInput.contains(businessQuestion.get(1))) {
        chatArea.append("Ryan Reynolds: " +businessLocationMap.get(businessNameAsked)+"\n");
        return;

      } else if (userInput.contains(businessQuestion.get(2))) {
        chatArea.append("Ryan Reynolds: " +businessPositionMap.get(businessNameAsked)+"\n");
        return;
      } else {

        return;
      }
    

  }

  // ---------------------------------------------------------------------------------------------------------

  // ------------------------------------------------------------------------------------------------------------------
  // below is the ask a question method which determines if the bot asks the
  // question back to the user or not

  public static void askAQuestionResponse() {
    int random = (int) (Math.random() * 6); // 1/6 of the time the chat bot asks a question back to the user

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

//--------------------------------------------------------------------------------------------------------

  public static void wordForWord(String userInput) {
    splitInput = userInput.split(" ");
    oneWordWrong = false;
    for(int i=0; i<splitInput.length;i++) {
      if(oneWordWrong == false){
      isMySpellingRight(splitInput[i],"dictonary.txt");
      }else{
        break;
      }
    }
    
  }
  
  public static void isMySpellingRight(String userInput, String filePath) {
    
    try{
     FileReader fr = new FileReader(filePath);
     BufferedReader in = new BufferedReader(fr);
     
     String word;
     while((word = in.readLine())!= null) {
       
       if(userInput.equals(word)) {
         speltCorrectly = true;
         oneWordWrong = false;
         break;
       }else {
         speltCorrectly = false;
         oneWordWrong = true;
       }
     }
     in.close();}catch(Exception e){
       return;
     }
  }
  

}
































