import java.util.ArrayList;
import java.util.Arrays;

public class RyanReynolds {

  // Space for attributes and other info.....



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
    ArrayList<String> deadpool2Cast = new ArrayList<>(Arrays.asList("Me","Morena Baccarin", " T.J. Miller","Ed Skrein","Karan Soni","Michael Benyaer","Stefan Kapicic", "Brianna Hildebrand", "Style Dayne","Kyle Cassie", "Taylor Hickson", "Ayzee", "Naika Toussaint", "Randal Reeder", "Isaac C. Singleton Jr.", "Justyn Shippelt","Donna Tamamotot", "Jed Rees"));
    ArrayList<String> deadpool2Awards = new ArrayList<>(Arrays.asList("Saturn Award","All Def Movie Award","ACCA","Critics Choice Award", "Artios Award","DFCS Award","Dragon Award","Empire Award","Golden Schmoes","Golden Trailer","HFCS Award","IGN People's Choice Award","MTV Movie Award","OFTA Film Award","Maxwell Weinberg Award","Teen Choice Award"));
    private Movie deadpool2 = new Movie(7.7,"Deadpool",2016,"R",deadpoolCast,"Tim Miller","Action and Comedy",deadpoolAwards,"783,100,000");

    //getter for deadpool movie
    public Movie getDeadpool2(){
        return deadpool2;
    }


    //Free guy


    //R.I.P.D

    //Green Lantern

    //Buried

    //6 Underground

    //Red Notice

    //Self/Less

    //The Hitman's Bodyguard

    //Change up

    //The Proposal
}
