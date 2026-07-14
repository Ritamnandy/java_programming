
// Write a program in Java to check whether an alphabet is a vowel or not.
import java.util.Scanner;

public class CheckVowel {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character:- ");
        char ch = scanner.next().charAt(0);
        switch (ch) {
            case 'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u' ->
                System.out.println(ch + " is a vowel.");
            default ->
                System.out.println(ch + " is not a vowel.");
        }
    }
}
