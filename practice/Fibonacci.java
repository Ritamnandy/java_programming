//Write a Program for print  Fibonacci Numbers from 1 to n
//example... 0 1 1 2 3 5

import java.util.Scanner;

public class Fibonacci {

    public static void PrintFibonacci(int num) {
        int first = 0, second = 1, third;
        System.out.print(first + " " + second + " ");
        for (int i = 2; i <= num; i++) {
            third = first + second;
            first = second;
            second = third;
            System.out.print(third + " ");
        }
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("print Fibonacci Numbers from 1 to n");
        System.out.print("Enter a number(n):- ");
        int num = scanner.nextInt();
        System.out.print("Fibonacci Numbers from 1 to " + num + " :- ");
        Fibonacci.PrintFibonacci(num);
    }
}
