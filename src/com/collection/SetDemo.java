package com.collection;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
        // HashSet — no order, no duplicates
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Mango");
        hashSet.add("Apple");
        hashSet.add("Apple"); // duplicate ignored
        System.out.println("HashSet: " + hashSet);

        // LinkedHashSet — insertion order preserved
        Set<String> linked = new LinkedHashSet<>();
        linked.add("Mango");
        linked.add("Apple");
        linked.add("Banana");
        System.out.println("LinkedHashSet: " + linked);

        // TreeSet — sorted order
        Set<String> tree = new TreeSet<>();
        tree.add("Mango");
        tree.add("Apple");
        tree.add("Banana");
        System.out.println("TreeSet: " + tree);

        // Set operations
        Set<Integer> a = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        Set<Integer> b = new HashSet<>(Arrays.asList(3, 4, 5, 6));

        Set<Integer> union = new HashSet<>(a);
        union.addAll(b);
        System.out.println("Union: " + union);

        Set<Integer> intersect = new HashSet<>(a);
        intersect.retainAll(b);
        System.out.println("Intersection: " + intersect);
    }
}