
import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("\nEnter " + (i + 1) + " element:- ");
            arr[i] = scanner.nextInt();
        }
        System.out.print("\nArray element:- ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
