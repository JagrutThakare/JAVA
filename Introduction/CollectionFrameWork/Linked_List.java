package CollectionFrameWork;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class Linked_List {
    public static void main(String[] args) {
        List<Integer> ll = new LinkedList<>();
        List<Integer> al = new ArrayList<>();

        getTimeDiff(ll);
        getTimeDiff(al);

    }
    static void getTimeDiff(List<Integer> list) {
        long start = System.currentTimeMillis();

        for(int i = 0; i < 10e4; i++) {
            list.add(0,i);
        }

        long end = System.currentTimeMillis();
        System.out.println(list.getClass().getName()+ " -->" + (end-start));
    }
}
