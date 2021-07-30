package sorting;

import java.util.Arrays;

/**
 * Select second element and then compare it with all elements in the sorted
 * part(left in ascending order) and replace if you find any element greater
 * than this. It will shift lowest element to the left most position by
 * inserting them at right position.
 *
 * @author ankitkatiyar91
 * <p>
 * Complexity O(n^2)
 * For clarity: https://stackoverflow.com/a/15799095/3373597
 */
public class InsertionSort {


    public static void main(String[] args) {
        int[] in = new int[]{5, 3, 7, 7, 1, 3, 9, 0};
        long start = System.nanoTime();
        sort(in);
        System.out.println(Arrays.toString(in) + " completed in " + (start - System.nanoTime()) + " nano seconds");
    }

    private static void sort(int[] in) {
        int temp;
        for (int i = 1; i < in.length; i++) {
            for (int j = 0; j < in.length; j++) {
//                In insertion sort swapping happen at every comparison. where as selection does it once in every pass
                if (in[i] < in[j]) {
                    temp = in[i];
                    in[i] = in[j];
                    in[j] = temp;
                }
            }

        }
    }
}
