package learning;

import java.security.NoSuchAlgorithmException;

class StringTest
{
    public static void main(String[] args) throws NoSuchAlgorithmException
    {
        simpleTest();
        // new StringTest().testName();
        /*
         * System.out.println("Float-"+(1.0f/0f)); System.out.println("Int-"+(1/0));
         */

        // regionMatchs();
    }

    private static void simpleTest()
    {
        String s = new String("abc");

        String s1 = "abc";
        String s2 = new String("abc");
        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println("s==s2 " + (s == s2));
    }

    private static void regionMatchs()
    {
        String searchMe = "Green Eggs and Ham";
        String findMe = "Eggs";
        int searchMeLength = searchMe.length();
        int findMeLength = findMe.length();
        boolean foundIt = false;
        for (int i = 0; i <= (searchMeLength - findMeLength); i++)
        {
            if (searchMe.regionMatches(i, findMe, 0, findMeLength))
            {
                foundIt = true;
                System.out.println(searchMe.substring(i, i + findMeLength) + " At:" + i);
                break;
            }
        }
        if (!foundIt)
            System.out.println("No match found.");

    }

    public void testName()
    {
        try
        {
            wait();
            new Thread().start();
        }
        catch (Exception e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
