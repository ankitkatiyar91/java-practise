package learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CommonNumberFinder
{

    final static List<Number> list1 = Arrays.asList(new Number[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 });
    final static List<Number> list2 = Arrays
            .asList(new Number[] { 3, 5, 1, 6, 2, 6, 3, 3, 6, 1, 5, 7, 2, 6, 2, 5, 2, 6, 8, 2 });

    public static void main(String[] args)
    {
//        findCountOfNumber(new ArrayList<List<Number>>((Collection<? extends List<Number>>) Arrays.asList(new List[] { list1, list2 })), 6);
    }

    private static void findCountOfNumber(final List<List<Number>> lists, final Number num)
    {
        int count = 0;
        for (List<Number> list : lists)
        {
            if (!list.contains(num))
            {
                System.err.printf("Number %d is not common", num);
                return;
            }
        }
        for (List<Number> list : lists)
        {
            for (Number number : list)
            {
                if (number == num)
                    count++;
            }
            System.out.println("List have-" + count);
            count = 0;
        }

    }
}
