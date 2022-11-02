import java.util.Scanner;

public class TowersOfHanoi {

    // Implement the three poles as 3 string constants
    // The aim is to move the disks from source to target via spare
    private static final String SOURCE = "Source";

    private static final String SPARE = "Spare";

    private static final String TARGET = "Target";


    // Create solveTowers method which will take 4 parameters
    public static void solveTowers(int numberOfDiscs, String source, String spare, String target){
        if (numberOfDiscs == 1)
            // If the number of discs has been entered is one then print this
            System.out.println(source + "=>" + target);
        else {
            // Otherwise print these steps the number of disks entered more than 1
            solveTowers(numberOfDiscs - 1, source, target, spare);
            System.out.println(source + "=>" + target);
            solveTowers(numberOfDiscs - 1, spare, source, target);
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of disks... ");
        int numberOfDiscs = scanner.nextInt();

        // Call the solve towers method
        solveTowers(numberOfDiscs, SOURCE, SPARE, TARGET);
    }
}
