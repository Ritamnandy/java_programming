
// Diamond Star Pattern
import java.util.Scanner;

public class DiamondStar {

    private static void print(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= (2 * i) - 1; k++) {
                if (k == 1 || k == (2 * i) - 1) {

                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= (2 * i) - 1; k++) {
                if (k == 1 || k == (2 * i) - 1) {

                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Diamond Star Pattern Print...");
        System.out.print("Enter the number:- ");
        int n = scanner.nextInt();
        DiamondStar.print(n);
    }
}
