package Chapter8;

class Box {
    double width;
    double height;
    double depth;

    double Volume()
    {
        return width*height*depth;
    }
}

class Box2 extends Box {
    Box2(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Box ob1 = new Box();
        Box2 ob2 = new Box2(10,2,3);
        
        System.out.println(ob1.Volume());
        System.out.println(ob2.Volume());
    }
}
