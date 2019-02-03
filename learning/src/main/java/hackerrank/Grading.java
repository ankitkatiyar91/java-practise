package hackerrank;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Grading {

	/*
	 * Complete the gradingStudents function below.
	 */
	static int[] gradingStudents(int[] grades) {
		int[] newGrades = new int[grades.length];
		for (int i = 0; i < grades.length; i++) {
			if (grades[i] >= 38 && (grades[i] % 5 > 2)) {
				newGrades[i] = grades[i] + (5 - grades[i] % 5);
			} else {
				newGrades[i] = grades[i];
			}

		}
		return newGrades;
	}

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		for (int el : gradingStudents(new int[] { 73, 67, 38, 33 })) {
			System.out.println(el);
		}
	}
}
