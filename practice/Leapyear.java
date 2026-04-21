
// Write a Program to Check if a Given Year Is a Leap Year.
import java.util.Scanner;

public class Leapyear {

    public static void Checkleapyear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is Leap Year.");
        } else {
            System.out.println(year + " is not Leap Year.");

        }
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Check if a Given Year Is a Leap Year or Not");
        System.out.print("Enter the year:- ");
        int year = scanner.nextInt();
        Leapyear.Checkleapyear(year);
    }
}
