
//  Write a Program to Check Whether a Number Is Prime or Not.
import java.util.Scanner;

public class Primecheck {

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % 2 == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Check Whether a Number Is Prime or Not.");
        System.out.print("Enter the number:- ");
        int num = scanner.nextInt();
        boolean value = Primecheck.isPrime(num);
        if (value) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");

        }
    }

}
