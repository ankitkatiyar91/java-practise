package collection;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ArrayListTest {

	public static void main(String[] args) {
		stringListToMap();

		List<Employee> emp = Arrays.asList(new Employee(1), new Employee(2));

		Map<Integer, Employee> map = emp.stream().collect(Collectors.toMap(el -> el.getId(), el -> el));
		System.out.println(map);
	}

	private static void stringListToMap() {
		List<String> list = Arrays.asList("A", "B");

		Map<String, String> map = list.stream().collect(Collectors.toMap(String::toString, String::toLowerCase));

		System.out.println(map);
	}

	static class Employee {
		Integer id;

		public Employee(Integer id) {
			super();
			this.id = id;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		@Override
		public String toString() {
			return "Employee [id=" + id + "]";
		}

	}

}
