// Write a Java program to convert a Roman number to an integer number.

import java.util.Scanner;

public class RomanConversion {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Roman Number:- ");
        String RomanString = scanner.next().toUpperCase();
        int result = 0;
        for (int i = 0; i < RomanString.length(); i++) {
            char Romanchar = RomanString.charAt(i);
            switch (Romanchar) {
                case 'I' -> {
                    result += 1;
                }
                case 'V' -> {
                    result += 5;
                }
                case 'X' -> {
                    result += 10;
                }
                case 'L' -> {
                    result += 50;
                }
                case 'C' -> {
                    result += 100;
                }
                case 'D' -> {
                    result += 500;
                }
                case 'M' -> {
                    result += 1000;
                }
                default -> {
                    System.err.println("Invalid character");
                    break;
                }
            }
        }

        System.out.println("Equivalent Integer:- " + result);
    }

}
