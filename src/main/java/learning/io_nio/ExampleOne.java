package learning.io_nio;

import java.nio.file.Paths;

public class ExampleOne
{

    int A = 0;
    boolean B = false;

    // CPU1 (thread1) runs this method
    void writer()
    {
        A = 10; // stores 10 to memory location A membar;
        // pseudo memory barrier to make sure
        // line 7 is executed before the next one
        B = true; // stores true to memory location B
    }

    // CPU2 (thread2) runs this method
    void reader()
    {
        while (!B)
            continue; // loads from memory location B
        // I do care about the A and B store order in method writer() membar;
        // pseudo memory barrier to make sure
        // line 15 is executed before the next one
        assert A == 10; // loads from memory location A } } List 2
    }
}
