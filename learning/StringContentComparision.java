package learning;

import java.util.StringTokenizer;

public class StringContentComparision
{

    public static void main(String[] args)
    {
        String source = "This is source String";
        String target = "This is not source anymore";
        System.out.println(compare(source, target));
    }

    public static String compare(String source, String target)
    {
        StringBuffer generated = new StringBuffer();
        StringTokenizer sourceTokens = new StringTokenizer(source);
        StringTokenizer targetTokens = new StringTokenizer(target);
        String sourceToken;
        String targetToken;
        while (sourceTokens.hasMoreTokens() && targetTokens.hasMoreElements())
        {
            sourceToken = sourceTokens.nextToken();
            targetToken = targetTokens.nextToken();
            if (sourceToken.equalsIgnoreCase(targetToken))
            {
                generated.append(sourceToken);
            }
        }

        return generated.toString();
    }
}
