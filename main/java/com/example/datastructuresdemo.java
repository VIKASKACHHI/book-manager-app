package main.java.com.example;

import java.util.*;

public class datastructuresdemo {

    public static void main(String[] args) {
        // Array example
        int[] array = {5, 3, 8, 1};
        System.out.println("Original Array: " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Sorted Array: " + Arrays.toString(array));

        // String example
        String input = "hello";
        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println("Reversed String: " + reversed);

        // List example
        List<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "cherry"));
        list.add("date");
        System.out.println("List: " + list);

        // Queue example
        Queue<String> queue = new LinkedList<>(list);
        queue.offer("elderberry");
        System.out.println("Queue: " + queue);

        // Map example
        Map<String, Integer> map = new HashMap<>();
        map.put("key1", 1);
        map.put("key2", 2);
        System.out.println("Map: " + map);

        // Set example
        Set<String> set = new HashSet<>(list);
        set.add("fig");
        System.out.println("Set: " + set);
    }
}
