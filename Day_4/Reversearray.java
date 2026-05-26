
import java.util.Scanner;

public class Reversearray {

    public static void reverse(int[] arr, int len) {
        for (int i = len - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of an array:- ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements:- ");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter " + (i + 1) + " element:- ");
            int num = scanner.nextInt();
            arr[i] = num;
        }
        Reversearray.reverse(arr, arr.length);

    }
}
