// Write a Java program to add  two binary numbers.

import java.util.Scanner;

public class BinaryAddition {

    private static void Addition(int firstnum, int secondnum) {
        int sum = firstnum + secondnum;
        String res = Integer.toBinaryString(sum);
        System.out.println("Sum of two binary numbers:- " + res);
    }

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);
        System.out.println("Add two binary numbers....");
        System.out.print("Input first binary number:- ");
        String num1 = scanner.nextLine();
        System.out.print("Input second binary number:- ");
        String num2 = scanner.nextLine();
        int firstnum = Integer.parseInt(num1, 2);
        int secondnum = Integer.parseInt(num2, 2);
        BinaryAddition.Addition(firstnum, secondnum);
    }
}
