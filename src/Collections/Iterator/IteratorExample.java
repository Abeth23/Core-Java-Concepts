import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("John");
        names.add("Mary");
        names.add("David");

        Iterator<String> it = names.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}