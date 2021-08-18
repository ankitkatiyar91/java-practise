package leetcode;

import java.util.Arrays;

public class DailyTemperature {
    public static void main(String[] args) {
//        int[] temperatures = new int[]{73, 74, 75, 71, 69, 72, 76, 73};
//        int[] temperatures = new int[]{30,40,50,60};
        int[] temperatures = new int[]{30,60,90};
        System.out.println(Arrays.toString(dailyTemperatures(temperatures)));
    }

    public static int[] dailyTemperatures(int[] temperatures) {

        int[] result = new int[temperatures.length];
        result[temperatures.length - 1] = 0;
        int jumped;
        for (int i = temperatures.length - 2; i >= 0; i--) {
            jumped = 1;
            while ((i + jumped) < temperatures.length) {
                if (temperatures[i] < temperatures[i + jumped]) {
                    result[i] = jumped;
                    break;
                } else if (result[i + jumped] == 0) {
                    break;
                } else {
                    jumped += result[i + jumped];
                }
            }

        }

        return result;
    }
}
