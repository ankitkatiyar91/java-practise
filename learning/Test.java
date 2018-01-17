package learning;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

class Test
{

    public static void main(String... ar)
    {
        System.out.println("Deci-"+Integer.decode("070"));
        System.out.println("Base2:"+Integer.valueOf("10", 2));
        List<Date> a = new ArrayList<Date>();

        a.add(Date.from(LocalDate.of(2016, 11, 6).atStartOfDay(ZoneId.systemDefault()).toInstant()));
        a.add(Date.from(LocalDate.of(2016, 11, 2).atStartOfDay(ZoneId.systemDefault()).toInstant()));
        a.add(null);
        a.add(null);
        a.add(Date.from(LocalDate.of(2016, 11, 10).atStartOfDay(ZoneId.systemDefault()).toInstant()));
        a.add(null);
        System.out.println(a);
        // simpleComparator(a);
        // lambadaComparator(a);
        // lambadaComparator2(a);
        lambadaComparator3(a);
        System.out.println(a);
        
    }

    private static void lambadaComparator3(List<Date> a)
    {
        Collections.sort(a, Comparator.nullsFirst(Comparator.comparing(Date::getTime)));

    }

    @SuppressWarnings("unused")
    private static void lambadaComparator(List<Date> a)
    {
        Collections.sort(a, Comparator.nullsFirst((Date d1, Date d2) -> {
            return d1.compareTo(d2);
        }));
    }

    @SuppressWarnings("unused")
    private static void lambadaComparator2(List<Date> a)
    {
        Collections.sort(a, Comparator.nullsFirst(new Comparator<Date>()
        {
            public int compare(Date o1, Date o2)
            {
                return o1.compareTo(o2);

            }
            
        }));
    }

    @SuppressWarnings("unused")
    private static void simpleComparator(List<Date> a)
    {
        Collections.sort(a, new Comparator<Date>()
        {
            //

            public int compare(Date o1, Date o2)
            {
                // SOlution 1
                // if (null == o1 && null == o2)
                // {
                // return 0;
                // }
                // else if (null == o1)
                // {
                // return -1;
                // }
                // else if (null == o2)
                // {
                // return 1;
                // }
                // return o1.compareTo(o2);

                // SOlution 2

                return o1 == null ? (o2 == null ? 0 : -1) : (o2 == null ? 1 : o1.compareTo(o2));

            }
        });
    }

}

class T implements Comparator<Date>{

    @Override
    public int compare(Date o1, Date o2)
    {
        return 0;
    }
    
    static void nullsFirst(Comparator<? super T> comparator){
        
    }
}
