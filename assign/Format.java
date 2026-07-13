
import java.util.Scanner;

public class Format {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String letter = "Dear <|name|>, have a Great Day!";
        System.out.print("Enter your name:- ");
        String str = scanner.nextLine();
        String output = letter.replace("<|name|>", str);
        System.out.println("Final letter:- " + output);
        // scanner.close();
    }
}
