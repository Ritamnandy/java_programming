
// Write a Java program to add one to a positive number represented as an array of digits.
import java.util.Scanner;

public class Addarray {

    private static void add(int[] array) {
        array[array.length - 1] += 1;
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of an array:- ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter elements:- ");
        for (int i = 0; i < size; i++) {
            System.out.print((i + 1) + " element:- ");
            int num = scanner.nextInt();
            array[i] = num;
        }
        Addarray.add(array);
        System.out.print("Array after add one:- ");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
