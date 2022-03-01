package leetcode;

/**
 * https://leetcode.com/problems/reverse-integer/solution/
 */
public class ReverseInteger {

    public static void main(String[] args) {
        int value = Integer.MAX_VALUE;
        System.out.println(value + " reverse: " + reverse(value));
    }

    public static int reverse(int x) {
        int newX = 0;
        while (x != 0) {
            newX = (10 * newX) + (x % 10);
//            System.out.println(x + "  " + newX + " " + (x % 10) + " " + (newX % 10));
            if ((x % 10) != (newX % 10)) {
//                overflow detected
                return 0;
            }
            x = x / 10;
        }

        return newX;
    }
}
