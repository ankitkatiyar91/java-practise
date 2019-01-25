package learning;

public class InheritanceTest
{

    public static void main(String[] args)
    {
        // InheritanceTestA a = new InheritanceTestA();
        // B b = new B();
        // System.out.println("About Class A-" + a);
        // System.out.println("About Class B-" + b);
        // a.parentMethod();
        // b.parentMethod();

        /*
         * InheritanceTestA a = new B(); a.parentMethod(1, false);
         */
        long anl = 34_44;
        double d = 1.234e2;
        String s = "ankit\rtest";
        System.out.println(anl + "  " + d + " " + s);
        InheritanceTestA a = new InheritanceTestA();
        a.parentMethod(false, 1);

    }

    protected InheritanceTestA parentMethod(boolean b, int i)
    {
        return null;
    }
}

class InheritanceTestA
{
    private String varAp = " Default Variable in A";
    protected String varApr = "Protected Variable in A";
    public String varApu = " Public Variable in A";
    String varAd = "Default Variable in A";

    @Override
    public String toString()
    {
        return "A [varAp=" + varAp + ", varApr=" + varApr + ", varApu=" + varApu + ", varAd=" + varAd + "]";
    }

    public InheritanceTestA parentMethod(int k, boolean b)
    {
        System.out.println("InheritanceTestA.parentMethod()");
        return null;
    }

    protected Integer parentMethod(boolean b, int k)
    {
        System.out.println("InheritanceTestA.parentMethod()");
        return null;
    }

}

class B extends InheritanceTestA
{

    private String varAp = " Default Variable in B";

    // protected String varApr = "Protected Variable in B";
    // public String varApu = " Public Variable in B";
    // String varAd = "Default Variable in B";

    @Override
    public String toString()
    {
        return "B [varAp=" + varAp + ", varApr=" + varApr + ", varApu=" + varApu + ", varAd=" + varAd + "]";
    }

    // U can change access modifier of a overridden method, not return type
    public B parentMethod(int k, boolean b)
    {
        System.out.println("B.parentMethod()");
        return (B)super.parentMethod(k, b);
    }
}