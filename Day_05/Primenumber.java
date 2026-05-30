
//Program to Check Prime Number

import java.util.Scanner;

public class Primenumber {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Check Prime Number up to n number:- ");
        System.out.print("Enter the Number:- ");
        int num = scanner.nextInt();
        System.out.println("Prime Number up to " + num + " :-  ");
        Primenumber.checkprime(num);
    }

    private static void checkprime(int num) {
        boolean isPrime;
        for (int i = 2; i <= num; i++) {
            isPrime = true;
            for (int j = 2; j < i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}
