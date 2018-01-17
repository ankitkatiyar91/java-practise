package learning;

public class ParentChildMethod
{

    static class Parent
    {
        private void method1()
        {
           System.out.println("Parent.method1()");
        }

        public void method2()
        {
            System.out.println("Parent.method2()");
            this.method1();
        }
    }

    static class Child extends Parent
    {

        public void method1()
        {
           System.out.println("Child.method1()");
        }
    }

    public static void main(String[] args)
    {
        Parent parent = new Child();
        parent.method2();
    }
}
