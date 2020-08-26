// A linear data structure where the elements are not stored in
// contiguous (touching) locations and every element is a separate
// object with a data part and address part.

// - Each element is known as a node.
// - We don’t have to specify size in advance, the more elements we 
//      add to the chain, the bigger the chain gets.
// - Due to the dynamicity and ease of insertions and deletions, they 
//      are preferred over the arrays.

// 1. boolean add(Object o)
// 2. void add(int index, Object element) : If in case the index specified is out of
//                                          range it throws an IndexOutOfBounds Exception
// 3. boolean addAll(Collection c)
// 4. boolean addAll(int index, Collection c)
// 5. void addFirst(Object o)
// 6. void addLast(Object o)
// 7. void clear()
// 8. Object clone()
package edu.usfca.collections_util;

import static java.lang.System.out;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedLists {
    
    private static boolean returnResult;
    public static void main(String[] args) {
        
        LinkedList<String> ll = new LinkedList<String>();

        ll.add("String1");

        // returnResult : true
        returnResult = ll.add("String2");

        // Adding at index
        // add(int index, Object element)
        ll.add(2,"String3");

        // IndexOutOfBoundsException : Index doesn't exist
        // ll.add(4,"String3");

        // Printing LinkedList
        out.println(    Arrays.toString(    ll.toArray()    )   );

        out.println("Hello world");
    }
    
}