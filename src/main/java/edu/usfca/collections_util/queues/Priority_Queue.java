package edu.usfca.collections_util.queues;

// head of this queue is the least element with respect to the specified ordering

// Java Priority Queue
// An unbounded priority queue based on a priority heap
// A priority queue does not permit null elements

// - The elements of the priority queue are ordered according to their
//  natural ordering, or by a Comparator provided at queue construction time,
//  depending on which constructor is used
// - We can’t create PriorityQueue of Objects that are non-comparable
// - Ties are broken arbitrarily.

// mainly 4 operations
// 1. Insert - boolean add(element)
// 2. Maximum/Minimum - peek() => fetchs the head element
// 3. Extract Maximum/Minimum => poll() retreives and removes elements
// 4. Increase/Decrease Key

// Queue retrieval operations access the element at the head of the queue.
// 1. poll
// 2. remove
// 3. peek
// 4. element
// 5. clear()
// offer()

// Possible Constructors:
// PriorityQueue() - default initial capacity (11)

import java.util.PriorityQueue;
import static java.lang.System.out;

public class Priority_Queue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(20);
        pq.add(15);
        pq.add(25);
        pq.add(18);
        out.println("Priority Queue : "+ pq);

        out.println("==========  Printing the head - peek() ==========");
        out.println("Head : "+pq.peek());
        out.println(pq);

        out.println("==========  Fetching and Extracting the head - poll() ==========");
        out.println("Before :"+pq);
        out.println("Head : "+pq.poll());
        out.println("After :"+pq);

        out.println("==========  Removing specific element - remove(e) ==========");
        out.println("Before :"+pq);
        pq.remove(25); 
        out.println("After removing 25 :"+pq);

        out.println("==========  foreach in PQ ==========");
        for(Integer i : pq){
            out.print(i + " ");
        }
        out.println();
        out.println("After removing 25 :"+pq);

        out.println("==========  Converting to Array ==========");
        Object[] arr = pq.toArray();
        out.print("arr : ");
        for(Object i : arr){
            out.print(i + " ");
        }
        out.println();

    }
}
