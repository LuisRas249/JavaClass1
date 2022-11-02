
public class Building {
    //Instance Variables
    //Only available to access within this class
    private String address;
    private String owner;

    //Create a static variable
    private static int numBuildings;
    //Create the method
    public static int numBuildings(){
        return numBuildings;
    }

    public Building() {
        // Default Constructor
        // to be able to create a new instance of the class
        address = "";
        owner = "";
        //Everytime the constructor is called we increment the value of
        //numBuildings on both Constructors
        numBuildings++;
    }

    public Building(String anAddress, String anOwner) {
        //Overload Constructor
        address = anAddress;
        owner = anOwner;
        numBuildings++;

    }

    //Getter and Setter
    //To return and update values of instance variables

    public static int getNumBuildings(){
        return numBuildings;
    }
    public String getAddress() {
        return address; //return current value of instance variable
    }

    public void setAddress(String anAddress) {
        this.address = anAddress; //update current value of instance variable
    }

    public String getOwner() {
        return owner; //return current value of instance variable
    }

    public void setOwner(String anOwner) {
        this.owner = anOwner; //update current value of instance variable
    }

    //Method to represent the state of an object as a string
    public String toString() {
        return address + " Occupied by " + owner;
    }


    public static void main(String[] args) {
        Building building1 = new Building();
        Building building2 = new Building("2 High Street", "Fred's Soup Factory");
        Building building3 = new Building();

        building1.setAddress("27 High Street");
        building1.setOwner("Village News");
        building3.setAddress("13 low Street");
        building3.setOwner("John Smith");

        System.out.println("The address of Building 1 is " + building1.getAddress());
        System.out.println("The owner of Building 1 is " + building1.getOwner());

        System.out.println(building1);
        System.out.println(building2);
        System.out.println(building3);
    }
}

