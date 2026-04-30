package com.collection;

import java.util.*;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();

        // As a Stack (LIFO) — prefer over Stack class
        deque.push("First");
        deque.push("Second");
        deque.push("Third");
        System.out.println("Stack peek: " + deque.peek());
        System.out.println("Stack pop: " + deque.pop());

        // As a Queue (FIFO)
        deque.clear();
        deque.offer("A");
        deque.offer("B");
        deque.offer("C");
        System.out.println("Queue poll: " + deque.poll()); // A
        System.out.println("Queue peek: " + deque.peek()); // B

        // As a Deque — add/remove from both ends
        deque.offerFirst("Z");
        deque.offerLast("D");
        System.out.println("Deque: " + deque); // [Z, B, C, D]
    }
}
