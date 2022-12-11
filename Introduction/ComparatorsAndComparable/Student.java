package ComparatorsAndComparable;

public class Student {
    int marks;
    String name;

    public Student(int marks, String name) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student [marks=" + marks + ", name=" + name + "]";
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // @Override
    // public int compareTo(Student obj) {
    //     return this.marks - obj.marks;
    // }
    
}
