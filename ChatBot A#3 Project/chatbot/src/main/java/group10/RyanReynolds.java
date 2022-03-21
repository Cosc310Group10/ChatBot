package group10;

// GROUP 10 COSC 310 Ryan Reynolds Class ** Finished ** 
// **A#3 FINISHED VERSION**
/*
By:
LANCE ROGAN, STUDENT #62708938 BLAKE ABLITT, STUDENT #37099595 BEN VAN BERGEYK, STUDENT #95307054 
GRIFFIN WILCHUK, STUDENT #75303370 CARLA MATHER, STUDENT #22779193
*/

import java.util.ArrayList;
import java.util.Arrays;

public class RyanReynolds {

    // Attributes below (referring to physical characteristics)
    // height
    private String height;
    // weight
    private int weight;
    // hair colour
    private String haircolour;
    // eye colour
    private String eyecolour;
    // gender
    private String gender;

    // Personal Information below
    // birth place
    private String birthPlace;
    // birth date
    private String birthDate;
    // wife
    private String wifeName;
    // kids
    private ArrayList<String> kidNames = new ArrayList<>(Arrays.asList("Inez", "Betty", "James"));
    // social media handle
    private String socialMediaHandle;
    // twitter following
    private int twitterFollowers;
    // instagram following
    private int instagramFollowers;
    // tiktok following
    private int tiktokFollowers;
    // Net Worth
    private String netWorth;
    // previous marriage
    private String previousMarriage;
    // other awards
    private ArrayList<String> otherAwards = new ArrayList<>(Arrays.asList("People Magazine's Sexiest Man Alive",
            "Hollywood Walk of Fame", "Governor General's Performing Arts Awards: National Arts Centre Award"));

    // Ryan Reynolds Movie objects / attributes below
    // Deadpool
    ArrayList<String> deadpoolCast = new ArrayList<>(Arrays.asList("Me", "Morena Baccarin", " T.J. Miller", "Ed Skrein",
            "Karan Soni", "Michael Benyaer", "Stefan Kapicic", "Brianna Hildebrand", "Style Dayne", "Kyle Cassie",
            "Taylor Hickson", "Ayzee", "Naika Toussaint", "Randal Reeder", "Isaac C. Singleton Jr.", "Justyn Shippelt",
            "Donna Tamamotot", "Jed Rees"));
    ArrayList<String> deadpoolAwards = new ArrayList<>(Arrays.asList("Saturn Award", "All Def Movie Award", "ACCA",
            "Critics Choice Award", "Artios Award", "DFCS Award", "Dragon Award", "Empire Award", "Golden Schmoes",
            "Golden Trailer", "HFCS Award", "IGN People's Choice Award", "MTV Movie Award", "OFTA Film Award",
            "Maxwell Weinberg Award", "Teen Choice Award"));
    private Movie deadpool = new Movie(8, "Deadpool", 2016, "R", deadpoolCast, "Tim Miller", "Action and Comedy",
            deadpoolAwards, "783,100,000", "Vancouver", "48 days", "1hr 48m", "58,000,000");

    // getter for deadpool movie
    public Movie getDeadpool() {
        return deadpool;
    }

    // Deadpool 2
    ArrayList<String> deadpool2Cast = new ArrayList<>(
            Arrays.asList("Me", "Josh Brolin", "Morena Baccarin", "Julian Dennison", "Zazie Beetz", "T.J. Miller",
                    "Leslie Uggams", "Karan Soni", "Brianna Hildebrand", "Jack Kesy", "Eddie Marsan", "Shioli Kutsuna",
                    "Stefan Kapicic", "Randal Reeder", "Nikolai Witschl", "Thayr Harris", "Rob Delaney", "Lewis Tan"));
    ArrayList<String> deadpool2Awards = new ArrayList<>(
            Arrays.asList("Golden Schmoes", "Golden Trailer", "Aurora Award"));
    private Movie deadpool2 = new Movie(7.7, "Deadpool 2", 2018, "R", deadpool2Cast, "David Leitch",
            "Action and Comedy", deadpool2Awards, "785,000,000", "Vancouver", "N/A", "2 hours", "110,000,000");

    // getter for deadpool 2 movie
    public Movie getDeadpool2() {
        return deadpool2;
    }

