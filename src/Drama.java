public class Drama extends Movie{
    private final double lateFee = 2;

    public Drama(String mpaaRatings, String movieTitle) {
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
