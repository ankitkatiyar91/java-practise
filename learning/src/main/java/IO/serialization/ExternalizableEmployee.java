package IO.serialization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

/**
 * 
 * @author Ankit Katiyar
 * 
 * @category bytefold
 * @see {@link http://www.bytefold.com/serializing-an-object-with-static-property/}
 *
 */
public class ExternalizableEmployee implements Externalizable {

	private String name;
	private static String company;

	// Inner Proxy class for Serialization.
	private static class Employee implements Serializable {
		private static final long serialVersionUID = 610993458650534361L;

		String name;
		String company;

		public Employee(String name, String company) {
			super();
			this.name = name;
			this.company = company;
		}

		public String getName() {
			return name;
		}

		public String getCompany() {
			return company;
		}

	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		/*
		 * Write the object of proxy class Employee with the values of
		 * ExternalizableEmployee
		 */
		Employee emp = new Employee(name, company);
		out.writeObject(emp);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		/* Read the proxy object and initialize ExternalizableEmployee */
		Employee employee = (Employee) in.readObject();
		this.name = employee.getName();
		company = employee.getCompany();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static String getCompany() {
		return company;
	}

	public static void setCompany(String company) {
		ExternalizableEmployee.company = company;
	}

}
