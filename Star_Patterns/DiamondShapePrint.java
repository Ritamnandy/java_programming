//Diamond Shape Pattern Program in Java

import java.util.Scanner;

public class DiamondShapePrint {

    private static void print(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print(" *");
            }
            System.out.println("");
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print(" *");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Diamond Shape Pattern Print...");
        System.out.print("Enter the number:- ");
        int n = scanner.nextInt();
        DiamondShapePrint.print(n);
    }
}
