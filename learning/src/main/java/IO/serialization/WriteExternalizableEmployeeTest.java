package IO.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * 
 * @author Ankit Katiyar
 * 
 * @category bytefold
 * @see {@link http://www.bytefold.com/serializing-an-object-with-static-property/}
 *
 */
public class WriteExternalizableEmployeeTest {
	public static void main(String[] args) {
		try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("employee.data"))) {
			// create an object of ExternalizableEmployee
			ExternalizableEmployee emp=new ExternalizableEmployee();
			emp.setName("Test");
			ExternalizableEmployee.setCompany("ByteFold");
			
			// write object to file
			objectOutputStream.writeObject(emp);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
