package Chapter8;

class A {
    int i, j;

    A(int a, int b) {
        i = a;
        j = b;
    }

    void show() {
        System.out.println("i and j are " + i + " and " + j);
    }
}

class B extends A {
    int k;
    B(int a, int b, int c) {
        super(a,b);
        k = c;
    }

    void show() {
        super.show();
        System.out.println("k : " + k);
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        B subOb = new B(1,2,3);
        
        subOb.show();
    }
}
