package lession7.bt3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter percent you want to increase (1-100): ");
        double percent = sc.nextDouble();
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(4.2);
        shapes[1] = new Rectangle(2.3, 3.4);

        for (Shape shape : shapes) {
            if (shape instanceof Resizeable) {
                System.out.println(shape + ""+((Resizeable) shape).resize(percent));
            }
        }
    }
}
