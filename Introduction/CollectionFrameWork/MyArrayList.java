package CollectionFrameWork;
import java.util.ArrayList;
import java.util.List;
// These are resizable arrays.
// dynamic arrays
// The thing in the angular brackets is the type of list you want to Create.
// If its not defined then you can store multiple datatypes

public class MyArrayList {
    public static void main(String[] args) {
        
        Pair<Integer, String> p1 = new Pair<Integer,String>(12, "Jagrut");
        Pair<Boolean, String> p2 = new Pair<Boolean,String>(true, "Hello");
        p1.getDescription();
        p2.getDescription();

        ArrayList <String> fruits = new ArrayList<>();

        fruits.add("APPLE");
        fruits.add("Orange");
        fruits.add("Avocado");
        System.out.println(fruits);

        List<String> fal = new ArrayList<>(); // Since List is interface implemented by many list class we can use its reference variable Later it can be useful incase we have to change type of list

        fal.add("Peach");
        fal.addAll(fruits);

        System.out.println(fal);
        System.out.println(fal.get(1));

        fal.set(1, "Banana");
        System.out.println(fal);

        fruits.remove(2);
        System.out.println(fruits);

        fruits.clear();
        System.out.println(fruits);

        fruits.add("APPLE");
        fruits.add("Orange");
        fruits.add("Avocado");

        List <String> toRemove = new ArrayList<>();
        toRemove.add("APPLE");
        toRemove.add("Orange");
        toRemove.add("a");

        fruits.removeAll(toRemove);
        System.out.println(fruits);

        System.out.println(fruits.size());

        fruits.add("APPLE");
        fruits.add("Orange");
        fruits.add("Avocado");
        System.out.println(fruits.contains("Apple"));

        String temp[] = new String[fruits.size()];

        fruits.toArray(temp);
        
        for(String e: temp)
        {
            System.out.print(e + ", ");
        }

    }
}
