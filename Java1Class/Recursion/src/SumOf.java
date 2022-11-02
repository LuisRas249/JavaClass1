public class SumOf {

    // Create static method
    public static int sumOf(int n){
        // If n equals to 1 return 1
        if (n == 1 ) return 1;
        // if not then return n(1) + the sumOf(input n - 1)
        else return n + sumOf(n - 1);
    }

    // Test it in the main method
    public static void main(String[] args){
        System.out.println( "The sum of the intergers up to 3 is... " + sumOf(3));
        System.out.println( "The sum of the intergers up to 5 is... " + sumOf(5));
        System.out.println( "The sum of the intergers up to 10 is... " + sumOf(10));
    }
}
