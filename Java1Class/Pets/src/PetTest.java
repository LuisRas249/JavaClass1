import java.util.Random;
import java.util.Scanner;

public class PetTest {

    // This will help generate higher and lower value numbers for the pets age
    private static int getRandomValue(int low, int high) {
        Random random = new Random();
        return random.nextInt(high - low) + low;
    }

    public static void main(String[] args) {
        Cat myCat = new Cat("Pixel", 4, "Tabby");
        Dog myDog = new Dog("Rex", 9, "Rotweiler");
        System.out.println(myCat.Speak());
        System.out.println(myDog.Speak());
        System.out.println();
////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //ARRAYS
        String[] catBreeds = {"Siamese", "Burmese", "Tabby", "Persian", "Manx"};
        String[] dogBreeds = {"Terrier", "Greyhound", "Alsatian", "Spaniel", "Mongrel"};
        // This will store the detail of 5 pets
        Pets[] pets = new Pets[5];

        // Create the pet string and int values
        String breed, petName, animalType;
        int Age;
        //USER INPUT
        Scanner input = new Scanner(System.in);
        Scanner search = new Scanner(System.in);
        //VARIABLES

        // loop across the pets array
        for (int i = 0; i < pets.length; i++) {
            Age = getRandomValue(1, 15);
            //call cat methods
            System.out.println("What type of animal would you like (cat/dog): ");
            // animalType what the user has entered
            animalType = input.next();
            System.out.println("Please provide the name for the animal: ");
            petName = input.next();

            // If the user entered 'cat'
            if (animalType.equals("cat")) {
                // If the suer selects cat it will select a cat at random from the catBreeds array
                breed = catBreeds[getRandomValue(0, catBreeds.length)];
                // The new Cat will be added to the cat array with a random name, age, and breed
                pets[i] = new Cat(petName, Age, breed);
            }
            // Otherwise if user entered 'dog'
            else {
                // If the suer selects dog it will select a cat at random from the catBreeds array
                breed = dogBreeds[getRandomValue(0, dogBreeds.length)];
                // The new Dog will be added to the dog array with a random name, age, and breed
                pets[i] = new Dog(petName, Age, breed);
            }
        }
        // Print out the number of cats and dogs that we have generated
        System.out.println("There are " + Cat.getNumCats() + " Cats " + "and " + Dog.getNumDogs() + " Dogs.");

        // Get the user to prompt for the name of the pet
        // This will then find the pet in the array and print out their details
        boolean finished = false;
        boolean found = false;
        int i;
        while (!finished){
            System.out.println("Who would you like to speak next? ");
            petName = input.next();
            // This will close th program if the user wants to exit
            if (petName.equals("exit")) finished = true;
            else {
                found = false;
                i = 0;
                // As long as i is less than the pets array and is true
                // This will get the name and other information about the pet
                while (i < pets.length && ! found){
                    if (pets[i]. getPetName().equals(petName)) found = true;
                    else i++;
                }
                // If the pet was not found call this method
                if (found) System.out.println(pets[i].Speak());
                else System.out.println("I dont know an animal called... " + petName);
            }
        }

    }
}
