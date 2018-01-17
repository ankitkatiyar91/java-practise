package learning;

public class MultipleInheritanceExample
{
    public static void main(String[] args)
    {
        MulA aImple = new MulAImple();
        aImple.getName();

    }
}

interface MulA
{
    default void getName()
    {
        System.out.println("MulA.getName()");
    }
}

interface MulB extends MulA
{
    default void getName()
    {
        System.out.println("MulB.getName()");
    }
}

interface MulX
{
    default void getName()
    {
        System.out.println("MulX.getName()");
    }
}

class MulAImple implements MulA, MulB
{

}

class MulXImple implements MulA, MulB, MulX
{
    @Override
    public void getName()
    {
        MulB.super.getName();
    }
}
