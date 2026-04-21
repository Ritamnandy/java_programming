//Write a Java program to convert temperature from Fahrenheit to Celsius degrees.

import java.util.Scanner;

public class TempConvert {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Convert temperature:-   \n1.Fahrenheit to Celsius\t  2.Celsius to Fahrenheit\t  3.Exit..");
            System.out.print("\nEnter your choice:- ");
            int choice = scanner.nextInt();
            if (choice == 3) {
                System.out.println("Exiting...");
                break;
            }
            switch (choice) {
                case 1 -> {
                    System.out.print("\nInput a degree in Fahrenheit:- ");
                    double tempf = scanner.nextDouble();
                    double res = (double) (tempf - 32) / 1.8;
                    System.out.println(tempf + " degree Fahrenheit is equal to " + String.format("%.3f", res) + " in Celsius.");
                }
                case 2 -> {
                    System.out.print("\nInput a degree in Celsius:- ");
                    double tempc = scanner.nextDouble();
                    double res = (double) (tempc * 1.8) + 32;
                    System.out.println(tempc + " degree Celsius is equal to " + String.format("%.3f", res) + " in Fahrenheit.");
                }

                default -> {
                    System.err.println("Invalid choice.");
                }
            }
        }
    }
}
