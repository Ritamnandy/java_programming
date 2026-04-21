//Write a Program to Compare Two Strings.

import java.util.Scanner;

public class Comparestring {

    private static void Compare(String str1, String str2) {
        int res = str1.compareTo(str2);
        if (res == 0) {
            System.out.println("\"" + str1 + "\" and " + "\"" + str2 + "\" are equal.");
        } else {
            System.out.println("\"" + str1 + "\" and " + "\"" + str2 + "\" are not equal.");
        }
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first String:- ");
        String str1 = scanner.nextLine();

        System.out.print("Enter second String:- ");
        String str2 = scanner.nextLine();

        Comparestring.Compare(str1, str2);
    }
}
