package datastructure;

import java.util.Hashtable;

public class HashTableTest {
    public static void main(String[] args) {
        Hashtable<String,String> table = new Hashtable<>();
        table.put("A","Ankit");
        table.put("B","Bro");
        table.put("C","Competition");

        System.out.println(table);
    }
}
