package lession1.bt3;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter width: ");
        width = sc.nextFloat();

        System.out.print("Enter height: ");
        height = sc.nextFloat();

        float area = width * height;
        System.out.println("Area is: " +area);
    }
}