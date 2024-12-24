package lession15.bt4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a: ");
            double a = sc.nextDouble();
            System.out.print("Enter b: ");
            double b = sc.nextDouble();
            System.out.print("Enter c: ");
            double c = sc.nextDouble();
            illegalTriangle(a, b, c);
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void illegalTriangle(double a, double b, double c) throws IllegalTriangleException {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalTriangleException("Each side need to >0");
        } else if (a + b <= c || b + c <= a || a + c <= b) {
            throw new IllegalTriangleException("Sum of 2 sides > the other side");
        }
    }
}
