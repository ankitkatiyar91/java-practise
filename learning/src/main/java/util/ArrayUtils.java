package util;

public class ArrayUtils {

    public static String printArray(int[][] inputData)
    {
        StringBuilder out=new StringBuilder("\n");
        for (int[] is : inputData)
        {
            for (int j : is)
            {
                out.append(j + ",");
            }
            out.deleteCharAt(out.length()-1);
            out.append(String.format("%-*s\n",is.length));
//            out.append("\n");
        }
        return out.toString();
    }

    public static String printArray(int[] inputData) {
        StringBuilder out = new StringBuilder("\n");
        for (int j : inputData) {
            out.append(j + ",");
        }
        out.deleteCharAt(out.length() - 1);
//        out.append(String.format("%-*s\n", inputData.length));
        return out.toString();
    }
}
