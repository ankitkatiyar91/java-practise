package IO;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee1 implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name, job;
	int salary;

	public Employee1(String n, String j, int s) {
		name = n;
		job = j;
		salary = s;
	}

	public void display() {
		System.out.println(name + "\t" + job + "\t" + salary);
	}
}

class ObjectSaver {
	public static void main(String ar[]) {
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("employee.data"));
			Employee1 e = new Employee1("Amit", "Developer", 20000);
			Employee1 f = new Employee1("Arun", "Designer", 23000);
			Employee1 g = new Employee1("Devesh", "Programmer", 26000);
			System.out.println("Following objects are serialized...");
			e.display();
			f.display();
			g.display();
			out.writeObject(e);
			out.writeObject(f);
			out.writeObject(g);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}