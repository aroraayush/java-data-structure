package edu.usfca.collections_util.maps.unordered;

import java.util.Arrays;
import java.util.HashMap;
import java.util.SortedMap;

import static java.lang.System.out;

/** Simple example of using a hash map to store word frequencies */
public class HashMaps {
    public static void main(String[] args) {
        
        HashMap<String, Integer> counter = new HashMap<String, Integer>();
        
        out.println("===== Counter in Java (putIfAbsent_0,merge_1_Integer::sum) =====");

        String[] words = { "cat", "dog", "cat", "bird", "elephant", "monkey", "dog", "bull" };
        for(String key: words){
            counter.putIfAbsent(key, 0);
            counter.merge(key, 1, Integer::sum);
        }
        out.println(counter);

        out.println("===== Converting Map to Arrray =====");

        Object[] arr = counter.entrySet().toArray();
        out.println(Arrays.toString(arr));
    }
}
