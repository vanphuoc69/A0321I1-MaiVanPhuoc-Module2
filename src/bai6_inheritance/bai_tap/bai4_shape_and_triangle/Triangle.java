package bai6_inheritance.bai_tap.bai4_shape_and_triangle;

public class Triangle extends Shape {
    private double side1=1.0;
    private double side2=1.0;
    private double side3=1.0;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
    public double getPeri() {
        return side1+side2+side3;
    }
    public double getArea() {
        double S=0.25*Math.sqrt((side1+side2+side3)*(side1+side2-side3)*(side2+side3-side1)*(side3+side1-side2));
        return S;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                '}';
    }

    public static void main(String[] args) {
        Triangle triangle=new Triangle(3,2,3);
        System.out.println(triangle);
        System.out.println("perimeter is: "+triangle.getPeri());
        System.out.println("Area is: "+triangle.getArea());
    }
}
