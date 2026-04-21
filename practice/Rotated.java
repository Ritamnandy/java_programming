//Write a Program to Print the Array After It Is Right Rotated K Times.
//Example:- 
// input:- int arr[]={1,2,3,4,5}
//k=1
// output :- int arr[]={2,3,4,5,1};

import java.util.Scanner;

public class Rotated {

    private static void arrRotated(int[] arr, int k) {

        if (k < 1) {
            return;
        }
        int firstElement = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = firstElement;
        arrRotated(arr, k - 1);
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter the size of an array:- ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the elements:- ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter " + (i + 1) + " element:- ");
            arr[i] = scanner.nextInt();
        }

        System.out.print("\nWho many times rotate:- ");
        int key = scanner.nextInt();

        System.out.print("Array before rotated:-  ");
        for (int element : arr) {
            System.out.print(element + " ");
        }

        Rotated.arrRotated(arr, key);

        System.out.print("\nArray after " + key + " times rotated:-  ");
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
}
