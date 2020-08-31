package edu.usfca.collections_util.maps.ordered;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

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

public class LinkedHashMaps {
    public static void main(String[] args) {

        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("c",3);
        map.put("b",2);
        map.put("a",1);
        
        out.println(map);

        out.println("===== Converting Map to Arrray =====");
        Object[] arr = map.entrySet().toArray();
        out.println(Arrays.toString(arr));

        out.println("===== Converting LinkedHashMap to TreeMap =====");
        Map<String,Integer> treeMap = new TreeMap<>();
        treeMap.putAll(map);
        out.println(treeMap);

    }
}