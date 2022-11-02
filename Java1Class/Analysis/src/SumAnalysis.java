import java.util.*;

public class SumAnalysis extends Sumintegers {

    public static void main(String[] args) {
        /*
        In main method, measure and record the execution time
        in the nanoseconds for each of the SumIntegers class methods
        Sum_A(), Sum_B() and Sum_C()
        For parameter values 1,10,100,1000,10000,100000,1000000
         */
        System.out.print("Num Elements ");
        System.out.print("sum_A ");
        System.out.print("sum_B ");
        System.out.println("sum_C");

        for (int i = 1; i < 1000000; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        //System.out.println(sum_A(10000));
        //System.out.println(sum_B(10000));
        //System.out.println(sum_C(10000));



            System.out.println();
            long StartTime, EndTime;

            StartTime = System.nanoTime();
            System.out.println(sum_A(1));
            System.out.println(sum_A(10));
            System.out.println(sum_A(100));
            System.out.println(sum_A(1000));
            System.out.println(sum_A(10000));
            System.out.println(sum_A(100000));
            System.out.println(sum_A(1000000));
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

        /*
        Print results of the execution time of the measurements in a table
        and observer the rate of increase for each.
         */

        /*
        Estimate the growth rate function of each Sum_A(), Sum_B() and Sum_C()
         */
        }
    }
