//Second Largest Element in an Array

import java.util.*;

public class SecondLargestElement {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array:- ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements:- ");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter " + (i + 1) + " element:- ");
            int num = scanner.nextInt();
            arr[i] = num;
        }
        SecondLargestElement.scondlargest(arr);

    }

    private static void scondlargest(int[] arr) {
        int len = arr.length;
        if (len < 2) {
            System.err.println("Array size should be greater than 2");
        } else {
            Arrays.sort(arr);
            System.out.println("Second largest element is:- " + arr[len - 2]);
        }
    }
}
