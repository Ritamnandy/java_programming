//find all pairs of elements in an array whose sum is equal to given number
//  For example,
//     if {4, 5, 7, 11, 9, 13, 8, 12} is an array and 20 is the given number, 
//     then you have to find all pairs of elements in this array whose sum must be 20. In this example,
//      (9, 11), (7, 13) and (8, 12) are such pairs whose sum is 20.

import java.util.Scanner;

public class Pairsarray {

    public static void findpairs(int[] arr, int sum) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    System.out.println("(" + arr[i] + ", " + arr[j] + ")");
                }
            }
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
        System.out.print("Enter the sum:- ");
        int sum = scanner.nextInt();
        Pairsarray.findpairs(arr, sum);
    }
}
