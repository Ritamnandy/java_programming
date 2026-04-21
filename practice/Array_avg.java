
//Write a Program to Calculate the Average of All the Elements Present in an Array.
import java.util.Scanner;

public class Array_avg {

    public static void Calculateavg(int[] arr) {

        int sum = 0;
        float avg;
        for (int i : arr) {
            sum += i;
        }
        avg = (float) sum / (arr.length);
        System.out.println("Total Average:- " + avg);
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of an array:- ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements...");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter " + (i + 1) + " element:- ");
            int element = scanner.nextInt();
            arr[i] = element;
        }
        Array_avg.Calculateavg(arr);
    }
}
