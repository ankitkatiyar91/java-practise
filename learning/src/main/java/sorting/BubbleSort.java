package sorting;

import util.ArrayUtils;

/**
 * Compare current and it's next element and arrange them in desired order
 *
 * <b>Complexities</b>
 * Worst complexity: n^2
 * Average complexity: n^2
 * Best complexity: n (This is achieved by stopping the algorithm if inner loop did not cause any swap.)
 * Space complexity: 1
 *
 * @author ankitkatiyar91
 */
public class BubbleSort {

    public static void sort(int[] input) {
        int temp;
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length; j++) {
                if (input[i] < input[j]) {
                    temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }
            }
        }
    }

    /**
     * This method achieves best complexity of <b><i>n</i></b> by stopping the algorithm if inner loop did not cause any swap
     *
     * @param input
     */
    public static void sortOptimized(int[] input) {
        int temp;
        boolean swapped;
        for (int i = 0; i < input.length; i++) {
            swapped = false;
            for (int j = 0; j < input.length; j++) {
                if (input[i] < input[j]) {
                    temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                    swapped = true;
                }
            }
            // IF no two elements were
            // swapped by inner loop, then break
            if (!swapped)
                break;
        }
    }

    public static void main(String[] args) {
        int[] in = new int[]{5, 3, 7, 1, 3, 9, 0};
        long start = System.nanoTime();
        sort(in);
        System.out.println(ArrayUtils.printArray(in) + " completed in " + (start - System.nanoTime()) + " nano seconds");

        in = new int[]{5, 3, 7, 1, 3, 9, 0};
        start = System.nanoTime();
        sortOptimized(in);
        System.out.println(ArrayUtils.printArray(in) + " optimized completed in " + (start - System.nanoTime()) + " nano seconds");
    }

}
