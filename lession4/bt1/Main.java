package lession4.bt1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rectangle width: ");
        double width = sc.nextDouble();

        System.out.print("Enter rectangle height: ");
        double height = sc.nextDouble();

        Rectangle rectangle = new Rectangle(width, height);
        System.out.println(rectangle.display());
        System.out.println("Your rectangle Area is: " +rectangle.getArea());
        System.out.println("Your rectangle Perimeter is: " +rectangle.getPerimeter());
    }
}
