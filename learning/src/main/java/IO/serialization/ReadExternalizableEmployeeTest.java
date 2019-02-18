package IO.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * 
 * @author Ankit Katiyar
 * 
 * @category bytefold
 * @see {@link https://www.bytefold.com/system-properties-in-java/}
 *
 */

public class ReadExternalizableEmployeeTest {
	public static void main(String[] args) {
		try (ObjectInputStream objectOutputStream = new ObjectInputStream(new FileInputStream("employee.data"))) {
			// Read an object of ExternalizableEmployee
			ExternalizableEmployee employee = (ExternalizableEmployee) objectOutputStream.readObject();

			System.out.println(employee.getName());
			System.out.println(employee.getCompany());
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
