import java.util.*;
public class MainClass {
    public static void main(String[] args) {
        
        Set<String> fruits = new HashSet<String>();

        System.out.println(fruits.add("Apple")); // add function returns boolean value if value is not present
        System.out.println(fruits.add("Banana"));
        System.out.println(fruits.add("Banana")); // returns false.
        System.out.println(fruits.add("Kiwi"));

        System.out.println(fruits);
        System.out.println();


        Set<Integer> x = new HashSet<Integer>();
        Set<Integer> y = new HashSet<Integer>();

        x.add(3);
        x.add(4);
        x.add(5);
        x.add(6);
        x.add(7);

        y.add(3);
        y.add(55);
        y.add(52);
        y.add(61);
        y.add(7);
        

        // x.addAll(y); // (X U Y)

        x.retainAll(y); // (X (Intersection) Y)

        System.out.println(x);
        
        System.out.println(x.containsAll(y)); // y subset x
        
    }
}