import java.util.ArrayList;

public class Movie {

    // private attributes for the movie class
    //IMDb rating
    private int imdbStars;
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
    private int boxOffice;

    //First constructor which contains initialization for every attribute
    Movie(int imdbStars, String title, int year, String rating, ArrayList<String>cast, String director,String genre,ArrayList<String>awards,int boxOffice){
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

    //Third constructor which...

    //Fourth constructor which...

    //Fifth constructor which...

    //Sixth constructor which...

    //Seventh constructor which...

    //getters and setters below for each attribute

	public int getImdbStars() {
		return imdbStars;
	}

	public void setImdbStars(int imdbStars) {
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

	public int getBoxOffice() {
		return boxOffice;
	}

	public void setBoxOffice(int boxOffice) {
		this.boxOffice = boxOffice;
	}

    


}
