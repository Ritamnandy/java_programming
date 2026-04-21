
// WAP to print prime numbers from 2 to n
import java.util.Scanner;

public class Printprime {

    public static void Print(int num) {
        for (int i = 2; i <= num; i++) {
            boolean isprime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isprime = false;
                    break;
                }
            }
            if (isprime) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("print prime numbers from 2 to n.....");
        System.out.print("Enter a number (n):- ");
        int num = scanner.nextInt();
        System.out.println("prime numbers from 2 to " + num + " :-  ");
        Printprime.Print(num);

    }
}
