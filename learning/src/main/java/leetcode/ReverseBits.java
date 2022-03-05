package leetcode;

public class ReverseBits {
    public static void main(String[] args) {
        Integer value = 4;
//        System.out.println("Value: "+value+" "+(value>Integer.MAX_VALUE));
        System.out.println(Integer.toBinaryString(value) + " reverse: " + Integer.toBinaryString(reverseBits(value)));

    }

    public static int reverseBits(int n) {
        if (n == 0) return 0;
        int result = 0; // start with 0 binary
        for (int i = 0; i < 32; i++) {
//             left shift the result to add more bits.
            result <<= 1;
            System.out.println(Integer.toBinaryString(n) + "  " + Integer.toBinaryString(result));
//            check if last bit on `n` is 1 then increase result by 1 to add the bit
            if ((n & 1) == 1) result++;
//            right shift n to drop last bit. ex 101 right shift will be 010
            n >>= 1;
        }
        return result;
    }
}
