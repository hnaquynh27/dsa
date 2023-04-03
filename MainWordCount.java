package Hw3_21002133;

import java.io.FileNotFoundException;

public class MainWordCount {
    public static void main(String[] args) throws FileNotFoundException {
        WordCount wordCount = new WordCount();
        wordCount.readFile("/Users/nguyenquynhanh/Downloads/Hw3_21002133/test.txt");
        wordCount.printInfo();
    }
}
