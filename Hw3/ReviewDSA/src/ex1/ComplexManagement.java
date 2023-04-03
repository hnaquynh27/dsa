package ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class ComplexManagement {
    public ArrayList<Complex> input(Scanner sc) {
        int n = sc.nextInt();
        ArrayList<Complex> complexNums = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            float real = sc.nextFloat();
            float img = sc.nextFloat();
            Complex num = new Complex(real, img);
            complexNums.add(num);
        }
        return complexNums;
    }

    public void printComplexNumber(ArrayList<Complex> complexNums) {
        for (int i = 0; i < complexNums.size(); i++) {
            System.out.println(complexNums.get(i).toString());
        }
    }

    public void printIndexNumber(ArrayList<Complex> complexNums, int idx) {
        System.out.println(complexNums.get(idx - 1).toString());
    }

    public void sumAllComplexes(ArrayList<Complex> complexNums) {
        Complex comp = new Complex(0, 0);
        for (int i = 0; i < complexNums.size(); i++) {
            comp.addInto(complexNums.get(i));
        }
        System.out.println(comp.toString());
    }
}
