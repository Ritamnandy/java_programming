//Write a Java program to swap the first and last elements of an array (length must be at least 1) and create another array.

import java.util.Scanner;

public class Swaparray {

    private static void swap(int[] arr) {
        int temp;
        temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
        System.out.print("\nArray after swaping:- ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter the size of an array:- ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter elements...");
        for (int i = 0; i < size; i++) {
            System.out.print((i + 1) + " element:- ");
            int num = scanner.nextInt();
            array[i] = num;
        }
        System.out.print("\nOriginal Array:- ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        Swaparray.swap(array);
    }
}
