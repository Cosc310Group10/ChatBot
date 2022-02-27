import java.util.ArrayList;
import java.util.Arrays;

public class RyanReynolds {

  // Attributes below(referring to physical characteristics)
    //height
    private String height;
    //weight
    private int weight;
    //hair colour
    private String haircolour;
    //eye colour
    private String eyecolour;
    //gender
    private String gender;

  // Information below
    //birth place
    private String birthPlace;
    //birth date
    private String birthDate;
    //wife
    private String wifeName;
    //kids
    private ArrayList<String> kidNames;
    //social media handle
    private String socialMediaHandle;
    //twitter following
    private int twitterFollowers;
    //instagram following
    private int instagramFollowers;
    //tiktok following
    private int tiktokFollowers;
    //Net Worth
    private String netWorth;
    //previous marriage
    private String previousMarriage;
    //other awards
    private ArrayList<String> otherAwards;

    // ****IN PROGRESS BELOW, NOT FINISHED***
    // --> Lance creating movie objects below
    //Creating 12 different movie objects for Ryan Reynolds
    //NOTE: These movies include either contain the full cast and all awards, or either a sample of the cast and awards and
    //do not include all of the awards or the entire cast

    //Deadpool
    ArrayList<String> deadpoolCast = new ArrayList<>(Arrays.asList("Me","Morena Baccarin", " T.J. Miller","Ed Skrein","Karan Soni","Michael Benyaer","Stefan Kapicic", "Brianna Hildebrand", "Style Dayne","Kyle Cassie", "Taylor Hickson", "Ayzee", "Naika Toussaint", "Randal Reeder", "Isaac C. Singleton Jr.", "Justyn Shippelt","Donna Tamamotot", "Jed Rees"));
    ArrayList<String> deadpoolAwards = new ArrayList<>(Arrays.asList("Saturn Award","All Def Movie Award","ACCA","Critics Choice Award", "Artios Award","DFCS Award","Dragon Award","Empire Award","Golden Schmoes","Golden Trailer","HFCS Award","IGN People's Choice Award","MTV Movie Award","OFTA Film Award","Maxwell Weinberg Award","Teen Choice Award"));
    private Movie deadpool = new Movie(8,"Deadpool",2016,"R",deadpoolCast,"Tim Miller","Action and Comedy",deadpoolAwards,"783,100,000");

    //getter for deadpool movie
    public Movie getDeadpool(){
        return deadpool;
    }

    //Deadpool 2
    ArrayList<String> deadpool2Cast = new ArrayList<>(Arrays.asList("Me", "Josh Brolin", "Morena Baccarin","Julian Dennison", "Zazie Beetz", "T.J. Miller", "Leslie Uggams", "Karan Soni","Brianna Hildebrand","Jack Kesy", "Eddie Marsan", "Shioli Kutsuna","Stefan Kapicic", "Randal Reeder", "Nikolai Witschl", "Thayr Harris", "Rob Delaney", "Lewis Tan"));
    ArrayList<String> deadpool2Awards = new ArrayList<>(Arrays.asList("Golden Schmoes", "Golden Trailer", "Aurora Award"));
    private Movie deadpool2 = new Movie(7.7,"Deadpool 2",2018,"R",deadpool2Cast,"David Leitch","Action and Comedy",deadpool2Awards,"785,000,000");

    //getter for deadpool 2 movie
    public Movie getDeadpool2(){
        return deadpool2;
    }


    //Free guy
    ArrayList<String> freeGuyCast = new ArrayList<>(Arrays.asList("Me","Jodie Comer","Taika Waititi","Lil Rel Howery","Joe Keery","Utkarsh Ambudkar","Channing Tatum","Aaron W Reed","Britne Oldford","Camille Kostek", "Mark Lainer","Mike Devine","Sophie Levy","Vernon Scott","Naheem Garcia","Anabel Graetz","Ric Plamenco","Kenneth Israel"));
    ArrayList<String> freeGuyAwards = new ArrayList<>(Arrays.asList("Golden Angel Award", "SFC Award","WFCC Award"));
    private Movie freeGuy = new Movie(7.2,"Free Guy",2021,"PG-13",freeGuyCast,"Shawn Levy","Action and Comedy",freeGuyAwards,"331,500,000");

