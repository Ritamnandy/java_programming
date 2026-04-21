//Write a Java program to reverse a sentence (assume a single space between two words) without reverse every word.

import java.util.Scanner;

public class ReverseSentence {

    private static void reverse(String str) {
        String reverseString = "";
        String[] splitString = str.split(" ");

        for (int i = splitString.length - 1; i >= 0; i--) {
            reverseString += splitString[i];
            reverseString += " ";
        }
        System.out.println("Result:- " + reverseString);
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string:- ");
        String str = scanner.nextLine();
        ReverseSentence.reverse(str);
    }
}
