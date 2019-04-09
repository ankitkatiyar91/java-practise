package com.generic;

import java.util.Map;

public class GenericTest {

	public static void main(String[] args) {
		PersonUtil<Person> personUtil=new PersonUtil<>();
		personUtil.show(new Person());
	}
}
class PersonUtil<T>
{

	public void show(T obj) {
		System.out.println("Person->"+((Person)obj).i);
	}
}
class Person{
	
	int i=10;
}