    //getter for free guy movie
    public Movie freeGuy(){
        return freeGuy;
    }

    //R.I.P.D
    ArrayList<String> ripdCast = new ArrayList<>(Arrays.asList("Me", "Jeff Bridges", "Mary-Lousie Parker","Kevin Bacon", "Stephanie Szostak", "James Hong", "Marisa Miller", "Robert Knepper","Mike O'Malley","Devin Ratray", "Larry Joe Campbell", "Michael Coons","Chris Everett", "Michael Tow", "Lonnie Farmer", "Piper Mackenzie", "Ben Sloane", "Duncan B. Putney"));
    ArrayList<String> ripdAwards = new ArrayList<>(Arrays.asList("None"));
    private Movie ripd = new Movie(5.6,"R.I.P.D",2013,"PG-13",ripdCast,"Robert Schwentke","Action and Comedy",ripdAwards,"78,300,000");

    //getter for ripd movie
    public Movie ripd(){
        return ripd;
    }

  
    //Green Lantern
    ArrayList<String> greenLanternCast = new ArrayList<>(Arrays.asList("Me", "Blake Lively", "Peter Sarsgaard","Mark Strong", "Tim Robbins", "Jay O. Sanders", "Taika Waititi", "Angela Bassett","Mike Doyle","Nick Jandl", "Dylan James", "Gattlin Griffith","Jon Tenney", "Leanne Cochran", "Temuera Morrison", "Jeff Wolfe", "Lena Clark", "Jenna Craig"));
    ArrayList<String> greenLanternAwards = new ArrayList<>(Arrays.asList("ASCAP Award", "Golden Schmoes", "HPA Awards"));
    private Movie greenLantern = new Movie(5.5,"Green Lantern",2011,"PG-13",greenLanternCast,"Martin Campbell","Action and Sci-Fi",greenLanternAwards,"219,900,000");

    //getter for green lantern movie
    public Movie getGreenLantern(){
        return greenLantern;
    }

    //Buried
    ArrayList<String> buriedCast = new ArrayList<>(Arrays.asList("Me", "Jose Luis Garcia Perez", "Robert Paterson","Stephen Tobolowsky", "Samantha Mathis", "Ivana Mino", "Warner Loughlin", "Erik Palladino","Kali Rocha","Chris William Martin", "Cade Dundish", "Mary Birdsong","Kirk Baily", "Anne Lockhart", "Robert Clotworthy", "Mitchalla Petersen", "Juan Hidalgo", "Abdelilah Ben Massou"));
    ArrayList<String> buriedAwards = new ArrayList<>(Arrays.asList("ASECAN Award", "Bronze Frog", "CEC Award", "Critics Award","Chainsaw Award","Prix Nouveau Genre", "Gaudi Award","Goya", "Jose Maria Forque Award","NBR Award","Georges Award","Sant Jordi","Grand Prize of European Fantasy Film in Gold"));
    private Movie buried = new Movie(7.0,"Buried",2010,"R",buriedCast,"Rodrigo Cortes","Drama, Mystery, and Thriller",buriedAwards,"21,300,000");

    //getter for buried movie
    public Movie getBuried(){
        return buried;
    }

    //6 Underground
    ArrayList<String> sixUndergroundCast = new ArrayList<>(Arrays.asList("Me", "Melanie Laurent", "Manuel Garcia-Rulfo","Ben Hardy", "Adira Arjona", "Dave Franco", "Corey Hawkins", "Lior Raz","Payman Maadi","Yuri Kolokolnikov", "Kim Kold", "Lidia Franco","James Murray", "Lukhanyo Bele", "George Kareman", "James Carroll Jordan", "Ron Funches", "Daniel Adegboyega"));
    ArrayList<String> sixUndergroundAwards = new ArrayList<>(Arrays.asList("Taurus World Stunt Award"));
    private Movie sixUnderground = new Movie(6.1,"6 Underground",2019,"R",sixUndergroundCast,"Michael Bay","Action and Thriller",sixUndergroundAwards,"N/A");

