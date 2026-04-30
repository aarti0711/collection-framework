package com.collection;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(30);
        pq.offer(20);
        pq.offer(10);
        System.out.println("Min-heap order: ");
        while (!pq.isEmpty()){
            System.out.print(pq.poll() + " "); // 10 20 30

        }

        PriorityQueue<Integer> maxPQ = new PriorityQueue<>();
        maxPQ.offer(30);
        maxPQ.offer(20);
        maxPQ.offer(10);

        System.out.print("\nMax-heap order: ");
        while (!maxPQ.isEmpty()) {
            System.out.print(maxPQ.poll() + " "); // 30 20 10
        }

        // Priority Queue of custom objects
        PriorityQueue<int[]> taskQueue = new PriorityQueue<>((a, b) -> a[1] - b[1]); // sort by priority
        taskQueue.offer(new int[]{1, 5}); // task 1, priority 5
        taskQueue.offer(new int[]{2, 1}); // task 2, priority 1 (highest)
        taskQueue.offer(new int[]{3, 3}); // task 3, priority 3

        System.out.println("\nTasks by priority:");
        while (!taskQueue.isEmpty()) {
            int[] t = taskQueue.poll();
            System.out.println("Task " + t[0] + " (priority " + t[1] + ")");
        }
    }
}

