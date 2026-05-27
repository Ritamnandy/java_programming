
//Write a Java program to compare two strings lexicographically, ignoring case differences.
import java.util.Scanner;

public class Comparison {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Compare two strings lexicographically,ignoring case differences");
        System.out.print("Enter the first string:- ");
        String str1 = scanner.nextLine();
        System.out.print("Enter the second string:- ");
        String str2 = scanner.nextLine();
        int result = str1.compareToIgnoreCase(str2);
        if (result == 0) {
            System.out.println("\"" + str1 + "\" and \"" + str2 + "\" are equal.");
        } else if (result > 0) {
            System.out.println("\"" + str1 + "\" is greater than \"" + str2 + "\".");
        } else {
            System.out.println("\"" + str1 + "\" is less than \"" + str2 + "\".");
        }
    }
}
