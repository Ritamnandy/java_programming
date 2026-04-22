
//Write a Java program that reads a number in inches and converts it to meters.
import java.util.Scanner;

public class ConvertInchestoMeters {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("inches to meter converter.");
        System.out.print("Input a value for inch:- ");
        double inches = scanner.nextDouble();
        double res = inches * 0.0254;
        System.out.println(inches + " inch is " + String.format("%.3f", res) + " meters");
    }
}
