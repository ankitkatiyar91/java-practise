package collection;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		SortedMap<String, Object> map = new TreeMap<>();

		map.put("Y", null);
		map.put("A", null);
		map.put("A", new Object());
		
		System.out.println(map);
	}
}