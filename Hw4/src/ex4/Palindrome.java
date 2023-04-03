package ex4;

import ex1.StackArray;
import ex2.ArrayQueue;

import java.util.Scanner;

public class Palindrome {
    public static void isPalindromeArr(String str) {
        StackArray<Character> stack = new StackArray<>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        String reverseString = "";
        while (!stack.isEmpty()) {
            reverseString += stack.pop();
        }
        System.out.println(str.toString());
        System.out.println(reverseString.toString());
        if (str.equals(reverseString)) {
            System.out.println("The input is palindrome");
        } else {
            System.out.println("The input is not palindrome");
        }
    }

    public static void isPalindromeQueue(String str) {
        ArrayQueue<Character> queue = new ArrayQueue<>();
        for (int i = str.length() - 1; i >= 0; i--) {
            queue.enqueue(str.charAt(i));
        }
        String reverseString = "";

        for (int i = 0; i < str.length(); i++) {
            reverseString += queue.dequeue();
        }

        System.out.println(str);
        System.out.println(reverseString);
        if (str.equals(reverseString)) {
            System.out.println("The input is palindrome");
        } else {
            System.out.println("The input is not palindrome");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        isPalindromeArr(input);
        isPalindromeQueue(input);
    }
}
