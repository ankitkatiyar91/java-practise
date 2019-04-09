package com.observerTest;

import java.util.Observable;

public class MyModel extends Observable {

	private String firstName;
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
		setChanged();		
		notifyObservers(firstName);
		
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
		setChanged();		
		notifyObservers(lastName);
	}

	@Override
	public String toString() {
		return "MyModel [firstName=" + firstName + ", lastName=" + lastName + "]";
	}

	public MyModel(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public MyModel() {
		super();
	}

}
