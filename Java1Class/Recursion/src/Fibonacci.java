import java.util.Arrays;

public class Fibonacci {

    // Create fibonacci int array
    private static  int[] fibCalls = new int[21];

    // Create fibonacci method
    public static long fibonacci(int n){
        // Increment the number of int arrays in fibcalls
        fibCalls[n]++;
        if (n == 0) return 0;
        if (n == 1) return 1;

        // This will add the next 2 previous calls
        // Example 2 calls to fibonacci(18) + 3 calls to fibonacci(17) = 5 calls to fibonacci(16)
        return fibonacci(n - 1) + fibonacci(n - 2);
    }


    public static void main(String[] args){

        // Fills array values to its specified ints
        // This will be used in the forloop below
        Arrays.fill(fibCalls, 0);

        System.out.println("Fibonacci(20) = " + fibonacci(20) + "\n" );

        // i = the fibonacci array length
        // it will instead decrement not increment when printing
        for (int i = fibCalls.length - 1; i > 0; i--)
            System.out.println(fibCalls[i] + " calls to fibonacci(" + i + ")");
    }

}
