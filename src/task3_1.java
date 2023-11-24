///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
package lab3;

/**
 *
 * @author Abdul Rehman
*/
//import java.util.ArrayList;
//import java.util.Iterator;
//public class task3_1 {
//    public static void main(String[] args) {
//        // Create an ArrayList
//        ArrayList<String> arrayList = new ArrayList<>();
//
//        // Add elements to the ArrayList
//        arrayList.add("Apple");
//        arrayList.add("Banana");
//        arrayList.add("Cherry");
//        arrayList.add("Date");
//
//        // Print the ArrayList
//        System.out.println("ArrayList elements:");
//        iterateAndPrint(arrayList);
//
//        // Remove an element from a specific index
//        int indexToRemove = 2; // Removing "Cherry" from index 2
//        if (indexToRemove >= 0 && indexToRemove < arrayList.size()) {
//            arrayList.remove(indexToRemove);
//            System.out.println("\nAfter removing element at index " + indexToRemove + ":");
//            iterateAndPrint(arrayList);
//        } else {
//            System.out.println("\nInvalid index for removal.");
//        }
//
//        // Check if an element exists in the ArrayList
//        String elementToCheck = "Banana";
//        boolean containsElement = arrayList.contains(elementToCheck);
//        System.out.println("\nDoes the ArrayList contain '" + elementToCheck + "': " + containsElement);
//
//        // Retrieve the size of the ArrayList
//        int size = arrayList.size();
//        System.out.println("\nSize of the ArrayList: " + size);
//    }
//
//    // Helper method to iterate through and print elements of an ArrayList
//    public static void iterateAndPrint(ArrayList<String> arrayList) {
//        Iterator<String> iterator = arrayList.iterator();
//        while (iterator.hasNext()) {
//            String element = iterator.next();
//            System.out.println(element);
//        }
//    }
//}


//import java.util.HashMap;
//import java.util.Map;
//import java.util.Iterator;
//
//public class task3_1 {
//    public static void main(String[] args) {
//        // Create a HashMap with keys and values of type String
//        HashMap<String, String> hashMap = new HashMap<>();
//
//        // Add key-value pairs to the HashMap
//        hashMap.put("John", "Doe");
//        hashMap.put("Alice", "Smith");
//        hashMap.put("Bob", "Johnson");
//        hashMap.put("Eve", "Williams");
//
//        // Retrieve the value associated with a specific key
//        String keyToRetrieve = "Bob";
//        if (hashMap.containsKey(keyToRetrieve)) {
//            String value = hashMap.get(keyToRetrieve);
//            System.out.println(keyToRetrieve + " -> " + value);
//        } else {
//            System.out.println(keyToRetrieve + " not found in the HashMap.");
//        }
//
//        // Check if a key exists in the HashMap
//        String keyToCheck = "Alice";
//        boolean keyExists = hashMap.containsKey(keyToCheck);
//        System.out.println("Does the HashMap contain key '" + keyToCheck + "': " + keyExists);
//
//        // Iterate through the HashMap and print its key-value pairs
//        System.out.println("\nHashMap key-value pairs:");
//        iterateAndPrint(hashMap);
//    }
//
//    // Helper method to iterate through and print key-value pairs of a HashMap
//    public static void iterateAndPrint(HashMap<String, String> hashMap) {
//        Iterator<Map.Entry<String, String>> iterator = hashMap.entrySet().iterator();
//        while (iterator.hasNext()) {
//            Map.Entry<String, String> entry = iterator.next();
//            String key = entry.getKey();
//            String value = entry.getValue();
//            System.out.println(key + " -> " + value);
//        }
//    }
//}

//import java.util.LinkedList;
//
//public class task3_1 {
//    public static void main(String[] args) {
//        LinkedList<Integer> linkedList = new LinkedList<>();
//
//        // Add elements to the beginning and end of the list
//        linkedList.addFirst(3);
//        linkedList.addFirst(5);
//        linkedList.addLast(7);
//        linkedList.addLast(9);
//
//        // Print the initial list
//        System.out.println("Initial linked list: " + linkedList);
//
//        // Search for a specific value
//        int valueToSearch = 7;
//        boolean found = linkedList.contains(valueToSearch);
//        System.out.println("Search for " + valueToSearch + ": " + found);
//
//        // Delete a node with a specific value
//        int valueToDelete = 5;
//        linkedList.remove(Integer.valueOf(valueToDelete));
//        System.out.println("After deleting " + valueToDelete + ": " + linkedList);
//    }
//}

//import java.util.Stack;
//public class task3_1 {
//    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//
//        // Push elements onto the stack
//        stack.push(5);
//        stack.push(10);
//        stack.push(15);
//
//        // Peek at the top element
//        System.out.println("Top element (peek): " + stack.peek());
//
//        // Pop elements from the stack
//        System.out.println("Popped element: " + stack.pop());
//        System.out.println("Popped element: " + stack.pop());
//
//        // Check if the stack is empty
//        System.out.println("Is the stack empty? " + stack.isEmpty());
//
//        // Get the size of the stack
//        System.out.println("Stack size: " + stack.size());
//    }
//}
//import java.util.LinkedList;
//import java.util.Queue;
//
//public class task3_1 {
//    public static void main(String[] args) {
//        Queue<Integer> queue = new LinkedList<>();
//
//        // Enqueue elements to the queue
//        queue.offer(5);
//        queue.offer(10);
//        queue.offer(15);
//
//        // Dequeue elements from the queue
//        System.out.println("Dequeued element: " + queue.poll());
//        System.out.println("Dequeued element: " + queue.poll());
//
//        // Check if the queue is empty
//        System.out.println("Is the queue empty? " + queue.isEmpty());
//
//        // Get the size of the queue
//        System.out.println("Queue size: " + queue.size());
//    }
//}


import java.util.ArrayList;
import java.util.Collections;

public class task3_1 {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add elements to the ArrayList
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(6);

        // Print the ArrayList before sorting
        System.out.println("Before sorting: " + numbers);

        // Sort the ArrayList in ascending order
        Collections.sort(numbers);

        // Print the ArrayList after sorting
        System.out.println("After sorting in ascending order: " + numbers);
    }
}


