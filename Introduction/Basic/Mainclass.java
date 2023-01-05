package Basic;
class cat {

    int legs = 1;

    public void walk() {
        System.out.println("Cat is walking");
    }
    public void eat() {
        System.out.println("Cat is eating");
    }
}
public class Mainclass {
    public static void main(String[] args) {
        
        cat cat1 = new cat();
        cat cat2 = new cat();
        cat1.walk();
        cat2.eat();
        cat2.legs = 3;
        System.out.println("cat has "+ cat2.legs + " legs and " + cat1.legs);
    }
}
 