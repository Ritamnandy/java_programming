
//Write a Java program to compute the area of a polygon.
//formula:- Area of a polygon = (n*s^2)/(4*tan(π/n))
import java.util.Scanner;

public class Polygon {

    private static void calculate(int n, int length) {
        final double pi = Math.PI;
        double res = (double) (n * (Math.pow(length, 2))) / (4 * Math.tan(pi / n));
        System.out.println("The area of the polygon is:- " + res);
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Compute the area of a polygon....");
        System.out.print("Input the number of sides on the polygon:- ");
        int n = scanner.nextInt();
        System.out.print("Input the length of one of the sides:- ");
        int length = scanner.nextInt();
        Polygon.calculate(n, length);
    }
}
