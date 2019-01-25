package learning;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FriendExpenseSharing
{

    public static void main(String[] args)
    {
        Map<String, Double> expenses = new HashMap<>();
        expenses.put("A", 10D);
        expenses.put("B", 10D);
        expenses.put("C", 20D);
        // expenses.put("D", 10D);

        calculateShare(expenses);
    }

    private static void calculateShare(Map<String, Double> expenses)
    {
        Double total = expenses.entrySet().stream().collect(Collectors.summingDouble(n -> {
            return ((Map.Entry<String, Double>) n).getValue();
        }));

        Double share = total / expenses.size();

        Map<String, Double> shared = new HashMap<>();

        expenses.entrySet().forEach((e) -> {
            shared.put(e.getKey(), share - e.getValue());

            System.out.println(e.getKey() + " : " + (share - e.getValue()));
        });

    }

}