    // Free guy
    ArrayList<String> freeGuyCast = new ArrayList<>(
            Arrays.asList("Me", "Jodie Comer", "Taika Waititi", "Lil Rel Howery", "Joe Keery", "Utkarsh Ambudkar",
                    "Channing Tatum", "Aaron W Reed", "Britne Oldford", "Camille Kostek", "Mark Lainer", "Mike Devine",
                    "Sophie Levy", "Vernon Scott", "Naheem Garcia", "Anabel Graetz", "Ric Plamenco", "Kenneth Israel"));
    ArrayList<String> freeGuyAwards = new ArrayList<>(Arrays.asList("Golden Angel Award", "SFC Award", "WFCC Award"));
    private Movie freeGuy = new Movie(7.2, "Free Guy", 2021, "PG-13", freeGuyCast, "Shawn Levy", "Action and Comedy",
            freeGuyAwards, "331,500,000", "Boston", "N/A", "1hr 55m", "125,000,000");

    // getter for free guy movie
    public Movie getFreeGuy() {
        return freeGuy;
    }

    // R.I.P.D
    ArrayList<String> ripdCast = new ArrayList<>(Arrays.asList("Me", "Jeff Bridges", "Mary-Lousie Parker",
            "Kevin Bacon", "Stephanie Szostak", "James Hong", "Marisa Miller", "Robert Knepper", "Mike O'Malley",
            "Devin Ratray", "Larry Joe Campbell", "Michael Coons", "Chris Everett", "Michael Tow", "Lonnie Farmer",
            "Piper Mackenzie", "Ben Sloane", "Duncan B. Putney"));
    ArrayList<String> ripdAwards = new ArrayList<>(Arrays.asList("None"));
    private Movie ripd = new Movie(5.6, "R.I.P.D", 2013, "PG-13", ripdCast, "Robert Schwentke", "Action and Comedy",
            ripdAwards, "78,300,000", "Boston", "N/A", "1hr 36m", "154,000,000");

    // getter for ripd movie
    public Movie getRIPD() {
        return ripd;
    }

    // Green Lantern
    ArrayList<String> greenLanternCast = new ArrayList<>(
            Arrays.asList("Me", "Blake Lively", "Peter Sarsgaard", "Mark Strong", "Tim Robbins", "Jay O. Sanders",
                    "Taika Waititi", "Angela Bassett", "Mike Doyle", "Nick Jandl", "Dylan James", "Gattlin Griffith",
                    "Jon Tenney", "Leanne Cochran", "Temuera Morrison", "Jeff Wolfe", "Lena Clark", "Jenna Craig"));
    ArrayList<String> greenLanternAwards = new ArrayList<>(
            Arrays.asList("ASCAP Award", "Golden Schmoes", "HPA Awards"));
    private Movie greenLantern = new Movie(5.5, "Green Lantern", 2011, "PG-13", greenLanternCast, "Martin Campbell",
            "Action and Sci-Fi", greenLanternAwards, "219,900,000", "Los Angeles", "Approximately 6 months", "2hr 3m",
            "200,000,000");

    // getter for green lantern movie
    public Movie getGreenLantern() {
        return greenLantern;
    }

    // Buried
    ArrayList<String> buriedCast = new ArrayList<>(Arrays.asList("Me", "Jose Luis Garcia Perez", "Robert Paterson",
            "Stephen Tobolowsky", "Samantha Mathis", "Ivana Mino", "Warner Loughlin", "Erik Palladino", "Kali Rocha",
            "Chris William Martin", "Cade Dundish", "Mary Birdsong", "Kirk Baily", "Anne Lockhart", "Robert Clotworthy",
            "Mitchalla Petersen", "Juan Hidalgo", "Abdelilah Ben Massou"));
    ArrayList<String> buriedAwards = new ArrayList<>(Arrays.asList("ASECAN Award", "Bronze Frog", "CEC Award",
            "Critics Award", "Chainsaw Award", "Prix Nouveau Genre", "Gaudi Award", "Goya", "Jose Maria Forque Award",
            "NBR Award", "Georges Award", "Sant Jordi", "Grand Prize of European Fantasy Film in Gold"));
    private Movie buried = new Movie(7.0, "Buried", 2010, "R", buriedCast, "Rodrigo Cortes",
            "Drama, Mystery, and Thriller", buriedAwards, "21,300,000", "Barcelona", "16 days", "1hr 35m", "2,000,000");

