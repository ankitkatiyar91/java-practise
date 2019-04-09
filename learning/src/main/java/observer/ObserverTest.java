package observer;

public class ObserverTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Creating Object");
		MyModel myModel = new MyModel("firstName", "lastName");
		myModel.addObserver(new MyObserver());
		System.out.println("Changing First Name");
		myModel.setFirstName("Ankit");
		System.out.println("Changing Last Name");
		myModel.setLastName("Katiyar");

	}

}
