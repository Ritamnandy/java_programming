//Write a Java program to print the area and perimeter of a circle.

import java.util.Scanner;

public class Circle {

    private static void printAreaandPerimeter(double radius) {
        final double pi = Math.PI;
        double perimeter = 2 * pi * radius;
        double area = pi * Math.pow(radius, 2);
        System.out.println("Perimeter is:- " + perimeter);
        System.out.println("Area is:- " + area);
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius for calculating perimeter and area:- ");
        double radius = scanner.nextDouble();
        Circle.printAreaandPerimeter(radius);
    }
}
