
//Creating subclasses
//The subclass of Building
public class House extends Building{
    //Create variables with House specific values
    private int numBedrooms;
    private boolean hasGarage;
    private static int numHouses = 0;

    public static int getNumHouses(){
        return numHouses;
    }

    public House(){
        super();
        numBedrooms = 0;
        hasGarage = false;
        numHouses ++;
    }


    public House(String anAddress, String anOwner, int beds, boolean garage){
        super(anAddress, anOwner); //Superclass Constructor

        //This is the Set House specific values
        numBedrooms = beds;
        hasGarage = garage;
        numHouses++;
    }
    //Plus with assessor and mutator methods
    public int getNumBedrooms(){
        return numBedrooms;
    }

    public void setNumBedrooms(int numBeds){
        numBedrooms = numBeds;
    }


    public boolean getHasGarage(){
        return hasGarage;
    }

    public void setHasGarage(boolean garage){
        hasGarage = garage;
    }

    public String toString(){
        String str = " The house at " + super.toString(); // Create a string for address and wner
        str += " has " + numBedrooms + " bedrooms and "; // This will create a string for the number of bedrooms for each  house
        if (hasGarage) str+= "a garage"; // If the house has a garage this string will print the details
        else str += "no garage"; // If the house has no garage
        return str; //return variable str string
    }

}