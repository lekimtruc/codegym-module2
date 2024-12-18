package lession7.bt4;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(4.2);
        shapes[1] = new Rectangle(2.3, 3.4);
        shapes[2] = new Square();

        for (Shape shape : shapes) {
            System.out.println("Area: " +shape.getArea());
            if (shape instanceof Colorable) {
                System.out.print("How to color: ");
                ((Colorable) shape).howToColor();
            }
            System.out.println("------------");
        }
    }
}
