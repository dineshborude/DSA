package collections;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        // Adding key-value pairs to the map
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        // Accessing values by keys
        System.out.println("Key 1: " + map.get(1));
        System.out.println("Key 2: " + map.get(2));

        // Iterating over key-value pairs
        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
    }
}
