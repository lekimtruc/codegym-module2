package lession4.bt2;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        double delta = Math.pow(this.b, 2) - (4 * this.a * this.c);
        return delta;
    }


    public double getRoot1() {
        double delta = this.getDiscriminant();
        double r1 = (-b + Math.sqrt(delta)) / (2 * a);
        return r1;
    }
    public double getRoot2() {
        double delta = this.getDiscriminant();
        double r2 = (-b - Math.sqrt(delta)) / (2 * a);
        return r2;
    }
    public String getRoot() {
        double delta = this.getDiscriminant();
        if (delta > 0){
            return ("Phương trình có 2 nghiệm: " +this.getRoot1() +", " +this.getRoot2());
        }else if(delta == 0){
            System.out.println(delta);
            return ("Phương trình có 1 nghiệm: " +this.getRoot1());
        }
        return ("Phương trình vô nghiệm!");
    }
}
