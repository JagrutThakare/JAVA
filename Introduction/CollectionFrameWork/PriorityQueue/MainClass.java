package CollectionFrameWork.PriorityQueue;

import java.util.PriorityQueue;

public class MainClass {
    public static void main(String[] args) {
        
        PriorityQueue<String> q = new PriorityQueue<>();

        q.add("Kiwi");
        q.add("Apple");
        q.add("Mango");
        q.add("Banana");

        System.out.println(q);
        
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());

    }
}
