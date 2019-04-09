package learning;

import java.util.concurrent.atomic.AtomicInteger;

public class MainTest {

	public static void main(String[] args) {

		System.out.println(new Drived().x);
		int result = 120;
		System.out.printf("%d %d %d", result, result++, ++result);
		String s = "from SeatAllocation allocation " + "where allocation.baseActivationKey = :baseActivationKey "
				+ "and (allocation.seat.endpoint.endpointMemo = :endpointMemo or "
				+ "(allocation.seat.endpoint.endpointMemo is null and "
				+ "allocation.seat.endpoint.fingerprint = :fingerprint)) "
				+ "and (allocation.state IS NULL OR allocation.state = 1) "
				+ "order by allocation.lastLicenseIssueDate desc";
		System.out.println("Query- " + s);

	}

	public static int fact(int n) {
		if (n <= 1) {
			// if a number is 1 or less than on then factorial will be 1
			return 1;
		} 
		else {
			/*this part will execute only of number is greater than 1, ex 2,3
			 * According to factorial logic, factorial of a number n will be (n * factorial of (n-1))
			 * Ex: factorial of 2 = 2*1
			 *  factorial of 3 = 3*2*1
			 *  factorial of 4 = 4*3*2*1
			*/
			return n * fact(n - 1);
		}
	}

	private static void test() {
		final String PGA_PROD_LINE_GROUP = "";
		System.out.println(PGA_PROD_LINE_GROUP);

	}

	static class Base {
		static int x = 100;
		static {
			System.out.println("Base staic");
			x = ++x + --x;
		}
	}

	static class Drived extends Base {

		static {
			System.out.println("Drived stATIC");
			x = x-- + --x;
		}
		{
			System.out.println("Drived init");

			x = x++ - ++x;
		}
	}

}
