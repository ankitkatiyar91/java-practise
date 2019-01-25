package learning;

class MyImmutable
{
    private final StringBuffer a;

    public MyImmutable(StringBuffer a)
    {
        this.a = a;
    }

    public StringBuffer getA()
    {
        return a;
    }
}

class MyIm2 extends MyImmutable
{

    public MyIm2(StringBuffer a)
    {
        super(a);

    }

    public void updateA(String s)
    {
        getA().append(s);
    }
}

public class MyImmutableTest
{
    public static void main(String[] args)
    {
        MyIm2 im2 = new MyIm2(new StringBuffer("Ankit-- "));
        im2.updateA("asdjgadjgfgdsaj");
        System.out.println(im2.getA());
    }
}
