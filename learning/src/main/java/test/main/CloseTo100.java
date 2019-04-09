package com.test.main;

public class CloseTo100 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(closeTo100(50, 90));
		System.out.println(closeTo100(-50, -90));
	}

	public static int closeTo100(int first, int second) {
		int diff1 = Math.abs(100 - first);
		int diff2 = Math.abs(100 - second);
		System.out.println(diff1 + " " + diff2);
		if (diff1 < diff2)
			return first;
		else if (diff2 < diff1)
			return second;
		else
			return first;
	}

}
