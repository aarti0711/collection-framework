package com.collection;
import java.util.*;

public  class LinkedListDemo {
            public static void main(String[] args) {
                LinkedList<Integer> ll = new LinkedList<>();

                ll.add(10);
                ll.add(20);
                ll.add(30);
                ll.addFirst(5);   // add at beginning
                ll.addLast(40);   // add at end

                System.out.println("List: " + ll);
                System.out.println("First: " + ll.getFirst());
                System.out.println("Last: " + ll.getLast());

                // Used as a Stack
                ll.push(0);          // push to front
                System.out.println("After push: " + ll);
                System.out.println("Pop: " + ll.pop());

                // Used as a Queue
                ll.offer(99);        // enqueue
                System.out.println("Poll: " + ll.poll()); // dequeue
            }
}

