package learning.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListPrintExample
{
    public static void main(String[] args)
    {
        listPrintTest();
        numberAddTest();
    }

    static void numberAddTest()
    {
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3));
        
        addNumbers(list);
    }

    static void listPrintTest()
    {
        List<Object> list = Arrays.asList("1", "2", "3");
        printList(list);
        List<String> strings = Arrays.asList("s1", "s2", "s3");
        printList(strings);
        printObjectList(list);
        printObjectList(strings); // error cannot pass List<String>
    }

    public static void printList(List<?> objects)
    {
        System.out.println("printList()");
        for (Object object : objects)
        {
            System.out.println(object);
        }

    }

    public static void printObjectList(List<? extends Object> objects)
    {
        System.out.println("printObjectList()");
        for (Object object : objects)
        {
            System.out.println(object);
        }
        objects.add(null); // unsupported operation exception
      

    }

    public static void addNumbers(List<? super Integer> list)
    {
        for (int i = 1; i <= 10; i++)
        {
            list.add(i);
        }
    }

    void foo(List<?> i)
    {
        fooHelper(i);
    }

    // Helper method created so that the wildcard can be captured
    // through type inference.
    private <T> void fooHelper(List<T> l)
    {
        l.set(0, l.get(0));
    }

}
