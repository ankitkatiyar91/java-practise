package learning.generics;

public class Box<T>
{

    private T t;

    public void set(T t)
    {
        this.t = t;
    }

    public T get()
    {
        return t;
    }

    public <U extends Number> void inspect(U u)
    {
        System.out.println("T: " + t.getClass().getName());
        System.out.println("U: " + u.getClass().getName());
    }

    public static void main(String[] args)
    {
        Box<Number> integerBox = new Box<Number>();
        integerBox.set(new Integer(10));
        integerBox.inspect(new Long(10)); // error: this is still String!
    }

}