// Develop a subclass called Lion
public class Lion extends Animal{

    // Provide String and int instance variables for the lion
    private  String name;
    private int age;

    // This will count the current number of lions
    private static int numLions = 0;

    // Create a default constructor containing the instance variables
    // This takes no parameters
    public Lion(){
        super();
        age = 0;
        name = null;
        numLions++;
    }

    // Lion Constructor
    public Lion(String food, int life, int anAge, String aName){
        super(food, life);
        age = anAge;
        name = aName;
        numLions++;
    }

    // Sets the age instance variable
    public void setAge(int anAge){
        age = anAge;
    }

    // This method will provide and display information of the name, age, food, and life of the lion
    public  String toString(){
        String result = "";
        if (name != null) result += name + "is ";
        else result += "This un-named lion is ";
        if (age > 0) result += age + " years old. ";
        else result += "of unknown age. ";
        result += super.toString();
        return result;
    }

    public static int numberOfLions(){
        return numLions;
    }

}
