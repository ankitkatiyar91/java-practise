package collection;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetTes {

    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("K");
        set.add("A");
        set.add("J");
        set.add("A");
        System.out.println("Linked Set: " + set);

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("K");
        hashSet.add("A");
        hashSet.add("J");
        hashSet.add("A");
        System.out.println("Hash Set: " + hashSet);
    }
}
