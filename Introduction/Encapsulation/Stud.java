package Encapsulation;

public class Stud {

    private int age;
    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if(age > 20) {
            System.out.println("You are too old to get admission."); 
        } else {
        this.age = age;
        }    
    }
}
