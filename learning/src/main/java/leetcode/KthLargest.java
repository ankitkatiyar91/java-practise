package leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class KthLargest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        Collections.shuffle(list);
        int[] in = list.stream().mapToInt(i -> i).toArray();
        System.out.println("Array: " + Arrays.toString(in));

        int findKthLargest = 3;

        Arrays.sort(in);
        System.out.println("Kth largest number is:" + in[in.length - findKthLargest]);
    }
}
