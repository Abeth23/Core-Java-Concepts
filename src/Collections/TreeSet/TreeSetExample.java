package Collections.TreeSet;

import java.util.TreeSet;

//Stores unique elements in sorted order.


public class TreeSetExample {
    public static void main(String[] args) {
        //Used when you want to maintain a sorted collection of unique elements.

        TreeSet<String> tree =new TreeSet<>();
        tree.add("11");
        tree.add("34");
        tree.add("33");

        //it sorts based on the natural ordering of elements (alphabetical for strings, numerical for numbers).

        System.out.println("Sorted treeset" + tree);
}
}
