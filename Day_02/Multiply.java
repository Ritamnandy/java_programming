//Write a Java program to multiply two integers without multiplication, division, bitwise operators, and loops

import java.util.Scanner;

public class Multiply {

    private static int multiply_two_number(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        if (b > 0) {
            return a + multiply_two_number(a, b - 1);
        }
        if (b < 0) {
            return -multiply_two_number(a, -b);
        }
        return -1;
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number:- ");
        int a = scanner.nextInt();
        System.out.print("Enter second number:- ");
        int b = scanner.nextInt();
        int result = Multiply.multiply_two_number(a, b);
        System.out.println(a + " x " + b + " = " + result);
    }
}
