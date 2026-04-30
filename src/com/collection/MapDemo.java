package com.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {
        // HashMap — key-value, no order
        Map<String, Integer> map = new HashMap<>();
        map.put("Alice", 90);
        map.put("Bob", 85);
        map.put("Charlie", 92);
        map.put("Alice", 95); // updates existing key

        System.out.println("Map: " + map);
        System.out.println("Get Bob: " + map.get("Bob"));
        System.out.println("Contains key 'Alice': " + map.containsKey("Alice"));

        // Iterate over entries
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }

        // getOrDefault, putIfAbsent
        System.out.println(map.getOrDefault("Dave", 0));
        map.putIfAbsent("Dave", 88);

        // TreeMap — sorted by key
        Map<String, Integer> treeMap = new TreeMap<>(map);
        System.out.println("TreeMap (sorted): " + treeMap);

        // Frequency count using HashMap
        String[] words = {"java", "python", "java", "c++", "python", "java"};
        Map<String, Integer> freq = new HashMap<>();
        for (String w : words) {
            freq.merge(w, 1, Integer::sum); // elegant frequency counting
        }
        System.out.println("Frequency: " + freq);
    }
}
