
//Write a Java recursive method to calculate the nth Fibonacci number.
import java.util.Scanner;

public class FibonacciCalculator {

    private static int calculate(int num) {
        if (num == 0) {
            return 0;
        } else if (num == 1) {
            return 1;
        }
        return calculate(num - 1) + calculate(num - 2);
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a position:- ");
        int num = scanner.nextInt();
        int result = FibonacciCalculator.calculate(num);
        System.out.println("\nThe Fibonacci number at position " + num + " is: " + result);
    }
}
