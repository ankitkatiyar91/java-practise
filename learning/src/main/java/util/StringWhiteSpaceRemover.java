package util;

public class StringWhiteSpaceRemover {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s="Tata Power Trading Company Limited";
		s.replaceAll("\\s", " AND ");
		System.out.println(s);

	}

}
