
// calculate armstrong number
import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:- ");
        int num = scanner.nextInt();
        Armstrong.checkarmstrong(num);
    }

    private static void checkarmstrong(int num) {
        int noOfDigit = checkdigit(num);
        System.out.println("No of digit:- " + noOfDigit);
        int original = num;
        int sum = 0;
        while (num != 0) {
            int ren = num % 10;
            sum += Math.pow(ren, noOfDigit);
            num /= 10;
            System.out.println("Sum:- " + sum);
        }
        if (sum == original) {
            System.out.println(original + " is an Armstrong number");
        } else {
            System.out.println(original + " is not an Armstrong number");
        }

    }

    private static int checkdigit(int num) {
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        return count;
    }
}
