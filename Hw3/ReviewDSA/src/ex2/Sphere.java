package ex2;

public class Sphere extends Shape {
    private double radius = 0;

    public Sphere(double radius) {
        this.radius = radius;
    }

    protected double getPerimeter() {
        return Math.PI * radius * 2;
    }

    protected double getArea() {
        return Math.PI * radius * radius * 4;
    }

    protected double getVolume() {
        return Math.PI * radius * radius * radius * 4 / 3;
    }

    @Override
    public String toString() {
        return "Sphere[" + "volume=" + this.getVolume() + ", area=" + this.getArea() + ']';
    }
}
