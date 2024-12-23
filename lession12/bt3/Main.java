package lession12.bt3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Truc", 23, "LA");
        Student student2 = new Student("Phung", 24, "TN");
        Student student3 = new Student("Duong", 25, "TN");

        List<Student> list = new ArrayList<Student>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        Collections.sort(list);

        System.out.println("Compare base on name: ");
        for (Student student : list) {
            System.out.println(student);
        }

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(list, ageComparator);
        System.out.println("\nCompare base on age: ");
        for (Student student : list) {
            System.out.println(student);
        }
    }
}
