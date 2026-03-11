import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        queue.add(30);
        queue.add(10);
        queue.add(20);
        //Internally the queue organizes them like a min-heap, so the smallest value is always at the front.
        System.out.println("Queue: " + queue);

        System.out.println("Removed element: " + queue.poll());

        System.out.println("Queue after removal: " + queue);
    }
}