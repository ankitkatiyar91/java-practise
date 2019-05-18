package collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		SortedSet<String> set = new TreeSet<>();

		set.add("Y");
		set.add("A");
		set.add("A");
		System.out.println(set);
	}

}
