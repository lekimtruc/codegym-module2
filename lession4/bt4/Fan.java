package lession4.bt4;

public class Fan {
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean getOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fan() {
        this.speed = this.getSpeed();
        this.on = this.getOn();
        this.radius = this.getRadius();
        this.color = this.getColor();
    }

    @Override
    public String toString() {
        if(this.on){
            System.out.println("Speed: " +this.speed);
            System.out.println("Color: " +this.color);
            System.out.println("Radius: " +this.radius);
            return ("Fan is on");
        }
        System.out.println("Color: " +this.color);
        System.out.println("Radius: " +this.radius);
        return ("Fan is off");
    }
}
