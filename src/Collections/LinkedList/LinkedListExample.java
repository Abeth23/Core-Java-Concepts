package Collections.LinkedList;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        //Used when frequent insertions and deletions happen.


        //Unique elements, ordered, allows duplicates, allows null values, not synchronized, dynamic size
        LinkedList<String> list = new LinkedList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Apple");

        System.out.println("Fruits: " + list);
    }
}