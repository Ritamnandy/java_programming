
// Replace all vowel to exclamation mark
import java.util.Scanner;

public class Replacevowel {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string:- ");
        String str = scanner.nextLine();
        String newStr = str.replaceAll("[aeiouAEIOU]", "!");
        System.out.println("After replacing all vowel with exclamation mark:- " + newStr);
    }
}
