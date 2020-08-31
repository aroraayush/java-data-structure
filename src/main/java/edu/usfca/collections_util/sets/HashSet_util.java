package edu.usfca.collections_util.sets;

import static java.lang.System.out;
import java.util.HashSet;

public class HashSet_util {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(2);
        out.println(set);
        out.println("Length = "+set.size());

        out.println("\n======== Check if set empty (isEmpty()) ========");
        out.println(set);
        out.println("set.isEmpty() : "+set.isEmpty());

        out.println("\n======== Clearing set clear() ========");
        set.clear();
        out.println(set);
        out.println("set.isEmpty() : "+set.isEmpty());

    }
}