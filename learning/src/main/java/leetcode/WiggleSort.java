package leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WiggleSort {

    public static void main(String[] args) {
//        List<Integer> list = Arrays.asList(1,5,1,1,6,4);
//        Collections.shuffle(list);
//        int[] in = list.stream().mapToInt(i -> i).toArray();
        int[] in=new int[]{1,5,1};
        long start = System.nanoTime();
        System.out.println("Original Array: " + Arrays.toString(in));
        wiggleSort(in);
        System.out.println(Arrays.toString(in) + " completed in " + (start - System.nanoTime()) + " nano seconds");

    }


    public static void wiggleSort(int[] nums) {

//        Arrays.sort(nums);
//        nums[i-1],nums[i],nums[i+1]
        int  temp;
        for (int i = 1; i < nums.length - 1; i += 2) {
            if (nums[i - 1] > nums[i]) {
                temp = nums[i];
                nums[i] = nums[i - 1];
                nums[i - 1] = temp;
            }

            if (nums[i] < nums[i + 1]) {
                temp = nums[i + 1];
                nums[i + 1] = nums[i];
                nums[i] = temp;
            }
//            System.out.println(Arrays.toString(nums));
        }

        if (nums.length%2==0 && (nums[nums.length - 2] > nums[nums.length - 1])) {
            temp = nums[nums.length - 1];
            nums[nums.length - 1] = nums[nums.length  - 2];
            nums[nums.length - 2] = temp;
        }

    }
}
