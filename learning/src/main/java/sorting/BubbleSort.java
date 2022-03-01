package sorting;

import util.ArrayUtils;

import java.util.Arrays;

/**
 * Compare current and it's next element and arrange them in desired order
 *
 *
 * <p><strong>Worst and Average Case Time Complexity: </strong>O(n*n). Worst case occurs when array is reverse sorted.<br><strong>Best Case Time Complexity:</strong> O(n). Best case occurs when array is already sorted.<br><strong>Auxiliary Space:</strong> O(1)<br><strong>Boundary Cases:</strong> Bubble sort takes minimum time (Order of n) when elements are already sorted.<br><strong>Sorting In Place: </strong>Yes<br><strong>Stable:</strong> Yes<br>Due to its simplicity, bubble sort is often used to introduce the concept of a sorting algorithm.&nbsp;<br>In computer graphics it is popular for its capability to detect a very small error (like swap of just two elements) in almost-sorted arrays and fix it with just linear complexity (2n). For example, it is used in a polygon filling algorithm, where bounding lines are sorted by their x coordinate at a specific scan line (a line parallel to x axis) and with incrementing y their order changes (two elements are swapped) only at intersections of two lines (Source: <a target="_blank" rel="noopener noreferrer nofollow" href="http://en.wikipedia.org/wiki/Bubble_sort#In_practice">Wikipedia</a>)<br>&nbsp;&nbsp;<br>&nbsp;</p>
 *
 * @author ankitkatiyar91
 */
public class BubbleSort {

    public static void sort(int[] input) {
        int temp;
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length - i - 1; j++) {
                if (input[j] > input[j + 1]) {
                    temp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = temp;
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
            for (int j = 0; j < input.length - i - 1; j++) {
                if (input[j] > input[j + 1]) {
                    temp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = temp;
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
        System.out.println(Arrays.toString(in) + " completed in " + (start - System.nanoTime()) + " nano seconds");

        in = new int[]{5, 3, 7, 1, 3, 9, 0};
        start = System.nanoTime();
        sortOptimized(in);
        System.out.println(Arrays.toString(in) + " optimized completed in " + (start - System.nanoTime()) + " nano seconds");
    }

}
