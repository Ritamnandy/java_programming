
// Write a Program to Find the Largest Among 3 Numbers.
import java.util.Scanner;

public class Findnum {

    public static void Find(int num1, int num2, int num3) {
        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println(num1 + " is the largest.");
            } else {
                System.out.println(num2 + " is the largest.");

            }
        } else {
            if (num3 > num2) {
                System.out.println(num3 + " is the largest.");
            } else {
                System.out.println(num2 + " is the largest.");

            }

        }
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println(" Find the Largest Among 3 Numbers.");
        System.out.print("Enter 1st number:- ");
        int num1 = scanner.nextInt();
        System.out.print("Enter 2nd number:- ");
        int num2 = scanner.nextInt();
        System.out.print("Enter 3nd number:- ");
        int num3 = scanner.nextInt();
        Findnum.Find(num1, num2, num3);
    }

}
