package test;

import java.io.File;
import java.util.Scanner;

public class ProgrammingLanguageTest {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Path for source file-");
		String path=scanner.nextLine();
		File file=new File(path);
		if(!file.exists()){
			System.err.println("No file found "+file.getAbsolutePath());
			return;
		}
		System.out.println("Scanning-"+file.getAbsolutePath());
		
	}
}
