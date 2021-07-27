package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] nums) {
        if (nums.length < 3) {
            return Collections.emptyList();
        }
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        int sum = 0, l, r;
        for (int i = 0; i < nums.length; i++) {

            if (i != 0 && nums[i] == nums[i - 1]) continue;

            l = i + 1;
            r = nums.length - 1;
            while (r > l) {
                sum = nums[i] + nums[l] + nums[r];
                if (sum == 0) {
                    list.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    while (l < r && (nums[l] == nums[l + 1])) {
                        l++;
                    }
                    while (l < r && (nums[r] == nums[r - 1])) {
                        r--;
                    }
                    l++;
                    r--;
                } else if (sum > 0) {
                    r--;
                } else {
                    l++;
                }

            }
        }

        return list;

    }


    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }
}
