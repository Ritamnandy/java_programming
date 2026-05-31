//Second Largest Element in an Array

import java.util.Scanner;

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
        //4 3 6 7
        int max = 0;
        int max2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= max) {
                max2 = max;
                max = arr[i];
            } 
            
        }
        System.out.println("Second Largest Element is:- " + max2);

    }
}
