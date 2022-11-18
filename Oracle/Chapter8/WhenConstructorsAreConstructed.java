package Chapter8;

class A1 {
    A1()
    {
        System.out.println("Inside A1's constructor");
    }
}

class B1 extends A1 {
    B1() {
        System.out.println("Inside B1's constructor");
    }
}

class C1 extends B1 {
    C1() {
        System.out.println("Inside C1's constructor");
    }

    int mata(int a) { return a;}
}
public class WhenConstructorsAreConstructed {
    public static void main(String[] args) {
        C1 c = new C1();
        
        System.out.println(c.mata(5));
        
    }
}
