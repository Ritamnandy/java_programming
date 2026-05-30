
// Write a java program to show factors of number
import java.util.Scanner;

public class Factors {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Factors of a number:- ");
        System.out.print("Enter the number:- ");
        int num = scanner.nextInt();
        System.out.println("Factors of " + num + " are:- ");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
