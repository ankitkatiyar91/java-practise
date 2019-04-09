package com.test.main;

import java.io.File;
import java.io.IOException;
import java.util.Enumeration;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Test.main()");
		StringBuffer s = new StringBuffer("abc");
				s.reverse();
		/*String s = "abc";
		s.substring(1, 2);
		File file;
		file.c*/
		/*try {
			InputStream stream = new FileInputStream("");
			stream.read();
			Reader reader = new FileReader("");
			reader.read();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// BUffered

		char ch;
		CharsetEncoder ce = Charset.forName("Unicode").newEncoder();
		StringBuilder result = new StringBuilder();
		for (char c = 0; c < Character.MAX_VALUE; c++) {
			if (ce.canEncode(c) && Character.isLetter(c)) {
				result.append(c);
			}
			int i=c;
			System.out.print(i+",");
		}
		System.out.println("\nString->"+result);
		Character character=new Character('c');
		
		for (int i = 0; i < result.length(); i++) {
			System.out.println(result.charAt(i));
		}*/
				//Xss
				System.out.println("Stack Size-"+System.getProperty("Xss"));
	}

}
