public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String title;
    private int priceCode;
    
    public Movie(String newtitle, int newPriceCode) {
        title = newtitle;
        setPriceCode(newPriceCode);
    }
    public int getPriceCode() {
        return priceCode;
    }
    public void setPriceCode(int arg) {
        if (arg == REGULAR || arg == NEW_RELEASE || arg == CHILDRENS) {
            priceCode = arg;
        } else {
            throw new IllegalArgumentException("Invalid price code");
        }
    }
    public String getTitle (){
        return title;
    };
}