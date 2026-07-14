
import java.util.Scanner;

public class Addmatrices {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of matrices:- ");
        System.out.print("Enter the numbers of rows :- ");
        int row = scanner.nextInt();
        System.out.print("Enter the numbers of columns :- ");
        int col = scanner.nextInt();
        int matric1[][] = new int[row][col];
        int matric2[][] = new int[row][col];
        int sum[][] = new int[row][col];
        System.out.println("Enter the elements of first matric:- ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matric1[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Enter the elements of seconds matric:- ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matric2[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Sum of two matric:- ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sum[i][j] = matric1[i][j] + matric2[i][j];
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println("");
        }
    }

}
