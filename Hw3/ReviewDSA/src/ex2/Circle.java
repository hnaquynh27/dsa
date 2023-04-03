package ex2;

public class Circle extends Shape {
    private double radius = 0;

    public Circle(double radius) {
        this.radius = radius;
    }

    protected double getPerimeter() {
        return Math.PI * radius * 2;
    }

    protected double getArea() {
        return Math.PI * radius * radius;
    }

    protected double getVolume() {
        return 0;
    }

    public String toString() {
        return "Circle[" + "perimeter=" + this.getPerimeter() + ", area=" + this.getArea() + ']';
    }
}
