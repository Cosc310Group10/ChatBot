// Movie Class - Lance
import java.util.ArrayList;

public class Movie {

    // private attributes for the movie class
    //IMDb rating
    private double imdbStars;
    //title of movie
    private String title;
    //year movie was released
    private int year;
    //rating of the movie, ex: PG-13, R, etc
    private String rating;
    //Arraylist of all the cast memebers
    private ArrayList<String> cast;
    //main director name
    private String director;
    //genre of movie
    private String genre;
    //array list of the awards the movie has recieved
    private ArrayList<String> awards;
    //box office amount, i.e gross earnings of the movie
    private String boxOffice;

    //Below are various constructors for creating movie objects

    //First constructor which contains initialization for every attribute
    Movie(double imdbStars, String title, int year, String rating, ArrayList<String>cast, String director,String genre,ArrayList<String>awards,String boxOffice){
        this.imdbStars = imdbStars;
        this.title = title;
        this.year = year;
        this.rating = rating;
        this.cast = cast;
        this.director = director;
        this.genre = genre;
        this.awards = awards;
        this.boxOffice = boxOffice;
    }

    //Second constructor which initializes only the title, rating, and genre
    //and sets a default setting for all of the other attributes
    Movie(String title, String rating, String genre){
        this.title = title;
        this.rating = rating;
        this.genre = genre;

    }

    //Third constructor which initializes the imdb rating, title, rating, and genre
    Movie(double imdbStars, String title, String rating, String genre){
        this.imdbStars = imdbStars;
        this.title = title;
        this.rating = rating;
        this.genre = genre;

    }

    //Fourth constructor which only intitializes the title
    Movie(String title){
        this.title = title;
    }

    //Fifth constructor which initializes the title and genre
    Movie(String title, String genre){
        this.title = title;
        this.genre = genre;
    }

    //Sixth constructor which only initializes the title, imdb, box office
    Movie(String title, double imdbStars, String boxOffice){
        this.title = title;
        this.imdbStars = imdbStars;
        this.boxOffice = boxOffice;
    }

    //Seventh constructor which is a deafault
    Movie(){

    }


    //getters and setters below for each attribute

	public double getImdbStars() {
		return imdbStars;
	}

	public void setImdbStars(double imdbStars) {
		this.imdbStars = imdbStars;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public ArrayList<String> getCast() {
		return cast;
	}

	public void setCast(ArrayList<String> cast) {
		this.cast = cast;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public ArrayList<String> getAwards() {
		return awards;
	}

	public void setAwards(ArrayList<String> awards) {
		this.awards = awards;
	}

	public String getBoxOffice() {
		return boxOffice;
	}

	public void setBoxOffice(String boxOffice) {
		this.boxOffice = boxOffice;
	}


    //toString method for the movies
    public String toString(){

        return "Movie: " + this.title +"\n"+"IMDb Rating: " +this.imdbStars + "\n"+"Genre: " + this.genre + "\n" + "Rating: " + this.rating + "\n"+  "Director: " + this.director + "\n"+ "Box Office: $" + this.boxOffice 
        +"\n"+"\n" + "Cast: "+ this.cast+ "\n"+ "\n" + "Awards: " + this.awards;
    }


}
