package learning.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BasicExample
{
    public static void main(String[] args)
    {
        String input = "+918860690329";
        Pattern pattern = Pattern.compile("[+91]*[0-9]{10,13}");

        Matcher matcher = pattern.matcher(input);

        if (matcher.find())
        {
            System.out.println("Find: true");
            System.out.println("Match: start:" + matcher.start() + " group:" + matcher.group() + " End:"
                    + matcher.end());
            System.out.println("Match: " + matcher.matches());
        }
        else
        {
            System.out.println("No match found");
        }
    }
}
