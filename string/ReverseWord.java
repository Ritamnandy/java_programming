
import java.util.Scanner;

//Write a Java program to reverse words in a given string.
public class ReverseWord {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Reverse words in a given string");
        System.out.print("Enter a string:- ");
        String str = scanner.nextLine();
        String arr[] = str.split("[,.?!;: ]+");
        // System.out.println(arr[0]);
        System.out.print("The new string after reversed the words:-");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
