
public class Business {
    // Attributes below(referring to business)
    //name of business
    private String businessName;
    //year started
    private int yearStarted;
    //location of business
    private String location;

    // Constructors below
    //Business Constructor for all business attributes
    Business(String businessName, int yearStarted, String location){
        this.businessName = businessName;
        this.yearStarted = yearStarted;
        this.location = location;
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
    public String getlocation(){
        return location;
    }
    public void setlocation(String location){
        this.location = location;
    }
 //Mint Mobile 
 private Business mintMobileInfo = new Business("Mint Moblie",2019,"Costa Mesa, California");

 //getter for Mint Mobile
 public Business getMintMoblie(){
     return mintMobileInfo;
 }

 //Maximum Effort  
 private Business maximumEffortInfo  = new Business("Maximum Effort ",2018,"New York, New York");

 //getter for Maximum Effort
 public Business getMaximumEffort(){
     return maximumEffortInfo;
 }
 //Aviation American Gin
 private Business aviationAmericanGinInfo = new Business("Aviation American Gin",2018 ,"Portland, Oregon");

 //getter for Aviation American Gin
 public Business getAviationAmericanGin(){
     return aviationAmericanGinInfo;
 }
 //Wrexham AFC
 private Business wrexhamAFCInfo = new Business("Wrexham AFC",2021 ,"Wrexham, North Wales");

 //getter for Wrexham AFC
 public Business getwrexhamAFC(){
     return wrexhamAFCInfo;
 }

}
