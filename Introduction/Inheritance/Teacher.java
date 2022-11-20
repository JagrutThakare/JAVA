package Inheritance;

public class Teacher extends Person { // Person is father of Teacher
    
    public Teacher(String name) {
        super(name);
        System.out.println("Inside teacher constructor");
    }
    public void teach() {
        
        System.out.println(name + " is teaching");
    }
    public void eat() {
        super.eat();
        System.out.println("Teacher " + name + " is eating");

    }
}
