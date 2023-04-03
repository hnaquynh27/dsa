package ex2;

import java.util.ArrayList;
import java.util.Scanner;

public class ShapeManagement {

    public static void main(String[] args) {
        Shape rec = new Rectangle(4, 6);
        Shape sph = new Sphere(5);
        Shape cir = new Circle(7);

        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(rec);
        printShape(shapes);
        shapes.add(sph);
        printShape(shapes);
        shapes.add(cir);
        printShape(shapes);
    }

    public static void printShape(ArrayList<Shape> shapes) {
        for (int i = 0; i < shapes.size(); i++) {
            System.out.println(shapes.get(i).toString());
        }
    }
}
