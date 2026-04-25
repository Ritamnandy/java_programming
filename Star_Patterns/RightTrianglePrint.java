// Right Triangle Star Pattern

import java.util.Scanner;

public class RightTrianglePrint {

    private static void print(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Right Triangle Print...");
        System.out.print("Enter the number:- ");
        int n = scanner.nextInt();
        RightTrianglePrint.print(n);
    }
}
