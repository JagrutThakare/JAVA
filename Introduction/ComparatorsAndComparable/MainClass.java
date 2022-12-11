package ComparatorsAndComparable;

import java.util.*;

public class MainClass {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();

        students.add(new Student(83, "Ram"));
        students.add(new Student(63, "Shyam"));
        students.add(new Student(43, "Aman"));
        students.add(new Student(23, "Rohit"));
        students.add(new Student(23, "Anuj"));

        // Collections.sort(students, new Comparator<Student>() { //Anonymous class
        //     @Override
        //     public int compare(Student o1, Student o2) {
        //         if (o1.name.equals(o2.name))
        //             return o1.marks - o2.marks;
        //         else
        //             return o1.name.compareTo(o2.name);
        //     }
        // });

        // Collections.sort(students, (o1, o2) -> { //Anonymous class
        //         if (o1.name.equals(o2.name))
        //             return o1.marks - o2.marks;
        //         else
        //             return o1.name.compareTo(o2.name);
        // });

        Collections.sort(students, Comparator.comparing(Student::getName).thenComparing(Student::getMarks).reversed());
        students.forEach(System.out::println); 
    }
}

class SortByNameThenMarks implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.name.equals(o2.name))
            return o1.marks - o2.marks;
        else
            return o1.name.compareTo(o2.name);
    }

}