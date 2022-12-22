package Chapter12.Enumerations;

import java.util.Random;

enum Apple {
    Jonathan(10), GoldenDel(9), RedDel(12), Winesap(15), Cortland(8);

    private int price; // price of each apple
    // Constructor

    Apple(int p) {
        price = p;
    }

    int getPrice() {
        return price;
    }
}

public class EnumDemo {
    public static void main(String[] args) {
        Apple ap = Apple.RedDel;

        System.out.println("Value of ap : " + ap);
        System.out.println();

        ap = Apple.GoldenDel;

        // for(Apple apple : Apple.values()) System.out.println(apple);
        

        if (ap == Apple.GoldenDel) {
            System.out.println("ap contains GoldenDel\n");
        }

        switch (ap) {
            case Jonathan:
                System.out.println("Jonathan");
                break;
            case RedDel:
                System.out.println("GoldenDel");
                break;
            case Winesap:
                System.out.println("Winesap");
                break;
            case Cortland:
                System.out.println("Cortland");
                break;
            case GoldenDel:
                System.out.println("GoldenDel");
                break;
        }

    }
}

// Use the built-in enumeration methods.
// An enumeration of apple varieties.

class EnumDemo2 {
    public static void main(String args[]) {
        Apple ap;
        System.out.println("Here are all Apple constants:");
        // use values()
        Apple allapples[] = Apple.values();
        for (Apple a : allapples)
            System.out.println(a);
        System.out.println();
        // use valueOf()
        ap = Apple.valueOf("Winesap");
        System.out.println("ap contains " + ap);
    }
}

// Use an enum constructor, instance variable, and method.

class EnumDemo3 {
    public static void main(String args[]) {
        // Display price of Winesap.
        System.out.println("Winesap costs " +
                Apple.Winesap.getPrice() +
                " cents.\n");
        // Display all apples and prices.
        System.out.println("All apple prices:");
        for (Apple a : Apple.values())
            System.out.println(a + " costs " + a.getPrice() +
                    " cents.");
    }
}

// Demonstrate ordinal(), compareTo(), and equals().
// An enumeration of apple varieties.

class EnumDemo4 {
    public static void main(String args[]) {
        Apple ap, ap2, ap3;
        // Obtain all ordinal values using ordinal().
        System.out.println("Here are all apple constants" +
                " and their ordinal values: ");
        for (Apple a : Apple.values())
            System.out.println(a + " " + a.ordinal());
        ap = Apple.RedDel;
        ap2 = Apple.GoldenDel;
        ap3 = Apple.RedDel;
        System.out.println();

        // Demonstrate compareTo() and equals()
        if (ap.compareTo(ap2) < 0)
            System.out.println(ap + " comes before " + ap2);
        if (ap.compareTo(ap2) > 0)
            System.out.println(ap2 + " comes before " + ap);
        if (ap.compareTo(ap3) == 0)
            System.out.println(ap + " equals " + ap3);
        System.out.println();

        if (ap.equals(ap2))
            System.out.println("Error!");
        if (ap.equals(ap3))
            System.out.println(ap + " equals " + ap3);
        if (ap == ap3)
            System.out.println(ap + " == " + ap3);
    }
}

// An improved version of the "Decision Maker"
// program from Chapter 9. This version uses an
// enum, rather than interface variables, to
// represent the answers.
// An enumeration of the possible answers.
enum Answers {
    NO, YES, MAYBE, LATER, SOON, NEVER
}

class Question {
    Random rand = new Random();
    
    Answers ask() {
        int prob = (int) (100 * rand.nextDouble());
        if (prob < 15)
            return Answers.MAYBE; // 15%
        else if (prob < 30)
            return Answers.NO; // 15%
        else if (prob < 60)
            return Answers.YES; // 30%
        else if (prob < 75)
            return Answers.LATER; // 15%
        else if (prob < 98)
            return Answers.SOON; // 13%
        else
            return Answers.NEVER; // 2%
    }
}

class AskMe {
    static void answer(Answers result) {
        
        switch (result) {
            case NO:
                System.out.println("No");
                break;
            case YES:
                System.out.println("Yes");
                break;
            case MAYBE:
                System.out.println("Maybe");
                break;
            case LATER:
                System.out.println("Later");
                break;
            case SOON:
                System.out.println("Soon");
                break;
            case NEVER:
                System.out.println("Never");
                break;
        }
    }

    public static void main(String args[]) {
        Question q = new Question();
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
    }
}