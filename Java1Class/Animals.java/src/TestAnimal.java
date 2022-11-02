public class TestAnimal{
    public static void main(String[] args){
        Lion animal1 = new Lion("Carnivore ", 10, 1, "Mike Tyson ");
        Lion animal2 = new Lion();

        animal1.setAge(3);

        System.out.println(animal1);
        System.out.println(animal2);

        System.out.println(Lion.numberOfLions()+ " lions have been created.");
    }
}
