package lession7.bt4;

public class Square extends Rectangle implements Colorable{
    public Square() {
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public Square(double side){
        super(side, side);
    }

    public double getSide(){
        return getWidth();
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
