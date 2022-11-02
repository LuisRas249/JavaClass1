public class CarParkTest {

    public static void main(String[] args) {
        CarPark cp = new CarPark(3);
        System.out.print("Adding Adrian... ");
        System.out.println(cp.parkCar("Adrian"));

        System.out.print("Adding Simon...");
        System.out.println(cp.parkCar("Simon"));

        System.out.print("Adding Adrian... ");
        System.out.println(cp.parkCar("Adrian"));

        System.out.print("Adding Simon...");
        System.out.println(cp.parkCar("Simon"));

        System.out.print("Adding Orla... ");
        System.out.println(cp.parkCar("Orla"));

        System.out.print("Adding Nicola... ");
        System.out.println(cp.parkCar("Nicola"));

        System.out.print("Removing Adrian... ");
        System.out.println(cp.removeCar("Adrian"));

        System.out.print("Removing Nicola... ");
        System.out.println(cp.removeCar("Nicola"));

        System.out.print("Checking for Simon...  ");
        System.out.println(cp.isParked("Simon"));

        System.out.print("Checking for Adrian...  ");
        System.out.println(cp.isParked("Adrian"));

        System.out.print("Adding Adrian... ");
        System.out.println(cp.parkCar("Adrian"));

        System.out.print("Replacing Nicola with Adrian... ");
        System.out.println(cp.replace("Nicola","Adrian"));

        System.out.print("Replacing Simon with Adrian... ");
        System.out.println(cp.replace("Simon","Adrian"));

        System.out.print("Replacing Orla with Jane... ");
        System.out.println(cp.replace("Orla","Jane"));

        System.out.println("In total, " + cp.getTotalParked() + " users have parked here");

        System.out.println("Car Park contents: " + cp.showAllCars());
    }
}