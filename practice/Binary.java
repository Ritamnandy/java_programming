// Write a Java Program to convert Integer numbers and Binary numbers.

import java.util.Scanner;

class Convertbinary {

    private int intnum;
    private int temp;
    private final int[] arr = new int[1000];
    private int i = 0;

    public Convertbinary(int intnum) {
        this.intnum = intnum;
    }

    public void convert() {
        while (intnum != 0) {
            temp = intnum % 2;
            arr[i] = temp;
            i++;
            intnum = intnum / 2;
        }
        System.out.print("After converting binary number:-  ");
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(arr[j] + " ");
        }

    }

}

public class Binary extends Convertbinary {

    public Binary(int num) {
        super(num);
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Convert integer to binary ");
        System.out.print("Enter the integer number:- ");
        int num = scanner.nextInt();
        Binary b1 = new Binary(num);
        b1.convert();
    }
}
