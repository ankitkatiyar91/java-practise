package leetcode;

import java.util.HashMap;

/**
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 */
public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
//        String s = "";
//        String s = " ";
//        String s = "abba"; //2
//        String s = "au"; //2
//        String s = "abcabcbb"; //3
        String s = "bbbb"; //1
//        String s = "wobgrovw"; //6
//        System.out.println(lengthOfLongestSubstring(s));
        System.out.println(lengthOfLongestSubstringArraySolution(s));
    }


    public static int lengthOfLongestSubstring(String s) {
        char c[] = s.toCharArray();
        int answer = 0;

        HashMap<Character, Integer> cache = new HashMap<>();

        for (int i = 0, j = 0; i < c.length; i++) {
            if (cache.containsKey(c[i])) {
                j = Math.max(cache.get(c[i]) + 1, j);
            }
            cache.put(c[i], i);
            answer = Math.max(answer, i - j + 1);

//            System.out.println("scanning " + c[i] + " answer:" + answer + " j:" + j + " i:" + i);
        }

        return answer;
    }


    public static int lengthOfLongestSubstringArraySolution(String s) {
        char c[] = s.toCharArray();
        int answer = 0;

        int[] cache = new int[128];

        for (int i = 0, j = 0; i < c.length; i++) {
            if (cache[c[i]] > 0) {
                j = Math.max(cache[c[i]], j);
            }
            cache[c[i]] = i + 1;
            answer = Math.max(answer, i - j + 1);

//            System.out.println("scanning " + c[i] + " answer:" + answer + " j:" + j + " i:" + i + " cache[c[i]]:" + cache[c[i]]);
        }

        return answer;
    }
}
