public class Comedy extends Movie {
    private final double lateFee = 3;

    public Comedy(String mpaaRatings, String movieTitle) {
        super(mpaaRatings, movieTitle);

    }

    public double getLateFee() {
        return lateFee;
    }

    @Override
    public double calLateFee(int daysLate){
    return daysLate * lateFee;
    }
}
