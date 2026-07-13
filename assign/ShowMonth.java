
import java.util.Scanner;

public class ShowMonth {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Show Month...");
        System.out.print("Enter month number:- ");
        int num = scanner.nextInt();
        switch (num) {
            case 1, 3, 5, 7, 8, 10, 12 ->
                System.out.println("31 days");
            case 4, 6, 9, 11 ->
                System.out.println("30 days");
            case 2 ->
                System.out.println("28 or 29 days");
            default ->
                System.out.println("Invalid month");
        }
    }
}
