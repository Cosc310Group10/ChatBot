import java.util.ArrayList;

public class Movie {

    
    private int imdbStars;
    private String title;
    private int year;
    private String rating;
    private ArrayList<String> cast;
    private String director;
    private String genre;
    private ArrayList<String> awards;
    private int boxOffice;

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

    Movie(){

    }

    //getters and setters below

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
