package ex5;

import java.io.File;
import java.util.Scanner;

public class WordCount {
    String word;
    int count;

    public int readData(String fileName) {
        File file = new File(fileName);
        StringBuilder str = new StringBuilder();
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNext()) {
                word = sc.next();
                count++;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;
    }


}
