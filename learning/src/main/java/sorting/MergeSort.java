package sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Break the whole array into small pieces and sort when merging. At every step
 * break array into exactly two halves.
 * <h3>Time complexity</h3>
 * <p><b>Best Case:</b> Ω(n log(n))</p>
 * <p><b>Average Case:</b> Θ(n log(n))</p>
 * <p><b>Worst Case:</b> O(n log(n))</p>
 *
 *
 * <h3>Space Complexity:</h3>O(n)
 *
 * @author ankitkatiyar91
 */
public class MergeSort {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 3, 7, 7, 1, 3, 9, 0);
        Collections.shuffle(list);
        int[] in = list.stream().mapToInt(i -> i).toArray();
        long start = System.nanoTime();
        System.out.println("Original Array: " + Arrays.toString(in));
        sort(in, 0, in.length - 1);
        System.out.println(Arrays.toString(in) + " completed in " + (start - System.nanoTime()) + " nano seconds");

        int[] in1 = {5, 1};
        sort(in1, 0, 1);
        System.out.println("Sort: " + Arrays.toString(in1));
    }

    private static void sort(int[] in, int start, int end) {

        if (end > start) {
            int mid = (end + start) / 2;
            sort(in, start, mid);
            sort(in, mid + 1, end);
            merge(in, start, mid, end);
        }
    }

    private static void merge(final int[] in, int start, int mid, int end) {
        int[] left = Arrays.copyOfRange(in, start, mid + 1);
        int[] right = Arrays.copyOfRange(in, mid + 1, end + 1);

//        merge items from both the arrays
        int i = 0, j = 0, k = start;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                in[k] = left[i];
                i++;
            } else {
                in[k] = right[j];
                j++;
            }
            k++;
        }

//        add remaining from left
        while (i < left.length) {
            in[k] = left[i];
            i++;
            k++;
        }
//        add remaining from right
        while (j < right.length) {
            in[k] = right[j];
            j++;
            k++;
        }
    }
}
