//Write a Java program to print all permutations of a given string with repetition.

import java.util.Scanner;

public class Permutations {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Print all permutations of a given string with repetition.");
        System.out.print("Enter a permutations string:- ");
        String str = scanner.nextLine();
        Permutations.print(str);
    }

    private static void print(String str) {
        System.out.println("Permutations of " + str + " are:- ");
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                for (int k = 0; k < str.length(); k++) {
                    System.out.println(str.charAt(i) + "" + str.charAt(j) + "" + str.charAt(k));
                }
            }
        }
    }
}
