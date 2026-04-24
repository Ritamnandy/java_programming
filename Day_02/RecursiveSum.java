
//Write a Java recursive method to calculate the sum of all numbers from 1 to n.
import java.util.Scanner;

public class RecursiveSum {

    private static int calculatesum(int num) {
        if (num == 0) {
            return num;
        }
        return num + calculatesum(num - 1);
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:- ");
        int num = scanner.nextInt();
        int result = RecursiveSum.calculatesum(num);
        System.out.println("Sum of " + num + " numbers:- " + result);
    }
}
