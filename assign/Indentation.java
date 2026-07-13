
// Input:- Dear Jhon, This is a letter to you. Have a nice day, Keep smiling.
// Output:- Dear John,
//            This is a letter to you.
//          Have a nice day,
//            Keep smiling.
import java.util.Scanner;

public class Indentation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string:- ");
        String str = scanner.nextLine();
        String output = "";

        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case ',' ->
                    output += ",\n    ";
                case '.' ->
                    output += ".\n";
                default ->
                    output += str.charAt(i);
            }
        }
        System.out.println(output);
        // scanner.close();
    }
}
