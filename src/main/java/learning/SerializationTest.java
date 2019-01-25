package learning;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.InetAddress;

public class SerializationTest {

	private static File file = new File("persion_data.txt");

	public static void main(String[] args) {
		try {
			System.out.println("Address: " + InetAddress.getByName("172.217.25.110").getHostName());
			Person person = new Person(1, "Viru");
			Person.setStaticInt(100);

			System.out.println("Writing: " + person);

			ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
			objectOutputStream.writeObject(person);
			objectOutputStream.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	static class ReadObject {
		public static void main(String[] args) {
			try {

				ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file));
				System.out.println("Read:" + inputStream.readObject());
				// here we can see that static variables are not serialized
				inputStream.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

		}
	}

	static class Person implements Serializable {

		private static final long serialVersionUID = 305862832052147514L;
		private int id;
		private String name;
		private static Integer staticInt;

		public Person() {
			// TODO Auto-generated constructor stub
		}

		public Person(int id, String name) {
			super();
			this.id = id;
			this.name = name;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public static Integer getStaticInt() {
			return staticInt;
		}

		public static void setStaticInt(Integer staticInt) {
			Person.staticInt = staticInt;
		}

		@Override
		public String toString() {
			return "Person [id=" + id + ", name=" + name + "] Static:" + Person.getStaticInt();
		}

	}

}
