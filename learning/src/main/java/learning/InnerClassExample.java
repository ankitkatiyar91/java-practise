package learning;

public class InnerClassExample {
	static int k = 10;

	{
		System.out.print(k);
	}

	static class K {
		static int i = 0;
	}

	class K2 {
		static final int i = 0;
	}

	public static void main(String[] args) {
		// static classes can be instantiated directly
		K k = new K();

		// for non static classes object of inclosing class in required.
		InnerClassExample classExample = new InnerClassExample();
		K2 name = classExample.new K2();

	}
}
