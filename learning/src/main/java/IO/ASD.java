package IO;

import java.io.*;

class ASD {
	public static void main(String ar[]) {
		try {
			File f = new File("d:\\batchesinfo\\totalincome.txt");
			BufferedReader f1 = new BufferedReader(new FileReader(f));
			String a;
			while (true) {
				a = f1.readLine();
				if (a == null)
					break;
				System.out.println(a);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}