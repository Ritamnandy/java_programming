
//Write a Program to Check if the String Is Palindrome.
import java.util.Scanner;

public class Palindrome {

    private static void checkPalindrome(String str) {
        String revString = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            revString += str.charAt(i);
        }
        boolean res = str.equals(revString);
        if (res) {
            System.out.println("\"" + str + "\" is a Palindrome string");
        } else {
            System.out.println("\"" + str + "\" is not a Palindrome string");

        }
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter the string:- ");
        String str = scanner.nextLine();

        Palindrome.checkPalindrome(str);
    }
}
