
public class Business {
    // Attributes below(referring to business)
    //name of business
    private String businessName;
    //year started
    private int yearStarted;
    //location of business
    private String businessLocation;
    //position of business
    private String businessPosition;

    // Constructors below
    //Business Constructor for all business attributes
    Business(String businessName, int yearStarted, String businessLocation, String businessPosition){
        this.businessName = businessName;
        this.yearStarted = yearStarted;
        this.businessLocation = businessLocation;
        this.businessPosition = businessPosition;
    }

    Business(){

    }

    //getters and setters below
    public String getbusinessName(){
        return businessName;
    }
    public void setbusinessName(String businessName){
        this.businessName = businessName;
    }
    
    public int getyearStarted(){
        return yearStarted;
    }
    public void setyearStarted(int yearStarted){
        this.yearStarted = yearStarted;
    }
    public String getbusinessLocation(){
        return businessLocation;
    }
    public void setbusinessLocation(String businessLocation){
        this.businessLocation = businessLocation;
    }
    public String getbusinessPosition(){
        return businessPosition;
    }
    public void setbusinessPosition(String businessPosition){
        this.businessPosition = businessPosition;
    }
}
