package com.collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		Map<User,Integer> users=new HashMap<User, Integer>();
		
		for(int i=0;i<6;i++){
			users.put(new User("name"+i, i),i);
		}
		
		for(int i=0;i<2;i++){
			users.put(new User("name"+i, i),i);
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("%%%%%%%%%%%%%%%%%% print %%%%%%%%%%%%%%%%%%%%%%%");
		for (User user : users.keySet()) {
			System.out.println(user);
		}
	}
}
