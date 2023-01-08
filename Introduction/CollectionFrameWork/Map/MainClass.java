package CollectionFrameWork.Map;

import java.util.*;

public class MainClass {
    public static void main(String[] args) {
        Map<String, Integer> num = new HashMap<>();
        num.put("one",1);
        num.put("two",2);
        num.put("three",3);
        num.putIfAbsent("one", 10);
        
        System.out.println(num.get("three"));
        System.out.println(num.containsKey("one"));
        System.out.println(num.containsValue(3));

        num.remove("one");
        System.out.println(num);

        System.out.println(num.keySet());
        System.out.println(num.values());
        System.out.println(num.entrySet());

        // Set<Entry<String, Integer>> entries = num.entrySet();
        
        // for(Entry<String, Integer> entry : entries) {
        //     entry.setValue(entry.getValue()*100);
        // }
        // System.out.println(num);

        for(Map.Entry<String, Integer> entry : num.entrySet()) System.out.println(entry.getKey() + "=" + entry.getValue());
        
        
    }
}
