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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;

public class LinkedLists {
    
    private static boolean returnResult;
    public static void main(String[] args) {
        
        LinkedList<Integer> ll = new LinkedList<Integer>();

        ll.add(1);

        // returnResult : true
        returnResult = ll.add(2);

        // Adding at index
        // add(int index, Object element)
        ll.add(2,3);

        // IndexOutOfBoundsException : Index 4 doesn't exist
        // ll.add(4,7);
        
        out.println("\n====== Converting LinkedList to Array ======");
        Integer[] arrList = ll.toArray(new Integer[ ll.size() ]);
        out.println("arrList:\t" +   Arrays.toString( arrList ) );

        out.println("\n====== Printing LinkedList ======");

        out.println(    Arrays.toString( ll.toArray() ) );

        out.println("\n====== addAll(Collection c) ======");
        Collection collection = new ArrayList();
        collection.add(8);
        collection.add(9);
        ll.addAll(collection);
        out.println( Arrays.toString (ll.toArray() ));
        out.println(    Arrays.toString( ll.toArray() ) );


        out.println("\n======  addAll(int index, Collection c) ======");
        Collection collection2 = new ArrayList();
        collection2.add(10);
        collection2.add(11);
        ll.addAll(2,collection2);
        out.println( Arrays.toString (ll.toArray() ));


        out.println("\n======  addFirst(Object o) ======");
        ll.addFirst(15);
        out.println( Arrays.toString (ll.toArray() ));


        out.println("\n======  addLast(Object o) ======");
        ll.addLast(0);
        out.println( Arrays.toString (ll.toArray() ));
        out.println( Arrays.toString (ll.toArray() ));


        out.println("\n======  clear() ======");
        ll.clear();
        out.println( Arrays.toString (ll.toArray() ));
    }
    
}