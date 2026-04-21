
import java.util.Scanner;

//Write a Program to Check Even or Odd Integers.
public class Oddeven {

    public static void Find(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is Even Number.");
        } else {
            System.out.println(num + " is Odd Number.");

        }
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Check Even or Odd Integers");
        System.out.print("Enter the number:- ");
        int num = scanner.nextInt();
        Oddeven.Find(num);
    }
}
