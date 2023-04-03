package Hw3_21002133;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCount {
    private ListNode<String> head;
    private int numWords;

    public void readFile(String filename) throws FileNotFoundException {
        Scanner input = new Scanner(new File(filename));
        head = null;
        numWords = 0;
        while (input.hasNext()) {
            String word = input.next();
            word = word.replaceAll("\\s*\\p{Punct}+\\s*$", "");
            if (word.length() > 0) {
                addWord(word);
            }
        }
        input.close();
    }

    private void addWord(String word) {
        if (head == null) {
            head = new ListNode<String>(word, null);
        } else {
            ListNode<String> frontNode = null;
            ListNode<String> newNode = head;
            while (newNode != null) {
                String data = newNode.getData();
                if (word.compareToIgnoreCase(data) == 0) {
                    newNode.incrementOccurrences();
                    break;
                } else if (word.compareToIgnoreCase(data) < 0) {
                    ListNode<String> temp = new ListNode<String>(word, null);
                    if (frontNode == null) {
                        temp.setNext(newNode);
                        head = temp;
                    } else {
                        frontNode.setNext(temp);
                        temp.setNext(newNode);
                    }
                    break;
                } else if (newNode.getNext() == null) {
                    ListNode<String> temp = new ListNode<String>(word, null);
                    newNode.setNext(temp);
                    break;
                }
                frontNode = newNode;
                newNode = newNode.getNext();
            }
        }

    }

    public void printInfo() {
        ListNode<String> temp = head;
        while (temp != null) {
            System.out.println(temp.getData() + " : " + temp.getOccurrences());
            temp = temp.getNext();
        }
    }
}
