package lession6.bt1;

public class Circle extends Shape{
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(String color, boolean filled) {
        super(color, filled);
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return this.radius * this.radius * 3.14;
    }
    public double getPerimeter(){
        return this.radius * 2 * 3.14;
    }

    @Override
    public String toString() {
        return "A Circle with" +
                " radius = " + radius +
                ", which is a subclass of " +super.toString();
    }
}
