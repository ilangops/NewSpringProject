package samples;

import java.util.Arrays;
import java.util.OptionalInt;

public class SecondLargestFilter {
    public static void main(String[] args) {
        int[] numbers = {12, 35, 1, 10, 34, 35, 1};

        // 1. Find the absolute maximum value
        int max = Arrays.stream(numbers)
                        .max()
                        .orElse(Integer.MIN_VALUE);

        // 2. Filter out the max value to find the second largest
        OptionalInt secondMax = Arrays.stream(numbers)
                                      .filter(n -> n < max)
                                      .max();

        if (secondMax.isPresent()) {
            System.out.println("Second largest: " + secondMax.getAsInt());
        } else {
            System.out.println("No distinct second largest element found.");
        }
    }
}