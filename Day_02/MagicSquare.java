
//Write a Java program to generate a magic square of order n (all row, column, and diagonal sums are equal).
/*8  1   6
  3  5   7
  4  9   2*/
import java.util.Scanner;

public class MagicSquare {

    private static void printmagicsquare(int n) {
        int[][] arr = new int[n][n];
        int r, c;
        if (n % 2 == 0) {
            System.err.println("Please enter odd number.");
            return;
        } else {
            r = 0;
            c = n / 2;
        }
        for (int k = 1; k <= (n * n); k++) {
            arr[r][c] = k;
            r--;
            c++;

            if (c < 0) {
                c = n - 1;
            }
            if (c >= n) {
                c = 0;
            }
            if (r < 0) {
                r = n - 1;
            }
            if (r >= n) {
                r = 0;
            }
            if (arr[r][c] != 0) {
                r += 2;
                c--;
            }
            if (r >= n) {
                r = r - n;
            }
            if (c < 0) {
                c = n + c;
            }
        }
        System.out.println("");
        for (int l = 0; l < n; l++) {
            for (int m = 0; m < n; m++) {

                System.out.print(String.format("%2d", arr[l][m]) + "  ");

            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Generate a magic square of order n...");
        System.out.print("Enter a number(number must be odd):- ");
        int num = scanner.nextInt();
        MagicSquare.printmagicsquare(num);
    }
}
