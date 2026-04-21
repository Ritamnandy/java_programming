//Write a Program for Fibonacci Numbers Using Recursion.

import java.util.Scanner;

public class Findfibonacci {

    public static int Find(int num) {
        if (num <= 1) {
            return num;
        }
        return Find(num - 1) + Find(num - 2);
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("calculate Fibonacci Numbers Using Recursion...");
        System.out.print("Enter a number:- ");
        int num = scanner.nextInt();
        System.out.print("Ounput:-  ");
        int result = Findfibonacci.Find(num);
        System.out.print(result);
    }
}
