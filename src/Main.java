//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Movie[] movies = new Movie[6];
        movies[0] = new Action("pd-5", "Action movie1");
        movies[1] = new Comedy("pd-5", "Comedy movie1");
        movies[2] = new Drama("pd-5", "Drama1");
        movies[3] = new Action("pd-5", "Action movie2");
        movies[4] = new Comedy("pd-5", "Comedy movie2");
        movies[5] = new Drama("pd-5", "Drama2");

        int daysLate = 5;
        for (Movie movie: movies){
            System.out.println("Title: " + movie.getMovieTitle());
            System.out.println("Late fee for " + daysLate + " days: $" + movie.calLateFee(daysLate));
            System.out.println("------");
        }



    }
}