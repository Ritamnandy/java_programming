
//Write a Java program to reverse every word in a string using methods.
import java.util.Scanner;

public class ReverseEveryWord {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Reverse Every Word...");
        System.out.print("Enter a string:- ");
        String str = scanner.nextLine();
        ReverseEveryWord.print(str);
    }

    private static void print(String str) {
        String reverseString = "";
        String[] splitString = str.split("[!?.;:, ]+");
        for (String word : splitString) {
            for (int j = word.length() - 1; j >= 0; j--) {
                reverseString += word.charAt(j);
            }
            reverseString += " ";
        }
        System.out.println("Result:- " + reverseString);
    }
}
