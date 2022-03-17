import java.util.ArrayList;
import java.util.Arrays;

public class Businesses {
    // Attributes below(referring to business)
    //name of business
    private ArrayList<String> businessName;
    //number of businesses
    private int businessNumber;
    //year started
    private int yearStarted;
    //location of business
    private String location;

    // Constructors below
    //Business Constructor for all business attributes
    Businesses(ArrayList<String> businessName, int businessNumber, int yearStarted, String location){
        this.businessName = businessName;
        this.businessNumber = businessNumber;
        this.yearStarted = yearStarted;
        this.location = location;
    }

    Businesses(){

    }

    //getters and setters below
    public ArrayList<String> getbusinessName(){
        return businessName;
    }
    public void setbusinessName(ArrayList<String> businessName){
        this.businessName = businessName;
    }
    public int getbusinessNumber(){
        return businessNumber;
    }
    public void setbusinessNumber(int businessNumber){
        this.businessNumber = businessNumber;
    }
    public int getyearStarted(){
        return yearStarted;
    }
    public void setyearStarted(int yearStarted){
        this.yearStarted = yearStarted;
    }
    public String getlocation(){
        return location;
    }
    public void setlocation(String location){
        this.location = location;
    }

}
