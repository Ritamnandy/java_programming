//Write a Java program to print the area and perimeter of a rectangle

import java.util.Scanner;

public class Rectangle {

    private static void printAreaAndPerimeter(double width, double height) {
        double area = width * height;
        double perimeter = (double) 2 * (width + height);
        System.out.println("Perimeter is:- " + perimeter);
        System.out.println("Area is:- " + area);
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Calculating perimeter and area of a rectangle....");
        System.out.print("Enter Width:- ");
        boolean iswidth = scanner.hasNextDouble();
        System.out.print("Enter Height:- ");
        boolean isheight = scanner.hasNextDouble();
        if (iswidth && isheight) {
            double width = scanner.nextDouble();
            double height = scanner.nextDouble();
            Rectangle.printAreaAndPerimeter(width, height);
        } else {
            System.err.println("\nPlease enter valid width and height");
        }

    }
}
