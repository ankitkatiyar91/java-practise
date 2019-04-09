package inheritance;

public interface Animal {

	default String show() {

		return "Hello";
	}

	static String staticShow() {
		return "A";
	}
}
