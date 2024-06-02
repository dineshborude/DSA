package collections;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedList_Queue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // Adding elements to the queue
        queue.add("First");
        queue.add("Second");
        queue.add("Third");

        // Removing elements from the queue
        System.out.println("Removed: " + queue.poll());
        System.out.println("Removed: " + queue.poll());

        // Iterating over elements
        for (String element : queue) {
            System.out.println(element);
        }
    }
}
