package learning;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashSet;
import sun.misc.Unsafe;

public class ObjectAddressExample
{
    private static int apple = 10;
    private int orange = 10;
    private static int apple1 = 20;
    private static Unsafe unsafe;

    public static void main(String[] args)
    {
        try
        {
            // test2();
            // printAddresses("apple", 1, 3, 4);

            test3();
        }
        catch (SecurityException | NoSuchFieldException | IllegalArgumentException | IllegalAccessException e)
        {
            e.printStackTrace();
        }
    }

    private static void test3() throws SecurityException, NoSuchFieldException, IllegalArgumentException,
            IllegalAccessException
    {
        Unsafe unsafe = getUnsafeInstance();
        String password = new String("My PAssword");
        String fake = new String(password.replaceAll(".", "?"));
        System.out.println("Password: " + password); // l00k@myHor$e
        System.out.println("Fake: " + fake); // ????????????

        unsafe.copyMemory(
                fake, 0L, null, toAddress(password), sizeOf(password));

        System.out.println("Password: " + password); // ????????????
        System.out.println("Fake: " + fake); // ????????????

    }

    private static void test2() throws SecurityException, NoSuchFieldException, IllegalArgumentException,
            IllegalAccessException
    {   

        Unsafe unsafe = getUnsafeInstance();

        System.out.println("Apple:" + apple);

        Field appleField = ObjectAddressExample.class.getDeclaredField("apple");
        System.out.println("Location of Apple: "
                + unsafe.staticFieldOffset(appleField));

        Field orangeField = ObjectAddressExample.class.getDeclaredField("orange");
        System.out.println("Location of Orange: "
                + unsafe.objectFieldOffset(orangeField));

        long size = sizeOf(new Integer(0));
        long start = unsafe.staticFieldOffset(appleField);
        long address = unsafe.staticFieldOffset(ObjectAddressExample.class.getDeclaredField("apple1"));
        unsafe.copyMemory(start, address, size);

        System.out.println("Apple:" + apple);

    }

    private static Unsafe getUnsafeInstance() throws SecurityException,
            NoSuchFieldException, IllegalArgumentException,
            IllegalAccessException
    {
        if (unsafe == null)
        {
            Field theUnsafeInstance = Unsafe.class.getDeclaredField("theUnsafe");
            theUnsafeInstance.setAccessible(true);
            unsafe = (Unsafe) theUnsafeInstance.get(Unsafe.class);
        }
        return unsafe;
    }

    public static void printAddresses(String label, Object... objects) throws SecurityException, NoSuchFieldException,
            IllegalArgumentException, IllegalAccessException
    {
        Unsafe unsafe = getUnsafeInstance();
        boolean is64bit = true;
        System.out.print(label + ": 0x");
        long last = 0;
        int offset = unsafe.arrayBaseOffset(objects.getClass());
        int scale = unsafe.arrayIndexScale(objects.getClass());
        switch (scale)
        {
            case 4:
                long factor = is64bit ? 8 : 1;
                final long i1 = (unsafe.getInt(objects, offset) & 0xFFFFFFFFL) * factor;
                System.out.print(Long.toHexString(i1));
                last = i1;
                for (int i = 1; i < objects.length; i++)
                {
                    final long i2 = (unsafe.getInt(objects, offset + i * 4) & 0xFFFFFFFFL) * factor;
                    if (i2 > last)
                        System.out.print(", +" + Long.toHexString(i2 - last));
                    else
                        System.out.print(", -" + Long.toHexString(last - i2));
                    last = i2;
                }
                break;
            case 8:
                throw new AssertionError("Not supported");
        }
        System.out.println();
    }

    public static long sizeOf(Object o) throws SecurityException, NoSuchFieldException, IllegalArgumentException,
            IllegalAccessException
    {
        Unsafe u = getUnsafeInstance();
        HashSet<Field> fields = new HashSet<Field>();
        Class c = o.getClass();
        while (c != Object.class)
        {
            for (Field f : c.getDeclaredFields())
            {
                if ((f.getModifiers() & Modifier.STATIC) == 0)
                {
                    fields.add(f);
                }
            }
            c = c.getSuperclass();
        }

        // get offset
        long maxSize = 0;
        for (Field f : fields)
        {
            long offset = u.objectFieldOffset(f);
            if (offset > maxSize)
            {
                maxSize = offset;
            }
        }

        return ((maxSize / 8) + 1) * 8; // padding
    }

    static long toAddress(Object obj) throws SecurityException, NoSuchFieldException, IllegalArgumentException,
            IllegalAccessException
    {
        Object[] array = new Object[] { obj };
        long baseOffset = getUnsafeInstance().arrayBaseOffset(Object[].class);
        return normalize(getUnsafeInstance().getInt(array, baseOffset));
    }

    static Object fromAddress(long address) throws SecurityException, NoSuchFieldException, IllegalArgumentException,
            IllegalAccessException
    {
        Object[] array = new Object[] { null };
        long baseOffset = getUnsafeInstance().arrayBaseOffset(Object[].class);
        getUnsafeInstance().putLong(array, baseOffset, address);
        return array[0];
    }

    private static long normalize(int value)
    {
        if (value >= 0)
            return value;
        return (~0L >>> 32) & value;
    }

}
