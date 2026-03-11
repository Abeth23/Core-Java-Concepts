package Collections.TreeMap;

import java.util.TreeMap;

//Stores key-value pairs in sorted order of keys.
public class TreeMapExample {
    public static void main(String[] args) {
        //Used when you want to maintain a sorted collection of key-value pairs.
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("apple", 4);
        map.put("banana", 5);
        map.put("kiwi", 2);
        System.out.println("Sorted treemap: " + map);
        //It sorts based on the natural ordering of keys (alphabetical for strings, numerical for numbers).
    }

}
