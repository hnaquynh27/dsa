package ex2;

public class Rectangle extends Shape {
    private double width = 0, height = 0;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    protected double getPerimeter() {
        return (width + height) * 2;
    }

    protected double getArea() {
        return width * height;
    }

    protected double getVolume() {
        return 0;
    }

    @Override
    public String toString() {
        return "Rectangle[" + "perimeter=" + this.getPerimeter() + ", area=" + this.getArea() + ']';
    }
}