    //getter for 6 Underground movie
    public Movie getSixUnderground(){
        return sixUnderground;
    }

    //Red Notice
    ArrayList<String> redNoticeCast = new ArrayList<>(Arrays.asList("Me", "Dwayne Johnson", "Gal Gadot","Ritu Arya", "Chris Diamantopoulos", "Ivan Mbakop", "Vincenzo Amato", "Rafael Petardi","Seth Michaels","Sebastien Large", "Guy Nardulli", "Andrew Hunter","George Tsai", "Rawson Marshall Thurber", "Robert Mata", "Anthony Belevtsov", "Daniel Bernhardt", "Yosef Podolski"));
    ArrayList<String> redNoticeAwards = new ArrayList<>(Arrays.asList("N/A"));
    private Movie redNotice = new Movie(6.3,"Red Notice",2021,"PG-13",redNoticeCast,"Rawson Marshall Thurber","Action, Comedy, and Thriller",redNoticeAwards,"2,000,000");

    //getter for red notice movie
    public Movie getRedNotice(){
        return redNotice;
    }

    //Self/Less**
    ArrayList<String> selfLessCast = new ArrayList<>(Arrays.asList("Me", "Josh Brolin", "Morena Baccarin","Julian Dennison", "Zazie Beetz", " T.J. Miller", "Leslie Uggams", "Karan Soni","Brianna Hildebrand","Jack Kesy", "Eddie Marsan", "Shioli Kutsuna","Stefan Kapicic", "Randal Reeder", "Nikolai Witschl", "Thayr Harris", "Rob Delaney", "Lewis Tan"));
    ArrayList<String> selfLessAwards = new ArrayList<>(Arrays.asList("Golden Schmoes", "Golden Trailer", "Aurora Award"));
    private Movie selfLess = new Movie(7.7,"Deadpool 2",2018,"R",deadpool2Cast,"David Leitch","Action and Comedy",deadpool2Awards,"785,000,000");

    //getter for self/less movie**
    public Movie getSelfLess(){
        return selfLess;
    }


    //The Hitman's Bodyguard**
    ArrayList<String> theHitmansBodyguardCast = new ArrayList<>(Arrays.asList("Me", "Josh Brolin", "Morena Baccarin","Julian Dennison", "Zazie Beetz", " T.J. Miller", "Leslie Uggams", "Karan Soni","Brianna Hildebrand","Jack Kesy", "Eddie Marsan", "Shioli Kutsuna","Stefan Kapicic", "Randal Reeder", "Nikolai Witschl", "Thayr Harris", "Rob Delaney", "Lewis Tan"));
    ArrayList<String> theHitmansBodyguardAwards = new ArrayList<>(Arrays.asList("Golden Schmoes", "Golden Trailer", "Aurora Award"));
    private Movie theHitmansBodyguard = new Movie(7.7,"Deadpool 2",2018,"R",deadpool2Cast,"David Leitch","Action and Comedy",deadpool2Awards,"785,000,000");

    //getter for the hitmans bodyguard movie**
    public Movie getTheHitmansBodyguard(){
        return theHitmansBodyguard;
    }


    //Change up**
    ArrayList<String> changeUpCast = new ArrayList<>(Arrays.asList("Me", "Josh Brolin", "Morena Baccarin","Julian Dennison", "Zazie Beetz", " T.J. Miller", "Leslie Uggams", "Karan Soni","Brianna Hildebrand","Jack Kesy", "Eddie Marsan", "Shioli Kutsuna","Stefan Kapicic", "Randal Reeder", "Nikolai Witschl", "Thayr Harris", "Rob Delaney", "Lewis Tan"));
    ArrayList<String> changeUpAwards = new ArrayList<>(Arrays.asList("Golden Schmoes", "Golden Trailer", "Aurora Award"));
    private Movie changeUp = new Movie(7.7,"Deadpool 2",2018,"R",deadpool2Cast,"David Leitch","Action and Comedy",deadpool2Awards,"785,000,000");

