package edu.usfca.collections_util.maps.ordered;

import java.util.Arrays;
import java.util.LinkedHashMap;
import static java.lang.System.out;

// Hash table and linked list implementation of the Map interface, with predictable iteration order
// it maintains a doubly-linked list running through all of its entries

/*

Double LinkedList/HashMap Key
       key1    :     Value1
        /\
        ||
        \/   
       key2    :     Value2
        /\
        ||
        \/   
       key3    :     Value3
        /\
        ||
        \/   
       key4    :     Value4

*/

public class SortedMaps {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("a",1);
        map.put("b",2);
        map.put("c",3);
        out.println(map);

        out.println("===== Converting Map to Arrray =====");
        Object[] arr = map.entrySet().toArray();
        out.println(Arrays.toString(arr));
    }
}