    // getter for buried movie
    public Movie getBuried() {
        return buried;
    }

    // 6 Underground
    ArrayList<String> sixUndergroundCast = new ArrayList<>(Arrays.asList("Me", "Melanie Laurent", "Manuel Garcia-Rulfo",
            "Ben Hardy", "Adira Arjona", "Dave Franco", "Corey Hawkins", "Lior Raz", "Payman Maadi",
            "Yuri Kolokolnikov", "Kim Kold", "Lidia Franco", "James Murray", "Lukhanyo Bele", "George Kareman",
            "James Carroll Jordan", "Ron Funches", "Daniel Adegboyega"));
    ArrayList<String> sixUndergroundAwards = new ArrayList<>(Arrays.asList("Taurus World Stunt Award"));
    private Movie sixUnderground = new Movie(6.1, "6 Underground", 2019, "R", sixUndergroundCast, "Michael Bay",
            "Action and Thriller", sixUndergroundAwards, "N/A", "Abu Dhabi", "30 days", "2hr 8m", "150,000,000");

    // getter for 6 Underground movie
    public Movie getSixUnderground() {
        return sixUnderground;
    }

    // Red Notice
    ArrayList<String> redNoticeCast = new ArrayList<>(Arrays.asList("Me", "Dwayne Johnson", "Gal Gadot", "Ritu Arya",
            "Chris Diamantopoulos", "Ivan Mbakop", "Vincenzo Amato", "Rafael Petardi", "Seth Michaels",
            "Sebastien Large", "Guy Nardulli", "Andrew Hunter", "George Tsai", "Rawson Marshall Thurber", "Robert Mata",
            "Anthony Belevtsov", "Daniel Bernhardt", "Yosef Podolski"));
    ArrayList<String> redNoticeAwards = new ArrayList<>(Arrays.asList("N/A"));
    private Movie redNotice = new Movie(6.3, "Red Notice", 2021, "PG-13", redNoticeCast, "Rawson Marshall Thurber",
            "Action, Comedy, and Thriller", redNoticeAwards, "2,000,000", "Atlanta", "N/A", "1hr 57m", "200,000,000");

    // getter for red notice movie
    public Movie getRedNotice() {
        return redNotice;
    }

    // Self/Less
    ArrayList<String> selfLessCast = new ArrayList<>(Arrays.asList("Me", "Natalie Martinez", "Matthew Goode",
            "Ben Kingsley", "Victor Garber", "Derek Luke", "Jaynee-Lynne Kinchen", "Melora Hardin", "Michelle Dockery",
            "Sam Page", "Brendan McCarthy", "Thomas Francis Murphy", "Sandra Ellis Lafferty", "Emily Tremaine",
            "Griff Furst", "Cedric Palmisano", "Tom Waite", "Douglas M. Griffin"));
    ArrayList<String> selfLessAwards = new ArrayList<>(Arrays.asList("N/A"));
    private Movie selfLess = new Movie(6.5, "Self/Less", 2015, "PG-13", selfLessCast, "Tarsem Singh",
            "Action, Mystery, and Sci-Fi", selfLessAwards, "30,500,000", "New Orleans", "N/A", "1hr 57m", "26,000,000");

    // getter for self/less movie
    public Movie getSelfLess() {
        return selfLess;
    }

    // The Hitman's Bodyguard
    ArrayList<String> theHitmansBodyguardCast = new ArrayList<>(Arrays.asList("Me", "Samuel L. Jackson", "Gary Oldman",
            "Elodie Yung", "Tsuwayuki Saotome", "Roy Hill", "Richard E. Grant", "Rod Hallett", "Yuri Kolokolnikov",
            "Nadia Konakchieva", "Valentin Stojanov", "Noortje Herlaar", "Georgie Glen", "Michael Gor", "Barry Atsma",
            "Ralitsa Vassileva", "Abigail McLoughlin", "Bradley John"));
    ArrayList<String> theHitmansBodyguardAwards = new ArrayList<>(Arrays.asList("Golden Trailer"));
    private Movie theHitmansBodyguard = new Movie(6.9, "The Hitman's Bodyguard", 2017, "R", theHitmansBodyguardCast,
            "Patrick Hughes", "Action, Comedy, and Crime", theHitmansBodyguardAwards, "176,600,000", "Amsterdam", "N/A",
            "1hr 58m", "69,000,000");

