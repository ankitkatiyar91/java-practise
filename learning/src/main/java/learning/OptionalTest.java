package learning;

import java.util.Optional;

public class OptionalTest {
	public static void main(String[] args) {
		System.out.println(Optional.ofNullable("ABC").orElse("DEFAULT"));
		System.out.println(Optional.ofNullable("  ").orElse("DEFAULT"));
		System.out.println(Optional.ofNullable("").orElse("DEFAULT"));
		System.out.println(Optional.ofNullable(null).orElse("DEFAULT"));
	}

}
