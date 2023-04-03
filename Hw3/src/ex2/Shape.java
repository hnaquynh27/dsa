package ex2;

public abstract class Shape {
    protected String name;

    protected abstract double getPerimeter();

    protected abstract double getArea();

    protected abstract double getVolume();

    protected String getName() {
        return this.name;
    }

    protected void setName(String name) {
        this.name = name;
    }
}
