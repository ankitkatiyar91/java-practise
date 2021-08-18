package leetcode;

public class MedianOfTwoSortedArray {

    public static void main(String[] args) {
        int[] ar1 = new int[]{2};
        int[] ar2 = new int[]{1,3,4};

        System.out.println("Median: " + findMedianSortedArrays(ar1, ar2));
    }

    private static double findMedianSortedArrays(int[] ar1, int[] ar2) {

        if (ar1.length == 0) {
            return findMedian(ar2);
        } else if (ar2.length == 0) {
            return findMedian(ar1);
        }

        int[] left, right;
        if (ar1[ar1.length - 1] <= ar2[0]) {
//            ar2 is in right
            right = ar2;
            left = ar1;
        } else if (ar2[ar2.length - 1] <= ar1[0]) {
//            ar1 is in right
            right = ar1;
            left = ar2;
        } else {
//            merge scenario
            left = ar1;
            right = ar2;

            int i = 0, j = 0, medianIndex = (left.length + right.length) / 2, median = ar1[0], median2 = ar2[0];
            while (i < left.length && j < right.length) {
                if (left[i] < right[j]) {
                    median2 = median;
                    median = left[i];
                    i++;
                } else {
                    median2 = median;
                    median = right[j];
                    j++;
                }
                if (i + j == medianIndex + 1) {
                    break;
                }
            }

            if ((left.length + right.length) % 2 == 1) {
                return median;
            } else {
                return (median + median2) / 2d;
            }

        }

        int medianIndex = (left.length + right.length) / 2;
        if ((left.length + right.length) % 2 == 1) {
//            odd elements
            return extracted(left, right, medianIndex);
        } else {
//            even elements
            return (extracted(left, right, medianIndex) + extracted(left, right, medianIndex - 1)) / 2d;
        }

//        return 0;
    }

    private static double findMedian(int[] ar2) {
        if (ar2.length % 2 == 1) {
            return ar2[ar2.length / 2];
        } else {
            return (ar2[ar2.length / 2] + ar2[ar2.length / 2 - 1]) / 2d;
        }
    }

    private static int extracted(int[] left, int[] right, int medianIndex) {
        if (left.length > medianIndex) {
            return left[medianIndex];
        } else {
            return right[medianIndex - left.length];
        }
    }
}
