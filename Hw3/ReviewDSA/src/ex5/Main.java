package ex5;

public class Main {
    public static void main(String[] args) {
        WordCount words = new WordCount();
        int count = words.readData("/Users/nguyenquynhanh/IdeaProjects/Hw3/src/text.txt");
        System.out.println("Number of words in the file: " + count);
    }
}
