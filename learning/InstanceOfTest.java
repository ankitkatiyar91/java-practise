package learning;

public class InstanceOfTest
{
    public static void main(String[] args)
    {
        I i = new A();
        A a = new A();
        A c = new C();
        System.out.println("i instanceof I " + (i instanceof I));
        System.out.println("i instanceof A " + (i instanceof A));
        System.out.println("i instanceof C " + (i instanceof C));
        System.out.println("a instanceof I " + (a instanceof I));
        System.out.println("a instanceof A " + (a instanceof A));
        System.out.println("c instanceof I " + (c instanceof I));
        System.out.println("c instanceof A " + (c instanceof A));
        System.out.println("c instanceof C " + (c instanceof C));
        System.out.println("a instanceof C " + (a instanceof C));

    }
}

class A implements I
{

}

interface I
{

}

class C extends A
{

}