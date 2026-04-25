//Left Triangle Star Pattern

import java.util.Scanner;

public class LeftTrianglePrint {

    private static void print(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" *");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Left Triangle Print...");
        System.out.print("Enter the number:- ");
        int n = scanner.nextInt();
        LeftTrianglePrint.print(n);
    }

}
