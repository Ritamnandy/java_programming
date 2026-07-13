
import java.util.Scanner;

public class Find {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string:- ");
        String str = scanner.nextLine();
        if (str.contains("  ")) {
            System.out.println("String contains double spaces");
        } else {
            System.out.println("String does not contain double spaces");
        }
        // scanner.close();
    }
}
