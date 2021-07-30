package sorting;

import util.ArrayUtils;

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
        System.out.println(ArrayUtils.printArray(in) + " completed in " + (start - System.nanoTime()) + " nano seconds");
    }

    private static void sort(int[] in) {
        int minIndex = 0, temp;
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
