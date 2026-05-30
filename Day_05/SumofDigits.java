
// Program to calculate Sum of Digits in a Number
import java.util.Scanner;

public class SumofDigits {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:- ");
        int num = scanner.nextInt();
        int sum = 0;
        while (num != 0) {
            int rem = num % 10;
            sum = sum + rem;
            num /= 10;
        }
        System.out.println("Sum of digits:- " + sum);
    }
}
