
// Question 2. Write a program in Java to check a number integer or not.
import java.util.Scanner;

public class Number {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:- ");
        float number = scanner.nextFloat();
        int num = (int) number;
        if (number == num) {
            System.out.println("The number is integer");
        } else {
            System.out.println("The number is not integer");
        }
        // scanner.close();
    }
}
