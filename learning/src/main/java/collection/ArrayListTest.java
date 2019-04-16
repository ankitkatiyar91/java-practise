package collection;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ArrayListTest {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("A", "B");

		Map<String, String> map = list.stream().collect(Collectors.toMap(String::toString, String::toLowerCase));
		
		System.out.println(map);
	}

}
