
//Find missing number in an array
// If   n = 8, then
//  array ‘a’ will have 7 elements in the range from 1 to 8.
//  For example {1, 4, 5, 3, 7, 8, 6}. One number will be missing in ‘a’ (2 in this case).
import java.util.Scanner;

public class Missingnumberarray {

    public static void missingnumber(int[] arr) {
        int len = arr.length + 1;
        int sum = (len * (len + 1)) / 2;
        int total = 0;
        for (int i : arr) {
            total += i;
        }
        if (arr[arr.length - 1] <= (sum - total)) {
            System.out.println("Missing number is not found");

        } else {
            System.out.println("Missing number is:- " + ((sum - total)));
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
        Missingnumberarray.missingnumber(arr);
    }
}
