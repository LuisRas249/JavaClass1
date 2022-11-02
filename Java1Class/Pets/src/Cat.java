// Create Cat as a subclass of Pets
public class Cat extends Pets{

    // Create instance variables
    private String breed;

    // This will count the current number of cats
    private static int numCats = 0;

    public Cat(){
        // Call the super class constructor to create the pets
        // the super() will initialize the name and age of the pet
        super();
        breed = "";
        numCats++;
    }

    public Cat(String PetName, int Age, String Breed){
        super(PetName, Age);
        breed = Breed;
        numCats++;
    }

    //Create the method
    public static int numCats(){
        return numCats;
    }
    public static int getNumCats(){
        return numCats;
    }

    public String Speak(){
        return "Meow! " + this + breed;
    }
}