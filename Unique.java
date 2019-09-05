/* TODO - write the main method.
 * Unique.java
 */

package hw1;

import java.util.Arrays;

/** A class with a main method for printing out unique numbers. 
 */

public final class Unique {

    // Make checkstyle happy.
    private Unique() {
        throw new AssertionError("Can not instantiate class Unique\n");
    }

    /**
     * A main method to print the unique numerical command line arguments.
     *
     * @param args The string array of arguments in the command line.
     */

    public static void main(String[] args) {

        // Create an array to hold unique integers
        int[] nums = {};

        for (int i = 0; i < args.length; i++) {
            try {

                //Read in the integer from the command line into n
                int n  = Integer.parseInt(args[i]);

                //Check if the the number is already seen
                if (!Arrays.stream(nums).anyMatch(j -> j == n)) {
                    nums = Arrays.copyOf(nums, nums.length + 1);
                    nums[nums.length - 1] = n;
                    System.out.println(n);
                }

            } catch (NumberFormatException e) {
                throw new IllegalArgumentException();
            }

        }


    }
}
