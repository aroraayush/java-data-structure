package edu.usfca.collections_util.maps.unordered;

import java.util.HashMap;
import static java.lang.System.out;

public class Counter {
    public static void main(String[] args) {
        HashMap<String, Integer> counter = new HashMap<String, Integer>();
        
        String[] words = { "cat", "dog", "cat", "bird", "elephant", "monkey", "dog", "bull" };
        for(String key: words){
            counter.putIfAbsent(key, 0);
            counter.merge(key, 1, Integer::sum);
        }
        out.println(counter);
    }
}