    //getter for change up movie**
    public Movie getChangeUp(){
        return changeUp;
    }


    //The Proposal**
    ArrayList<String> theProposalCast = new ArrayList<>(Arrays.asList("Me", "Josh Brolin", "Morena Baccarin","Julian Dennison", "Zazie Beetz", " T.J. Miller", "Leslie Uggams", "Karan Soni","Brianna Hildebrand","Jack Kesy", "Eddie Marsan", "Shioli Kutsuna","Stefan Kapicic", "Randal Reeder", "Nikolai Witschl", "Thayr Harris", "Rob Delaney", "Lewis Tan"));
    ArrayList<String> theProposalAwards = new ArrayList<>(Arrays.asList("Golden Schmoes", "Golden Trailer", "Aurora Award"));
    private Movie theProposal = new Movie(7.7,"Deadpool 2",2018,"R",deadpool2Cast,"David Leitch","Action and Comedy",deadpool2Awards,"785,000,000");

    //getter for the proposal movie**
    public Movie getTheProposal(){
        return theProposal;
    }

    // Constructors below
    //RyanReynolds Constructor for all physical attributes

    RyanReynolds(String height, int weight,String eyecolour,String haircolour, String gender){
        this.height = height;
        this.weight = weight;
        this.eyecolour = eyecolour;
        this.haircolour = haircolour;
        this.gender = gender;
    }

    //RyanReynolds Constructor for all personal information

    RyanReynolds(String birthPlace, String birthDate,String wifeName,String socialMediaHandle, String netWorth, String previousMarriage, ArrayList<String> otherAwards){
        this.birthPlace = birthPlace;
        this.birthDate = birthDate;
        this.wifeName = wifeName;
        this.haircolour = socialMediaHandle;
        this.netWorth = netWorth;
        this.previousMarriage = previousMarriage;
        this.otherAwards = otherAwards;
    }

    //RyanReynolds Constructor for all physical attributes and personal information (i.e, full RyanReynolds constructor)

    RyanReynolds(String height, int weight,String eyecolour,String haircolour, String gender,String birthPlace, String birthDate,String wifeName,ArrayList<String> kidNames,String socialMediaHandle,int twitterFollowers,int instagramFollowers,int tiktokFollowers, String netWorth, String previousMarriage, ArrayList<String> otherAwards){
        this.height = height;
        this.weight = weight;
        this.eyecolour = eyecolour;
        this.haircolour = haircolour;
        this.gender = gender;
        this.birthPlace = birthPlace;
        this.birthDate = birthDate;
        this.wifeName = wifeName;
        this.kidNames = kidNames;
        this.haircolour = socialMediaHandle;
        this.twitterFollowers = twitterFollowers;
        this.instagramFollowers = instagramFollowers;
        this.tiktokFollowers = tiktokFollowers;
        this.netWorth = netWorth;
        this.previousMarriage = previousMarriage;
        this.otherAwards = otherAwards;
    }

    RyanReynolds(){

    }

    //getters and setters below
    public String getheight(){
        return height;
    }
    public void setheight(String height){
        this.height = height;
    }
    public int getweight(){
        return weight;
    }

    public void setweight(int weight){
        this.weight = weight;
    }
    public String geteyecolour(){
        return eyecolour;
    }
    public void seteyecolour(String eyecolour){
        this.eyecolour = eyecolour;
    }
    public String gethaircolour(){
        return haircolour;
    }
    public void sethaircolour(String haircolour){
        this.haircolour = haircolour;
    }
    public String getgender(){
        return gender;
    }
    public void setgender(String gender){
        this.gender = gender;
    }

    //getters and setters for information
    public String getbirthPlace(){
        return birthPlace;
    }

    public void setbirthPlace(String birthPlace){
        this.birthPlace = birthPlace;
    }

    public String getbirthDate(){
        return birthDate;
    }

