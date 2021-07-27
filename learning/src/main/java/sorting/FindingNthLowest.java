package sorting;

import util.ArrayUtils;

import java.util.Arrays;

public class FindingNthLowest {

    public static void main(String[] args) {
        int[] in = new int[]{10, 4, 5, 7, 2, 3, 9, 8, 1, 6};
        int m = 1;
        System.out.println(min(in, m));
    }

    /**
     * This will find m<sup>th</sup> smallest number in the array. It uses partial insertion sort to achieve this.
     * Complexity: O(m*n)
     *
     * @param in
     * @param m
     * @return
     */
    private static int min(int[] in, int m) {
        System.out.println("Original Array: " + Arrays.toString(in));

        if (in.length < m) {
            throw new IllegalArgumentException("Not enough elements in array.");
        }

        int minIndex, temp;
        for (int i = 0; i < m; i++) {
            minIndex = i;
            for (int j = i; j < in.length; j++) {
                if (in[j] < in[minIndex]) {
                    minIndex = j;
                }
            }
            temp = in[i];
            in[i] = in[minIndex];
            in[minIndex] = temp;
        }
        System.out.println("Final Sorted Array: " + Arrays.toString(in));
        return in[m - 1];
    }
}
