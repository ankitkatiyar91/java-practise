package codejam;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class WordProblem
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int tc = in.nextInt();
        char[] chars;
        List<String> genS;
        String s1, s2;
        for (int k = 0; k < tc; k++)
        {
            String inS = in.next();
            chars = inS.toCharArray();
            genS = new LinkedList<String>();
            genS.add(chars[0] + "");
            for (int i = 1; i < chars.length; i++)
            {

                s1 = genS.get(genS.size() - 1) + chars[i] + "";
                s2 = chars[i] + genS.get(genS.size() - 1) + "";
                genS.add(s1);
                genS.add(s2);
                genS.add(new StringBuffer(s1).reverse().toString());
                genS.add(new StringBuffer(s2).reverse().toString());

            }
           
            Collections.sort(genS);
            System.out.println(genS);
            System.out.println("CASE #" + k + ": " + genS.get(genS.size() - 1));
        }
        in.close();

    }
    
    public boolean isEmpty(String... fields)
    {
        for (String string : fields)
        {
            if (null == string || string.trim().length() == 0)
            {
                // return true of filed is blank
                return true;
            }
        }
        return false;
    }
}
