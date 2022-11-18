package CollectionFrameWork.ArrayDeque;
import java.util.*;
public class MainClass {
    public static void main(String[] args) {
        ArrayDeque<Integer> q = new ArrayDeque<>();
        for(int i = 0; i < 10; i++) {
            q.addLast(i);
            q.addFirst(i);
        }

        System.out.println(q);
        q.pop();

        System.out.println("First : " + q.peekFirst());
        System.out.println("Last : " +q.peekLast());
        System.out.println(q);
        q.push(0);
        System.out.println("First : " + q.peekFirst());
        System.out.println("Last : " +q.peekLast());
        System.out.println(q);
    }
}
