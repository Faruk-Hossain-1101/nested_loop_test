import java.util.*;

public class nested_java {

    static long startTime;
    static double difference;

    public static double nestedLoopsCount(int n) {
        if (n >= 1) {
            n -= 1;
            nestedLoopsCount(n);
        } else {
            long endTime = System.currentTimeMillis();
            difference = (endTime - startTime);
        }
        return difference;
    }

    public static double calculateAvgDifference(int iterations) {
        double totalTime = 0;
        for (int i = 0; i < iterations; i++) {
            double diff = nestedLoopsCount(1000);
            totalTime += diff;
        }
        return totalTime / iterations;
    }

    public static void main(String[] args) {
        int value = 1000;

        // Record the initial start time
        startTime = System.currentTimeMillis();

        double averageTime = calculateAvgDifference(1000);

        System.out.println(averageTime);
    }
}
