package sorting;

import java.util.Arrays;

public class FindingNthLowest {

    public static void main(String[] args) {
        int[] in = new int[]{10, 4, 5, 7, 2, 3, 9, 8, 1, 6};
        int m = 4;
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
        System.out.println("Looking to sort " + m + " elements");
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

    private static int minWithN(int[] in, int m) {
        System.out.println("Original Array: " + Arrays.toString(in));
        System.out.println("Looking to sort " + m + " elements");
        int[] newArray = new int[in.length];
        int left = 0, right = in.length - 1, start = 0, end = right;
        int midIndex = m - 1;
        newArray[midIndex] = in[midIndex];
        for (int i = 0; i < in.length; i++) {
            if (right > left) {
//            cover equal case.
                if (in[start] < newArray[midIndex]) {
                    newArray[left] = in[start];
                    left++;
                } else if (in[start] >= newArray[midIndex]) {
                    newArray[right] = in[start];
                    right--;
                }

                if (in[end] > newArray[midIndex]) {
                    newArray[right] = in[end];
                    right--;
                } else {
                    newArray[left] = in[end];
                    left++;
                }

                start++;
                end--;
            }
            System.out.println("New Array: " + Arrays.toString(newArray));
        }
        System.out.println("New Array: " + Arrays.toString(newArray));
        return newArray[m - 1];
    }
}
