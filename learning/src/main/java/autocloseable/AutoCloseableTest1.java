package com.autocloseable;

import java.io.FileInputStream;
import java.io.InputStream;

public class AutoCloseableTest1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		InputStream resource1 = null;
		try(InputStream resource=new FileInputStream("test")){
			resource1=new FileInputStream("test");
			System.out.println("Using resource");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Exit from the resource try");
		System.out.println(resource1);
	}

}