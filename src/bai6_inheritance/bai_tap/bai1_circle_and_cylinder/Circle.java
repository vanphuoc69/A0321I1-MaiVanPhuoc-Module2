package bai6_inheritance.bai_tap.bai1_circle_and_cylinder;

public class Circle {
        protected double radius;
        private String color;

        public Circle() {
        }

        public Circle(double radius, String color) {
            this.radius = radius;
            this.color = color;
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
        public double getArea() {
            return radius*radius*Math.PI;
        }

        @Override
        public String toString() {
            return "Circle: " +
                    "radius=" + getRadius() +
                    ", color=" + getColor() + " and area is "+getArea();
        }

    public static void main(String[] args) {
        Circle circle=new Circle(2,"blue");
        System.out.println(circle);
    }
}
