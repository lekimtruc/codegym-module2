package lession5.bt1;

public class Student {
    private int rollNo;
    private String name;
    private static String college = "FPT";

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
    static void change(){
        college = "CODEGYM";
    }
    void display(){
        System.out.println(rollNo+ " " +name+ " " +college);
    }
}