    public void setbirthDate(String birthDate){
        this.birthDate = birthDate;
    }

    public String getwifeName(){
        return wifeName;
    }

    public void setwifeName(String wifeName){
        this.wifeName = wifeName;
    }

    public ArrayList<String> getkidNames(){
        return kidNames;
    }

    public void setkidNames(ArrayList<String> kidNames){
        this.kidNames = kidNames;
    }

    public String getsocialMediaHandle(){
        return socialMediaHandle;
    }

    public void setsocialMediaHandle(String socialMediaHandle){
        this.socialMediaHandle = socialMediaHandle;
    }

    public int gettwitterFollowers(){
        return twitterFollowers;
    }

    public void setinstagramFollowers(int instagramFollowers){
        this.instagramFollowers = instagramFollowers;
    }

    public int getinstagramFollowers(){
        return instagramFollowers;
    }

    public void settiktokFollowers(int tiktokFollowers){
        this.tiktokFollowers = tiktokFollowers;
    }

    public int gettiktokFollowers(){
        return tiktokFollowers;
    }

    public void settwitterFollowers(int twitterFollowers){
        this.twitterFollowers = twitterFollowers;
    }


    public String getnetWorth(){
        return netWorth;
    }

    public void setnetWorth(String netWorth){
        this.netWorth = netWorth;
    }

    public String getpreviousMarriage(){
        return previousMarriage;
    }

    public void setpreviousMarriage(String previousMarriage){
        this.previousMarriage = previousMarriage;
    }

    public ArrayList<String> getotherAwards(){
        return otherAwards;
    }

    public void setotherAwards(ArrayList<String> otherAwards){
        this.otherAwards = otherAwards;
    }

    //analyze function
    public String respond(String input){
    boolean searching = true;
    String movieName;
    String answer;
    String[] words = input.split("[\\s']");{
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].replaceAll("[^\\w]", "");
        }
    }
    while(searching){ //check movie title
        for (int i = 0; i < words.length; i++) {
            if(words[i]=="Deadpool"&&i+1==words.length){
                movieName = "Deadpool";
                searching = false;
                break;
            }
            if(words[i]=="Deadpool"&&words[i+1]!="2"){
                movieName = "Deadpool";
                break;
            }
            if(words[i]=="Deadpool"&&words[i+1]=="2"){
                movieName = "Deadpool 2";
                searching = false;
                break;
            }
            if(words[i]=="Free"&&words[i+1]=="Guy"){
                movieName = "Free Guy";
                searching = false;
                break;
            }
            if(words[i]=="R.I.P.D."||words[i]=="RIPD"||words[i]=="ripd"){
                movieName = "R.I.P.D.";
                searching = false;
                break;
            }
            if(words[i]=="Green"&&words[i+1]=="Lantern"){
                movieName = "Green Lantern";
                searching = false;
                break;
            }
            if(words[i]=="6"&&words[i+1]=="Underground"){
                movieName = "6 Underground";
                searching = false;
                break;
            }
            if(words[i]=="Red"&&words[i+1]=="Notice"){
                movieName = "Red Notice";
                searching = false;
                break;
            }
            if(words[i]=="Self/Less"||(words[i]=="Self"&&words[i+1]=="Less")){
                movieName = "Self/Less";
                searching = false;
                break;
            }
            if((words[i]=="Hitman's"&&words[i+1]=="Bodyguard")||(words[i]=="Hitmans"&&words[i+1]=="Bodyguard")){
                movieName = "Hitman's Bodyguard";
                searching = false;
                break;
            }
            if((words[i]=="Change"&&words[i+1]=="Up")||(words[i]=="Change"&&words[i+1]=="up")){
                movieName = "Change up";
                searching = false;
                break;
            }
            if(words[i]=="The"&&words[i+1]=="Proposal"){
                movieName = "The Proposal";
                searching = false;
                break;
            }
            else{
                answer = "I'm sorry I didn't get that.";
                searching = false;
            }
        }
        answer = "yes I was in " + movieName;
    }
    return "I'm sorry I didn't get that.";
    }

}

