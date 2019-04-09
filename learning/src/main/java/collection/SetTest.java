package com.collection;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
	
	public static void main(String[] args) {
		Set<User> users=new HashSet<User>();		
		for(int i=0;i<6;i++){
			users.add(new User("name"+i, i));
		}
		
		for(int i=0;i<2;i++){
			users.add(new User("name"+i, i));
		}
		for (User user : users) {
			System.out.println(user);
		}
	}

}
