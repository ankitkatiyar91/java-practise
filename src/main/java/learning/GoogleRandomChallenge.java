package learning;

public class GoogleRandomChallenge
{
    public static void main(String[] args)
    {
        System.out.println(answer("vmxibkgrlm"));
        System.out.println(answer("wrw blf hvv ozhg mrtsg'h vkrhlwv?"));
        System.out.println(answer("Yvzs! I xzm'g yvorvev Lzmxv olhg srh qly zg gsv xlolmb!!"));

        
        char k = Character.forDigit(1, 10);
        System.out.println("Character: " + k);
        System.out.println("Character: " + ((int) k));
    }

    private static String answer(String s)
    {

        char[] chars = s.toCharArray();
        int in, out;
        char[] outchars = new char[chars.length];
        for (int i = 0; i < chars.length; i++)
        {
            outchars[i] = chars[i];
            in = (int) chars[i];
            if (in > 96 && in < 123)
            {
                out = in + 25;
                if (out > 122)
                {
                    out = out - (2 * (out - 122));
                }

                outchars[i] = (char) out;
            }

        }
        return new String(outchars);
        // my code end here
    }
}
