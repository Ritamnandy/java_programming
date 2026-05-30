
// Program to Find GCD of Two Numbers
import java.util.Scanner;

public class GCD {

    private static int checkgcd(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return checkgcd(num2, num1 % num2);
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Find GCD of Two Numbers...");
        System.out.print("Enter first number:- ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number:- ");
        int num2 = scanner.nextInt();
        int gcd = GCD.checkgcd(num1, num2);
        System.out.println("GCD of " + num1 + " and " + num2 + " is:- " + gcd);
        System.out.println(36 % 60);
    }

}
