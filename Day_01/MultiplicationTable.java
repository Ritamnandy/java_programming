
//Write a Java program that takes a number as input and prints its multiplication table up to 10.
import java.util.Scanner;

public class MultiplicationTable {

    public static void printTable(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);
        System.out.println("Multiplication Table......");
        System.out.print("Input a number:- ");
        boolean isnum = scanner.hasNextInt();
        if (isnum) {
            int num = scanner.nextInt();
            MultiplicationTable.printTable(num);
        } else {
            System.out.println("Please enter a integer number");
        }
    }
}
