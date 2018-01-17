package codejam;

import java.util.Scanner;

public class TechGig
{

    public static void main(String[] args)
    {

        try
        {
            // String input = "0800161234567891234567000898169876543215678945";
            StringBuffer outputMessage;
            String input = new Scanner(System.in).nextLine();
            outputMessage = new StringBuffer("@");
            outputMessage.append(input.substring(0, 4));
            input = input.substring(4);
            int panLength = Integer.parseInt(input.substring(0, 2));
            input = input.substring(2);
            outputMessage.append(":@Card No: " + input.substring(0, panLength) + "@/Card No:");
            input = input.substring(panLength);
            outputMessage.append("@Audit No:" + input.substring(0, 6) + "@/Audit No:");
            input = input.substring(6);
            int trackLength = Integer.parseInt(input.substring(0, 2));
            input = input.substring(2);
            outputMessage.append("@Track2Data:" + input.substring(0, trackLength) + "@/Track2Data:");
            System.out.println(outputMessage);
        }
        catch (Exception e)
        {
            System.out.println("Invalid input data");
        }

    }

}
