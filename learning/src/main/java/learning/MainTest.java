package learning;

public class MainTest {

	public static void main(String[] args) {

		System.out.println(new Drived().x);

		int result=120;
		System.out.printf("%d %d %d",result,result++,++result);
		String s = "from SeatAllocation allocation " + "where allocation.baseActivationKey = :baseActivationKey "
				+ "and (allocation.seat.endpoint.endpointMemo = :endpointMemo or "
				+ "(allocation.seat.endpoint.endpointMemo is null and "
				+ "allocation.seat.endpoint.fingerprint = :fingerprint)) "
				+ "and (allocation.state IS NULL OR allocation.state = 1) "
				+ "order by allocation.lastLicenseIssueDate desc";
		System.out.println("Query- " + s);

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
