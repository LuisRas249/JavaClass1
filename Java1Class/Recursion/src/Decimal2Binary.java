public class Decimal2Binary {

    // Define decimal to binary class
    // This method takes 1 integer as a parameter
    // Then returns a string
    public static String toBinary(int n){
        // Define base case returning string 1
        if (n == 1) return "1";
        // Otherwise return the result of the call toBinary
        // % = remainder
        else return toBinary(n / 2) + n % 2;
    }

    // Create main method to print out the result of integers converted into binary
    public static void main (String[] args) {
        System.out.println("26 in binary is... " + toBinary(26));
        System.out.println("10 in binary is... " + toBinary(10));
        System.out.println("100 in binary is... " + toBinary(100));
    }
}
