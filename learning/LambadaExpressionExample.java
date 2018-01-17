package learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class LambadaExpressionExample
{
    public static final Consumer<String> myStringConsumer = (s) -> {
        System.out.println(s);
    };
    
    public static final Consumer<String> myStringConsumer1 = (s) -> {
        System.out.println(" From 2:"+s);
    };
    
    
    public static void main(String[] args)
    {
        LambadaExpressionExample l = new LambadaExpressionExample();
        // l.comparatorTest();
        // l.runnableTest();
        l.functionTest();

    }

    private void functionTest()
    {
        final Function<String, Double> f = (s) -> {
            return Double.parseDouble(s);
        };

        List<String> list = new ArrayList<String>();
        list.addAll(Arrays.asList("1", "10.9"));
        for (String string : list)
        {
            System.out.println(f.apply(string));
        }
        
       
        // print using stream API
        list.stream().forEach(myStringConsumer.andThen(myStringConsumer1));

    }

    private void runnableTest()
    {
        int localVar = 10;
        Runnable r = () -> {
            int k = 0;
            System.out.println("LambadaExpression Runnable k:" + k + " Effexctively final localVar:" + localVar);
            
        };

        new Thread(r).start();
    }

    private void comparatorTest()
    {
        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("G");
        list.add("K");
        list.add("P");
        list.add("B");
        list.add("b");
        list.add("a");

        Comparator<String> s = (String o1, String o2) -> {
            return o1.compareTo(o2);
        };

        Collections.sort(list, s);
        System.out.println("Natural Order: " + list);

        // stringCompareToIgnoreCase

        Collections.sort(list, LambadaExpressionExample::stringCompareToIgnoreCase);
        System.out.println("stringCompareToIgnoreCase: " + list);

        // stringCompareToIgnoreCaseInstanceMethod
        Collections.sort(list, this::stringCompareToIgnoreCaseInstanceMethod);
        System.out.println("stringCompareToIgnoreCaseInstanceMethod: " + list);

    }

    private static int stringCompareToIgnoreCase(String s1, String s2)
    {
        return s1.compareToIgnoreCase(s2);
    }

    private int stringCompareToIgnoreCaseInstanceMethod(String s1, String s2)
    {
        return s1.compareToIgnoreCase(s2);
    }

    public static void showMyLambadaCollection(MyLambadaCollection m)
    {

        System.out.println("MyLambadaCollection:" + m);
    }
}

class MyLambadaCollection
{
    public MyLambadaCollection(Collection<Object> a)
    {

    }

}
