package learning;

public class MainTest
{

    public static void main(String[] args)
    {
        String s = "from SeatAllocation allocation " +
                "where allocation.baseActivationKey = :baseActivationKey " +
                "and (allocation.seat.endpoint.endpointMemo = :endpointMemo or " +
                "(allocation.seat.endpoint.endpointMemo is null and " +
                "allocation.seat.endpoint.fingerprint = :fingerprint)) " +
                "and (allocation.state IS NULL OR allocation.state = 1) " +
                "order by allocation.lastLicenseIssueDate desc";
        System.out.println("Query- "+s);

    }

    private static void test()
    {
        final String PGA_PROD_LINE_GROUP = "";
        System.out.println(PGA_PROD_LINE_GROUP);

    }

}
