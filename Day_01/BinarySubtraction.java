//Write a Java program to subtraction two binary numbers.

import java.util.Scanner;

public class BinarySubtraction {

    private static void Subtraction(int num1, int num2) {
        int sub = num1 - num2;
        String res = Integer.toBinaryString(sub);
        System.out.println("Sub of two numbers:- " + res);
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first binary number:- ");
        String s1 = scanner.nextLine();
        System.out.print("Enter second binary number:- ");
        String s2 = scanner.nextLine();
        BinarySubtraction.Subtraction(Integer.parseInt(s1, 2), Integer.parseInt(s2, 2));
    }
}
