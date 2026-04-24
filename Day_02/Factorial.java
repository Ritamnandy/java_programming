//Write a Java recursive method to calculate the factorial of a given positive integer.

import java.util.Scanner;

public class Factorial {

    private static int calculatefactorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        return num * calculatefactorial(num - 1);
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:- ");
        int num = scanner.nextInt();
        int result = Factorial.calculatefactorial(num);
        System.out.println("Factorial of " + num + " is:- " + result);
    }
}
