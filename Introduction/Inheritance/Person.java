package Inheritance;

public class Person {
    
    protected String name;

    public Person(String name) {
        this.name = name;
        System.out.println("inside Person Constructor");
    }
    public void walk() {
        System.out.println(name +" is walking");
    }

    public void eat() {
        System.out.println(name +" is eating");
    }
}
