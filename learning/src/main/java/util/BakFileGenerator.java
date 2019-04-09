package util;

import java.io.File;
import java.io.IOException;

public class BakFileGenerator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			String dir="C:\\Users\\ipg\\Desktop\\files\\ui\\new";
			File directory=new File(dir);
			
			File files[]=directory.listFiles();
			File bakFile;
			File file ;
			for (int i = 0; i < files.length; i++) {
				file = files[i];
				if (!file.isDirectory() && file.getName().endsWith(".xlsx")) {
					bakFile = new File(dir + "\\" + file.getName().substring(0, file.getName().lastIndexOf(".")) + ".bak");
					bakFile.createNewFile();
					System.out.println(file.getName() + "   " + dir + "\\" + file.getName().substring(0, file.getName().lastIndexOf(".")) + ".bak");
				}
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
