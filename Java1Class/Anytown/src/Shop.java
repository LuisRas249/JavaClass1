public class Shop extends Building {
    //Create variables with House specific values
    private int numEmployees;
    private int averageTurnover;

    private static int numShops = 0;

    public static int getNumShops(){
        return numShops;
    }

    public Shop() {
        super();
        numEmployees = 0;
        averageTurnover = 0;
        numShops++;
    }

    //Shop has instance variables of numEmployees and averageTurnover bot integer values
    public Shop(String anAddress, String anOwner, int employees, int turnover) {
        super(anAddress, anOwner); //Superclass Constructor
        //This is the Set Shop specific values
        numEmployees = employees;
        averageTurnover = turnover;
        numShops++;
    }

    public int getNumEmployees() {
        return numEmployees;
    }

    public void setNumEmployees(int employees) {
        numEmployees = employees;
    }

    public int getAverageTurnover() {
        return averageTurnover;
    }

    public void setAverageTurnover(int turnover) {
        averageTurnover = turnover;
    }

    public String toString(){
        String str = " The shop at " + super.toString(); // Create a string for address and wner
        str += " has " + numEmployees + " employees and "; // This will create a string for the number of bedrooms for each  house
        str += "an average annual turnover of £ " + averageTurnover;
        return str; //return variable str string
    }
}