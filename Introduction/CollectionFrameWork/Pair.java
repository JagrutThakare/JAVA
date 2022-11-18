package CollectionFrameWork;

// Here we have used the generics the X and Y here are Data types 
// that will be defined in method which calls it check MyArrayList.java
// Now Pair is a generic class

public class Pair<X, Y> {
    
    X x;
    Y y;
    public Pair(X x, Y y) {
        this.x = x;
        this.y = y;
    }

    public void getDescription() {
        System.out.println(x + " and " + y);
    }
}
