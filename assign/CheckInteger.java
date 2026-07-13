// Write a program in Java to check a number integer or not using 
// 		hasNextInt().


import java.util.Scanner;
public class CheckInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:- ");
        if (scanner.hasNextInt()) {
            System.out.println("The number is integer");
        } else {
            System.out.println("The number is not integer");
        }
        // scanner.close();
    }
}