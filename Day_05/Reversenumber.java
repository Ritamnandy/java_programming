
// Program to Reverse a Number
import java.util.Scanner;

public class Reversenumber {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:- ");
        int num = scanner.nextInt();
        int tem = num;
        int rev = 0;
        while (num != 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
        }
        System.out.println("Reverse of " + tem + " is:- " + rev);
    }
}
