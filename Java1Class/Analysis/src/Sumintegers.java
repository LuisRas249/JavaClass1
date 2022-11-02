public class Sumintegers {
    /*
    Create a new Java project called Analysis and implement the class
    SumIntegers with methods sum_A(), sum_B(), and sum_C()
    as implementations of the algorithms presented on the previous
    slide. Each method takes an int parameter 'n' and returns the
    long sum of all integers <= n.
     */
    public static long sum_A(int n){
        long sum = 0;
        for(int i = 1; i <= n; i++){
            sum = sum + i;
        }
        return sum;
    }

    public static long sum_B(int n){
        long sum = 0;
        for(int i = 1; i <=n; i++){
            for (int j = 1; j <= i; j++){
                sum = sum + 1;
            }
        }
        return sum;
    }

    public static long sum_C(int n){
        int sum = 0;
        sum = n * (n + 1) / 2;

        return sum;
    }


    public static void main(String[] args){
        /*
    call each method with the parameter value of 10000 and verify
    that they return the same result
     */
        System.out.println(sum_A(10000));
        System.out.println(sum_B(10000));
        System.out.println(sum_C(10000));
        /*
    Then add the code to time the execution of each method and
    print our the execution time in nanoseconds. Verify that
    there is a clear order inn the execution speed of algorithms
     */
        System.out.println();
        long StartTime, EndTime;

        StartTime = System.nanoTime();
        System.out.println(sum_A(10000));
        EndTime = System.nanoTime();
        System.out.print("Algorithms A: " + (EndTime - StartTime + "ns\n"));

        StartTime = System.nanoTime();
        System.out.println(sum_B(10000));
        EndTime = System.nanoTime();
        System.out.print("Algorithms B: " + (EndTime - StartTime + "ns\n"));

        StartTime = System.nanoTime();
        System.out.println(sum_C(10000));
        EndTime = System.nanoTime();
        System.out.print("Algorithms C: " + (EndTime - StartTime + "ns\n"));
    }

}