    // getter for the hitmans bodyguard movie
    public Movie getTheHitmansBodyguard() {
        return theHitmansBodyguard;
    }

    // Change up
    ArrayList<String> changeUpCast = new ArrayList<>(Arrays.asList("Me", "Jason Bateman", "Olivia Wilde", "Leslie Mann",
            "Alan Arkin", " Mircea Monroe", "Gregory Itzin", "Ned Schmidtke", "Ming Lo", "Sydney Rouviere",
            "Craig Bierko", "Dax Griffin", "Andrea Moore", "Matthew Cornwell", "Taaffe O'Connell", "Fred Stoller",
            "Faith Alhadeff", "Luke Bain"));
    ArrayList<String> changeUpAwards = new ArrayList<>(Arrays.asList("N/A"));
    private Movie changeUp = new Movie(6.3, "The Change-up", 2011, "R", changeUpCast, "David Dobkin",
            "Comedy and Fantasy", changeUpAwards, "75,500,000", "Alpharetta, Georgia", "N/A", "1hr 52m", "52,000,000");

    // getter for change up movie
    public Movie getChangeUp() {
        return changeUp;
    }

    // The Proposal
    ArrayList<String> theProposalCast = new ArrayList<>(Arrays.asList("Me", "Sandra Bullock", "Mary Steenburgen",
            "Craig T. Nelson", "Betty White", "Denis O'Hare", "Oscar Nuñez", "Aasif Mandvi", "Michael Nouri",
            "Michael Mosley", "Dale Place", "Alicia Hunt", "Alexis Garcia", "Kortney Adams", "Chris Whitney",
            "	Lee Wesley", "Gregg Edelman", "Phyllis Kay"));
    ArrayList<String> theProposalAwards = new ArrayList<>(Arrays.asList("BMI Film Music Award", "People's Choice Award",
            "Rembrandt Award", "Teen Choice Award", "WIN Award"));
    private Movie theProposal = new Movie(6.7, "The Proposal", 2009, "PG-13", theProposalCast, "Anne Fletcher",
            "Comedy, Drama, Romance", theProposalAwards, "317,400,000", "Sitka, Alaska", "2 months", "1hr 48m",
            "40,000,000");

    // getter for the proposal movie
    public Movie getTheProposal() {
        return theProposal;
    }

    // ---------------------------------------------------------------------------------------------------------
    // adding the buisnees class info in
    // ryan reynolds businesses
    // Mint Mobile
    private Business mintMobileInfo = new Business("Mint Mobile", 2019, "Costa Mesa, California", "Owner");

    // getter for Mint Mobile
    public Business getMintMoblie() {
        return mintMobileInfo;
    }

    // Maximum Effort
    private Business maximumEffortInfo = new Business("Maximum Effort", 2018, "New York, New York", "Co-Founder");

    // getter for Maximum Effort
    public Business getMaximumEffort() {
        return maximumEffortInfo;
    }

    // Aviation American Gin
    private Business aviationAmericanGinInfo = new Business("Aviation American Gin", 2018, "New York, New York",
            "Owner");

    // getter for Aviation American Gin
    public Business getAviationAmericanGin() {
        return aviationAmericanGinInfo;
    }

    // Wrexham AFC
    private Business wrexhamAFCInfo = new Business("Wrexham AFC", 2021, "Wrexham, North Wales", "Co-Chairman");

    // getter for Wrexham AFC
    public Business getwrexhamAFC() {
        return wrexhamAFCInfo;
    }

    // Group Effort Initiative
    private Business groupEffortInitiativeInfo = new Business("Group Effort Initiative", 2020, "New York, New York",
            "Co-Founder");

    // getter for Group Effort Initiative
    public Business getgroupEffortInitiative() {
        return groupEffortInitiativeInfo;
    }

    // MNTN
    private Business mNTNInfo = new Business("MNTN", 2021, "New York, New York", "Chief Creative Officer");

    // getter for MNTN
    public Business getMNTN() {
        return mNTNInfo;
    }

    // Constructors below
    // RyanReynolds Constructor for all physical attributes

