
//Write a Java program to convert an integer number to a binary,hexadecimal ,octal  number.
import java.util.Scanner;

public class Converter {

    private static void convert(int num, int choice) {
        switch (choice) {
            case 1 ->
                System.out.println(num + " :- " + Integer.toHexString(num).toUpperCase());
            case 2 ->
                System.out.println(num + " :- " + Integer.toOctalString(num));
            case 3 ->
                System.out.println(num + " :- " + Integer.toBinaryString(num));
            default ->
                System.err.println("Invalid choice.");
        }
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nConverter:-- 1. hexadecimal\t2. octal\t3. binary\t4. exit ---");
            System.out.print("Enter your choice:- ");
            int choice = scanner.nextInt();
            if (choice == 4) {
                System.out.println("Exiting....");
                break;
            }
            System.out.print("Enter number:- ");
            int num = scanner.nextInt();
            Converter.convert(num, choice);
        }
    }

}
