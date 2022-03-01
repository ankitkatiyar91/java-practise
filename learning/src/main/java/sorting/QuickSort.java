package sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * In QuickSort,we use a pivot element and at each step we ensure that left is
 * less than pivot and right is greater than pivot (considering ascending sort).
 *
 * @author Ankit Katiyar(ankitkatiyar91)
 * Ref: https://www.hackerearth.com/practice/algorithms/sorting/quick-sort/visualize/
 */
public class QuickSort {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 3, 7, 7, 1, 3, 9, 0);
        Collections.shuffle(list);
        int[] in = list.stream().mapToInt(i -> i).toArray();
        long start = System.nanoTime();
        System.out.println("Original Array: " + Arrays.toString(in));
        quickSort(in, 0, in.length - 1);
        System.out.println(Arrays.toString(in) + " completed in " + (start - System.nanoTime()) + " nano seconds");
    }

    private static void quickSort(int[] in, int left, int right) {
        int pivot = (right - left) / 2;
        while (right > left) {
            if (in[left] > in[pivot]) {
                swap(in, left, pivot);
                left++;
            }
            if (in[pivot] > in[right]) {
                swap(in, pivot, right);
                right--;
            }
            quickSort(in, left, right);
        }
    }

    private static void swap(int[] in, int a, int b) {
        int temp;
        temp = in[b];
        in[b] = in[a];
        in[a] = temp;
    }

}
