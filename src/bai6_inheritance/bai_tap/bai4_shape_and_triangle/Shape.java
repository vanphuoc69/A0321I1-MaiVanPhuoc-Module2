package bai6_inheritance.bai_tap.bai4_shape_and_triangle;

public class Shape {
    private String color="green";
    private  boolean filled=true;

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

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A Shape with color of "+color+ " and " +(isFilled()?"filled":"not filled");
    }

    public static void main(String[] args) {
        Shape shape=new Shape();
        System.out.println(shape);
    }
}
