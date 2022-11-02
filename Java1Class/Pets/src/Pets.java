public class Pets{

    // Create variables
    public static int numCats;
    public static int numDogs;
    private String petName;
    private int petAge;

    // Create Constructors with its default values
    public Pets(){
        petName = "";
        petAge = 0;
        numCats++;
        numDogs++;
    }

    // Create parameter values to set instance variables

    public Pets(String PetName, int Age) {
        petName = PetName;
        petAge = Age;
        numCats++;
        numDogs++;
    }

    // Create accessor and mutator methods

    // Gets the name instance variable as string
    public String getPetName(){
        return petName;
    }

    // Set name takes the value of the parameter and uses it to set the name instance variable
    public void setPetName(String PetName){
        this.petName = PetName;
    }

    // Gets the age instance variable as int
    public int getPetAge(){
        return petAge;
    }
    // Set age takes the value of the parameter and uses it to set the age instance variable
    public void setPetAge(int PetAge){
        this.petAge = PetAge;
    }

    // Method that calls the variables to help describe the pets
    public String toString(){
        return " I am " + petName + ", and i am " + petAge + " years old ";
    }

    public String Speak(){
        return "";
    }

}