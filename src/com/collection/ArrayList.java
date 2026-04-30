package com.collection;

import java.util.Collections;
import java.util.List;

public class ArrayList {

    public static void main(String[] args) {
        List<String> list = new java.util.ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        System.out.println("List: " + list);
        System.out.println("Size: " + list.size());
        System.out.println("Get index 2: " + list.get(2));

        // Remove
        list.remove("Banana");
        list.removeFirst(); // by index

        // Iterate
        for (String fruit : list) {
            System.out.println(fruit);
        }

        // Sort
        Collections.sort(list);
        System.out.println("Sorted: " + list);

        // Contains & indexOf
        System.out.println("Contains Cherry: " + list.contains("Cherry"));
    }


}
