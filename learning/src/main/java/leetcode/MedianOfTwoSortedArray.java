package leetcode;

public class MedianOfTwoSortedArray {

    public static void main(String[] args) {
        int[] ar1 = new int[]{2};
        int[] ar2 = new int[]{1, 3, 4};

        System.out.println("Median: " + findMedianSortedArrays(ar1, ar2));
    }

    private static double findMedianSortedArrays(int[] ar1, int[] ar2) {

        int totalLength = ar1.length + ar2.length;
        final int traverse = totalLength / 2;
        boolean oneElementMedian = (totalLength % 2 == 0);

        int first = 0, second = 0;
//        determine the median element location
        if (ar1.length > traverse) {
//            median in first array
            first = ar1[traverse];
        } else {
//            median in second
            first = ar2[traverse - ar1.length];
        }


        if (oneElementMedian) {
            return first;
        } else {
            if (ar1.length > traverse + 1) {
//            median in first array
                second = ar1[traverse + 1];
            } else {
//            median in second
                second = ar2[traverse - ar1.length - 1];
            }

            return (first + second) / 2;
        }

    }
}
