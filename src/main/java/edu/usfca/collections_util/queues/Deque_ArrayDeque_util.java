package edu.usfca.collections_util.queues;

// enqueue and dequeue at both ends
// Can be used as Stack (insertion, removal from start) - Faster than Stack class
//                Queue (add at end, take from start)   - Faster than LinkedList class for Queue

// Interface Deque<E>
// E - the type of elements held in this collection
// SuperInterfaces: Collection<E>, Iterable<E>, Queue<E>
// Supports for capacity-restriction and no fixed size limit

// Class ArrayDeque<E>
// Resizable-array implementation of the Deque interface
// no capacity restrictions
// not thread-safe without synchronization
// Null elements are prohibited
// Operations run in amortized constant time

/*
Deque methods
--------------------------------------------------------------------------------------
        | 			First Element (Head)       |          Last Element (Tail)        |
--------------------------------------------------------------------------------------
        | Throws exception     | Special value | Throws exception    | Special value |
        ------------------------------------------------------------------------------
Insert  | addFirst(e)          | offerFirst(e) | addLast(e)          | offerLast(e)  |
Remove  | removeFirst()        | pollFirst()   | removeLast()        | pollLast()    |
Examine | getFirst()           | peekFirst()   | getLast()           | peekLast()    |
--------------------------------------------------------------------------------------
*/

// Size:
// deque.size()

import java.util.Deque;
import java.util.HashSet;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.System.out;

public class Deque_ArrayDeque_util {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("a");
        deque.addLast("b");
        deque.addLast("c");
        deque.addLast("b");
        out.println(deque);
        out.println(deque.size());

        out.println("\n======= Deque to ArrayList =======");
        ArrayList<String> arr2 = new ArrayList<>();
        arr2.addAll(deque);
        out.println("Deque to ArrayList : " + arr2);

        out.println("\n======= Deque to HashSet =======");
        HashSet<String> set = new HashSet<>();
        set.addAll(deque);
        out.println("Deque to HashSet : " + set);
        
        
    }
}