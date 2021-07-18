package generics;

public class Box<T> {

    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public <U extends Number> void inspect(U u) {
        System.out.println("T: " + t.getClass().getName());
        System.out.println("U: " + u.getClass().getName());
    }

    public static void main(String[] args) {
        Box<Number> integerBox = new Box<Number>();
        integerBox.set(Integer.valueOf(10));
        integerBox.inspect(Long.valueOf(10)); // error: this is still String!
    }

}