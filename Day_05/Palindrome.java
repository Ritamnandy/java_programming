
import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number:- ");
        int num = scanner.nextInt();
        int tem = num;
        int rev = 0;
        while (tem != 0) {
            int rem = tem % 10;
            rev = rev * 10 + rem;
            tem /= 10;
        }
        if (num == rev) {
            System.out.println(num + " is a palindrome");
        } else {
            System.out.println(num + " is not a palindrome");
        }
    }
}
