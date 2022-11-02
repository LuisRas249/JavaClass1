import java.util.Random;
import java.util.Scanner;

public class AnytownTest {

    private static int getRandomValue(int low, int high){
        Random random = new Random();
        return random.nextInt(high - low) + low;
    }

    public static void main(String[] args) {
        //BUILDINGS
        //Default Constructor
        Building building1 = new Building();
        //Default Constructor with values
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

        System.out.println();
        //HOUSES
        House house1 = new House();
        House house2 = new House("12 Main Street", "Roy Cooper", 3, true);

        house1.setAddress("11 Main Street");
        house1.setOwner("Ray Cooper");
        house1.setNumBedrooms(4);
        house1.setHasGarage(false);

        System.out.println(house1);
        System.out.println(house2);

        house2.setNumBedrooms(2);
        house2.setHasGarage(false);
        System.out.println(house2);

        //SHOPS
        Shop shop1 = new Shop();
        Shop shop2 = new Shop("8 Low Street", "Carol's Cake", 5 , 100000);
        shop1.setAddress("7 Low Street");
        shop1.setOwner("Brian's Buns");
        shop1.setNumEmployees(7);
        shop1.setAverageTurnover(250000);

        System.out.println(shop1);
        System.out.println(shop2);

        shop2.setNumEmployees(3);
        shop2.setAverageTurnover(90000);
        System.out.println(shop2);

        //Get the total number of buildings
        System.out.println("\n There are a total of " + Building.getNumBuildings() + " Buildings");
        //Get the total number of houses and shops
        System.out.println("\n There are a total of " + Building.getNumBuildings() +
                " buildings of which " + House.getNumHouses() + " are houses and " +
                Shop.getNumShops() + " are shops.");

//////////////////////////////////////////////////////////////////////////////////////////////////////////
        //Create arrays
        Building[] buildings = new Building[10];
        //User Input
        Scanner input = new Scanner(System.in);
        String address;
        int numBeds;
        boolean garage;
        String owner;

        //HOUSES
        for(int i = 0; i < 5; i++){
            address = "" + (31+i) + " Main Street";
            numBeds = getRandomValue(1, 5);
            garage = (getRandomValue(1, 100) < 50);
            System.out.print("Enter the name of the owner: ");
            owner = input.next();
            buildings[i] = new House(address, owner, numBeds, garage);
        }

        //SHOPS
        int turnover, employees;
        for (int i = 5; i < 10; i++){
            address = "" + i + " Main Street ";
            turnover = getRandomValue(10000, 1000000);
            employees = getRandomValue(5, 50);
            buildings[i] = new Shop(address, " Anytown Shopping Centre", employees, turnover);
        }

        for (int i = 0; i < 10; i++){
            System.out.println(buildings[i]);
        }
    }
}
