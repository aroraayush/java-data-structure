package edu.usfca.collections_util.other;

import static java.lang.System.out;

// DequeArray (Deque) is faster than Stack class

import java.util.Stack;

public class Stack_util {
    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();
        s.push(1);
        out.println("s" + s);
    }
}