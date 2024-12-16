package lession6.bt3;

public class Main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(2.3F, 5.7F);
        Point3D point3D = new Point3D(2.0F, 5.0F, 4.6F);
        point3D.setZ(4.6F);
        System.out.println(point2D.toString());
        System.out.println(point3D.toString());
    }
}
