package learning;

public class PalindromeExample
{
    public static void main(String[] args)
    {
        String s = "Ankit";
        System.out.println("Original string:" + s);
        char[] orgS = s.toCharArray();
        char[] reverseS = new char[orgS.length];
        for (int i = orgS.length - 1; i >= 0; i--)
        {
            reverseS[orgS.length - i - 1] = orgS[i];
        }

        String reversed = new String(reverseS);
        System.out.println("Reverse String:" + reversed);
        System.out.println("Palindrome check: " + s.equals(reversed));

    }

}
