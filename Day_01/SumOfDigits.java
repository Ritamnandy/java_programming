
//Write a Java program and compute the sum of an integer's digits.
import java.util.Scanner;

public class SumOfDigits {

    private static void sum(String digit) {
        int sum = 0;
        for (int i = 0; i < digit.length(); i++) {
            sum += digit.charAt(i) - '0';
        }
        System.out.println("The sum of an integer's digits:- " + sum);
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a digit:- ");
        String digit = scanner.nextLine();
        SumOfDigits.sum(digit);
    }
}
