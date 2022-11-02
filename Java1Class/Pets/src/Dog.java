public class Dog extends Pets{
    private String breed;

    // This will count the current number of dogs
    private static int numDogs = 0;

    //Create the method
    public Dog(){
        // Call the super class constructor to create the pets
        // the super() will initialize the name and age of the pet
        super();
        breed = "";
        numDogs++;
    }

    public Dog(String PetName, int Age, String Breed){
        super(PetName, Age);
        breed = Breed;
        numDogs++;
    }

    public static int getNumDogs(){
        return numDogs;
    }
    public static int numDogs(){
        return numDogs;
    }
    public String Speak(){
        return "Woof! " + this + breed;
    }

}