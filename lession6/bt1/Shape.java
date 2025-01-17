package lession6.bt1;

public class Shape {
    private String color = "green";
    private boolean filled = true;

    public Shape() {
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }
    public String getFilled(){
        if (this.isFilled() == true){
            return "filled";
        }else{
            return "not filled";
        }
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A Shape with " +
                "color of " + color + '\'' +
                " and " + this.getFilled();
    }
}
