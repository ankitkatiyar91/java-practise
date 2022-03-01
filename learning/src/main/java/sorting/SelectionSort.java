package sorting;

import java.util.Arrays;

/**
 * Select one element and find lowest element in the right part and replace it
 * with that.
 * <b>Complexity (all case):</b> Ω(n^2), Θ(n^2), O(n^2)
 *
 * @author ankitkatiyar91
 * <p>
 * Clarity: https://stackoverflow.com/a/15799095/3373597
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] in = new int[]{5, 3, 7, 7, 1, 3, 9, 0};
        long start = System.nanoTime();
        sort(in);
        System.out.println(Arrays.toString(in) + " completed in " + (start - System.nanoTime()) + " nano seconds");
    }

    private static void sort(int[] in) {
        int minIndex, temp;
        for (int i = 0; i < in.length; i++) {
            minIndex = i;
            for (int j = i + 1; j < in.length; j++) {
                if (in[minIndex] > in[j]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                temp = in[i];
                in[i] = in[minIndex];
                in[minIndex] = temp;
            }
        }
    }
}
