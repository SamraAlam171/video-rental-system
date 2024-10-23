import java.util.Objects;

public class Movie {
    private String mpaaRatings;
    private String movieTitle;
    private String ID;
    private static int count = 1;
   private double lateFee = 2.0;

    public Movie(String mpaaRatings, String movieTitle) {
        this.mpaaRatings = mpaaRatings;
        this.movieTitle = movieTitle;
        this.ID = String.format("%03d", count++);
    }

    public String getMpaaRatings() {
        return mpaaRatings;
    }

    public void setMpaaRatings(String mpaaRatings) {
        this.mpaaRatings = mpaaRatings;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Movie.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return Objects.equals(ID, movie.ID);
    }
    public double calLateFee(int daysLate){
    return daysLate * lateFee;
    }
}
