
// Pascal’s Triangle Program in Java
import java.util.Scanner;

public class PascalTriangle {

    private static void print(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            int number = 1;
            for (int k = 1; k <= i; k++) {

                System.out.print(" " + number);
                number = number * (i - k) / (k);

            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Pascal\'s Triangle Print...");
        System.out.print("Enter the number:- ");
        int n = scanner.nextInt();
        PascalTriangle.print(n);
    }
}
