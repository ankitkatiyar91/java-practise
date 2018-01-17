package learning;

public class NestedClassExample
{
    
  
    
    public static void main(String[] args)
    {
        int K = 0;

    }
}

class Outer
{

    private int outerA;
    private static int outerB;
    int j;

    protected static class StaticInner
    {
        int j;

        public void testName() throws Exception
        {
            outerB = 1;

            final class StaticInner1
            {
                public static final String FAREWELL = "Bye bye";

                {
                    System.out.println("Outer.StaticInner.testName().StaticInner1.testName()");
                    outerB = StaticInner.this.j;

                }
            }
            StaticInner1 inner1 = new StaticInner1();
        }

    }

    private class Inner
    {
        public static final String FAREWELL = "Bye bye";

        public Inner()
        {
            class Inner_Local
            {

                public static final String FAREWELL = "Bye bye";

            }
        }

        int k = Outer.this.j;

    }

    interface HelloThere
    {
        public void greet();
    }

    public static void greetInEnglish()
    {

        class EnglishHelloThere implements HelloThere
        {
            public void greet()
            {

            }
        }
        HelloThere myGreeting = new EnglishHelloThere();
        myGreeting.greet();
    }
}