    RyanReynolds(String height, int weight, String eyecolour, String haircolour, String gender) {
        this.height = height;
        this.weight = weight;
        this.eyecolour = eyecolour;
        this.haircolour = haircolour;
        this.gender = gender;
    }

    // RyanReynolds Constructor for all personal information

    RyanReynolds(String birthPlace, String birthDate, String wifeName, String socialMediaHandle, int twitterFollowers,
            int instagramFollowers, int tiktokFollowers, String netWorth, String previousMarriage) {
        this.birthPlace = birthPlace;
        this.birthDate = birthDate;
        this.wifeName = wifeName;
        this.haircolour = socialMediaHandle;
        this.twitterFollowers = twitterFollowers;
        this.instagramFollowers = instagramFollowers;
        this.tiktokFollowers = tiktokFollowers;
        this.netWorth = netWorth;
        this.previousMarriage = previousMarriage;
    }

    // RyanReynolds Constructor for all physical attributes and personal information
    // (i.e, full RyanReynolds constructor)

    RyanReynolds(String height, int weight, String eyecolour, String haircolour, String gender, String birthPlace,
            String birthDate, String wifeName, String socialMediaHandle, int twitterFollowers, int instagramFollowers,
            int tiktokFollowers, String netWorth, String previousMarriage) {
        this.height = height;
        this.weight = weight;
        this.eyecolour = eyecolour;
        this.haircolour = haircolour;
        this.gender = gender;
        this.birthPlace = birthPlace;
        this.birthDate = birthDate;
        this.wifeName = wifeName;
        this.socialMediaHandle = socialMediaHandle;
        this.twitterFollowers = twitterFollowers;
        this.instagramFollowers = instagramFollowers;
        this.tiktokFollowers = tiktokFollowers;
        this.netWorth = netWorth;
        this.previousMarriage = previousMarriage;
    }

    RyanReynolds() {

    }

    // getters and setters below
    public String getheight() {
        return height;
    }

    public void setheight(String height) {
        this.height = height;
    }

    public int getweight() {
        return weight;
    }

    public void setweight(int weight) {
        this.weight = weight;
    }

    public String geteyecolour() {
        return eyecolour;
    }

    public void seteyecolour(String eyecolour) {
        this.eyecolour = eyecolour;
    }

    public String gethaircolour() {
        return haircolour;
    }

    public void sethaircolour(String haircolour) {
        this.haircolour = haircolour;
    }

    public String getgender() {
        return gender;
    }

    public void setgender(String gender) {
        this.gender = gender;
    }

    // getters and setters for information
    public String getbirthPlace() {
        return birthPlace;
    }

    public void setbirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getbirthDate() {
        return birthDate;
    }

    public void setbirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getwifeName() {
        return wifeName;
    }

    public void setwifeName(String wifeName) {
        this.wifeName = wifeName;
    }

    public ArrayList<String> getkidNames() {
        return kidNames;
    }

    public void setkidNames(ArrayList<String> kidNames) {
        this.kidNames = kidNames;
    }

    public String getsocialMediaHandle() {
        return socialMediaHandle;
    }

    public void setsocialMediaHandle(String socialMediaHandle) {
        this.socialMediaHandle = socialMediaHandle;
    }

    public int gettwitterFollowers() {
        return twitterFollowers;
    }

    public void setinstagramFollowers(int instagramFollowers) {
        this.instagramFollowers = instagramFollowers;
    }

    public int getinstagramFollowers() {
        return instagramFollowers;
    }

    public void settiktokFollowers(int tiktokFollowers) {
        this.tiktokFollowers = tiktokFollowers;
    }

    public int gettiktokFollowers() {
        return tiktokFollowers;
    }

    public void settwitterFollowers(int twitterFollowers) {
        this.twitterFollowers = twitterFollowers;
    }

    public String getnetWorth() {
        return netWorth;
    }

    public void setnetWorth(String netWorth) {
        this.netWorth = netWorth;
    }

    public String getpreviousMarriage() {
        return previousMarriage;
    }

    public void setpreviousMarriage(String previousMarriage) {
        this.previousMarriage = previousMarriage;
    }

    public ArrayList<String> getotherAwards() {
        return otherAwards;
    }

    public void setotherAwards(ArrayList<String> otherAwards) {
        this.otherAwards = otherAwards;
    }

}
