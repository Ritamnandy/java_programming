
// print Magic square
import java.util.Scanner;

public class Magicsquare {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Generate a magic square of order n...");
        System.out.print("Enter a number(number must be odd):- ");
        int num = scanner.nextInt();
        Magicsquare.printmagicsquare(num);
    }

    private static void printmagicsquare(int num) {
        int[][] arr = new int[num][num];
        int col, row;
        if (num % 2 == 0) {
            System.out.println("Number must be odd ");
            return;
        } else {

            row = 0;
            col = num % 2;
        }
        for (int k = 0; k < (num * num); k++) {
            arr[row][col] = k + 1;
            // System.out.println("Row & Col:- " + row + ", " + col + " value:- " + (k + 1));
            row--;
            col++;
            if (row < 0) {
                row = num - 1;
            }
            if (row > num - 1) {
                row = 0;
            }
            if (col < 0) {
                col = num - 1;
            }
            if (col > num - 1) {
                col = 0;
            }
            if (arr[row][col] != 0) {
                row += 2;
                col--;
            }
            if (row > num - 1) {
                row -= num;
            }
            if (col < 0) {
                col += num;
            }

        }
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print(String.format("%2d", arr[i][j]) + "  ");
            }
            System.out.println("");
        }
    }
}
