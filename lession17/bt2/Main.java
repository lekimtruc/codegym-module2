package lession17.bt2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static void writeDataToFile(String path, List<Student> students) {
        try (
                FileOutputStream fos = new FileOutputStream(path);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
        ) {
            oos.writeObject(students);
        } catch (IOException e) {
            e.getStackTrace();
        }
    }

    private static List<Student> readDataFromFile(String path) {
        List<Student> students = new ArrayList<>();
        try (
                FileInputStream fis = new FileInputStream(path);
                ObjectInputStream ois = new ObjectInputStream(fis);
        ) {
            students = (List<Student>) ois.readObject();
        } catch (IOException e) {
            e.getStackTrace();
        } catch (Exception e) {
            e.getStackTrace();
        }
        return students;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Bạn A", "HN"));
        students.add(new Student(2, "Bạn B", "ĐN"));
        students.add(new Student(3, "Bạn C", "HCM"));
        students.add(new Student(4, "Bạn D", "LA"));
        students.add(new Student(5, "Bạn E", "TN"));
        writeDataToFile("D:\\codegym\\module 2\\baitap\\lession17\\bt2\\students.txt", students);
        List<Student> studentsFromFile = readDataFromFile("D:\\codegym\\module 2\\baitap\\lession17\\bt2\\students.txt");
        for (Student student : studentsFromFile) {
            System.out.println(student);
        }
    }
}
