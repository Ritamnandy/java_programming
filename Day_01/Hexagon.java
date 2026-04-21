// Write a Java program to compute hexagon area.
// formula:- Area of a hexagon = (6 * len^2)/(4*tan(π/6))

import java.util.Scanner;

public class Hexagon {

    private static void calculate(int Input) {
        final double pi = Math.PI;
        double res = (double) (6 * Math.pow(Input, 2)) / (4 * Math.tan(pi / 6));
        System.out.println("The area of the hexagon is:- " + res);
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Compute hexagon area...");
        System.out.print("Input the length of a side of the hexagon:- ");
        int ip = scanner.nextInt();
        Hexagon.calculate(ip);
    }
}
