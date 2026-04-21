//Write a Java program to multiply two binary numbers.

import java.util.Scanner;

public class BinaryMultiplication {

    private static void Multiplication(int num1, int num2) {
        int res = num1 * num2;
        String stringRes = Integer.toBinaryString(res);
        System.out.println("Product of two binary numbers:- " + stringRes);
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        System.out.println("Multiply two binary numbers....");

        System.out.print("Input first binary number:- ");
        String s1String = scanner.nextLine();

        System.out.print("Input second binary number:- ");
        String s2String = scanner.nextLine();

        int num1 = Integer.parseInt(s1String, 2);
        int num2 = Integer.parseInt(s2String, 2);

        BinaryMultiplication.Multiplication(num1, num2);

    }
}
