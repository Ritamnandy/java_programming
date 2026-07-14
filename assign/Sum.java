
// Write a program in Java to calculate sum of first N Even numbers.
import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number:- ");
        int num = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("Sum of first " + num + " Even numbers:- " + sum);
    }
}
