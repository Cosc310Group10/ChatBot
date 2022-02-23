import java.util.ArrayList;
import java.util.Arrays;

public class RyanReynolds {

  // Space for attributes and other info.....


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
    ArrayList<String> deadpool2Cast = new ArrayList<>(Arrays.asList("Me", "Josh Brolin", "Morena Baccarin","Julian Dennison", "Zazie Beetz", " T.J. Miller", "Leslie Uggams", "Karan Soni","Brianna Hildebrand","Jack Kesy", "Eddie Marsan", "Shioli Kutsuna","Stefan Kapicic", "Randal Reeder", "Nikolai Witschl", "Thayr Harris", "Rob Delaney", "Lewis Tan"));
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

    // Getting groups opinion for the rest of detail below: 
    //Green Lantern**
    ArrayList<String> greenLaternCast = new ArrayList<>(Arrays.asList("Me", "Josh Brolin", "Morena Baccarin","Julian Dennison", "Zazie Beetz", " T.J. Miller", "Leslie Uggams", "Karan Soni","Brianna Hildebrand","Jack Kesy", "Eddie Marsan", "Shioli Kutsuna","Stefan Kapicic", "Randal Reeder", "Nikolai Witschl", "Thayr Harris", "Rob Delaney", "Lewis Tan"));
    ArrayList<String> greenLaternAwards = new ArrayList<>(Arrays.asList("Golden Schmoes", "Golden Trailer", "Aurora Award"));
    private Movie greenLatern = new Movie(7.7,"Deadpool 2",2018,"R",deadpool2Cast,"David Leitch","Action and Comedy",deadpool2Awards,"785,000,000");

    //getter for green lantern movie**
    public Movie getGreenLatern(){
        return greenLatern;
    }

    //Buried**
    ArrayList<String> buriedCast = new ArrayList<>(Arrays.asList("Me", "Josh Brolin", "Morena Baccarin","Julian Dennison", "Zazie Beetz", " T.J. Miller", "Leslie Uggams", "Karan Soni","Brianna Hildebrand","Jack Kesy", "Eddie Marsan", "Shioli Kutsuna","Stefan Kapicic", "Randal Reeder", "Nikolai Witschl", "Thayr Harris", "Rob Delaney", "Lewis Tan"));
    ArrayList<String> buriedAwards = new ArrayList<>(Arrays.asList("Golden Schmoes", "Golden Trailer", "Aurora Award"));
    private Movie buried = new Movie(7.7,"Deadpool 2",2018,"R",deadpool2Cast,"David Leitch","Action and Comedy",deadpool2Awards,"785,000,000");

    //getter for buried movie**
    public Movie getBuried(){
        return buried;
    }

    //6 Underground**
    ArrayList<String> sixUndergroundCast = new ArrayList<>(Arrays.asList("Me", "Josh Brolin", "Morena Baccarin","Julian Dennison", "Zazie Beetz", " T.J. Miller", "Leslie Uggams", "Karan Soni","Brianna Hildebrand","Jack Kesy", "Eddie Marsan", "Shioli Kutsuna","Stefan Kapicic", "Randal Reeder", "Nikolai Witschl", "Thayr Harris", "Rob Delaney", "Lewis Tan"));
    ArrayList<String> sixUndergroundAwards = new ArrayList<>(Arrays.asList("Golden Schmoes", "Golden Trailer", "Aurora Award"));
    private Movie sixUnderground = new Movie(7.7,"Deadpool 2",2018,"R",deadpool2Cast,"David Leitch","Action and Comedy",deadpool2Awards,"785,000,000");

    //getter for 6 Underground movie**
    public Movie getSixUnderground(){
        return sixUnderground;
    }

    //Red Notice**
    ArrayList<String> redNoticeCast = new ArrayList<>(Arrays.asList("Me", "Josh Brolin", "Morena Baccarin","Julian Dennison", "Zazie Beetz", " T.J. Miller", "Leslie Uggams", "Karan Soni","Brianna Hildebrand","Jack Kesy", "Eddie Marsan", "Shioli Kutsuna","Stefan Kapicic", "Randal Reeder", "Nikolai Witschl", "Thayr Harris", "Rob Delaney", "Lewis Tan"));
    ArrayList<String> redNoticeAwards = new ArrayList<>(Arrays.asList("Golden Schmoes", "Golden Trailer", "Aurora Award"));
    private Movie redNotice = new Movie(7.7,"Deadpool 2",2018,"R",deadpool2Cast,"David Leitch","Action and Comedy",deadpool2Awards,"785,000,000");

    //getter for red notice movie**
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
}
