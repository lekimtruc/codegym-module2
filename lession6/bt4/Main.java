package lession6.bt4;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(2.1F, 3.2F);
        MovablePoint movablePoint = new MovablePoint(1.2F, 2.3F, 1.0F, 2.0F);
        System.out.println(point.toString());
        System.out.println(movablePoint.toString());
        System.out.println(movablePoint.move());
        System.out.println(movablePoint.move());
    }
}
