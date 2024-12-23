package lession12.bt2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Truc", 23, "LA");
        Student student2 = new Student("Duong", 25, "LA");
        Student student3 = new Student("Duc", 26, "LA");

        Map<Integer, Student> hashMap = new HashMap<>();
        hashMap.put(1, student1);
        hashMap.put(2, student2);
        hashMap.put(3, student3);

        for (Map.Entry<Integer, Student> student : hashMap.entrySet()) {
            System.out.println(student.getKey() + " : " + student.getValue());
        }

        System.out.println("-----");
        Set<Student> hashSet = new HashSet<>();
        hashSet.add(student1);
        hashSet.add(student2);
        hashSet.add(student3);

        for (Student student : hashSet) {
            System.out.println(student);
        }
    }
}
