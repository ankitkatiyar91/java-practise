package learning;

import java.util.Arrays;

public class FirstNonRepeatedChar {

    public static void main(String[] args) {
        String in = "stress";
        int[] chars = new int[26];
        for (char c : in.toCharArray()) {
            chars[c - 'a']++;
        }

        System.out.println(Arrays.toString(chars));

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 1) {
                System.out.println("Non repeating char is:" + ((char) ('a' + i)));
            }
        }
    }

}
