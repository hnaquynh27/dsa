package ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ComplexManagement mana = new ComplexManagement();
        ArrayList<Complex> complexNum = mana.input(sc);
        mana.printComplexNumber(complexNum);
        System.out.println();
        mana.printIndexNumber(complexNum, 3);
        System.out.println();
        mana.sumAllComplexes(complexNum);

    }
}
