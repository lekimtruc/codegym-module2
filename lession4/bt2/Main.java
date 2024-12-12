package lession4.bt2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Giải phương trình bậc 2");
        System.out.print("Nhập a: ");
        double a = sc.nextDouble();

        System.out.print("Nhập b: ");
        double b = sc.nextDouble();

        System.out.print("Nhập c: ");
        double c = sc.nextDouble();

        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        System.out.println(equation.getRoot());
    }
}
