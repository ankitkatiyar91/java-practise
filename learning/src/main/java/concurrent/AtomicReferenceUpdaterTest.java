package concurrent;

import java.util.concurrent.atomic.AtomicReference;

public class AtomicReferenceUpdaterTest {

    public static void main(String[] args) {
        AtomicReference<StringBuffer> atomicReference = new AtomicReference<>();
        atomicReference.set(new StringBuffer("Test Value"));

        System.out.println(atomicReference.get());
    }

}
