// Down triangle

import java.util.Scanner;

public class Downtriangle {

    private static void print(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= (2 * i) - 1; k++) {
                if (i == n || k == 1 || k == (2 * i) - 1) {
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
        System.out.println("Triangle Star Pattern Print...");
        System.out.print("Enter the number:- ");
        int n = scanner.nextInt();
        Downtriangle.print(n);
    }
}
