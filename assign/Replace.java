
import java.util.Scanner;

public class Replace {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string:- ");
        String str = scanner.nextLine();
        String newStr = str.replaceAll(" ", "_");
        System.out.println("String after replacement:- " + newStr);
        // scanner.close();
    }
}
