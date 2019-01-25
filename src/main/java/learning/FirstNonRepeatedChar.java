package learning;

public class FirstNonRepeatedChar
{

    public static void main(String[] args)
    {
        String in = "stress";
        char k;
        for (int i = 0; i < in.length(); i++)
        {
            k = in.charAt(i);
            if (in.indexOf((int) k, i + 1) < 0)
            {
                System.out.println("First non matching charecter is: " + k + " at index: " + i);
                break;
            }
        }
    }

}
