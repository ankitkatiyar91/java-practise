package concurrent;

import java.util.concurrent.atomic.AtomicReference;

public class AtomicReferenceUpdaterTest {

	public static void main(String[] args) {
		AtomicReference<StringBuffer> atomicReference = new AtomicReference<StringBuffer>();
		atomicReference.set(new StringBuffer("Name: "));

		System.out.println(atomicReference.get());
	}

}
