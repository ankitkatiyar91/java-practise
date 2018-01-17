package learning;

public class LongestRepreatedSequence
{

    public static void main(String[] args)
    {
        String in = "abcdeababc";
        String sub;
        for (int k = in.length() - 1; k > 0; k--)
        {
            sub = in.substring(0, k);
            if (in.indexOf(sub, k) > 0)
            {
                System.out.println("Found: " + sub + " at: " + k);
            }
        }
    }
}
