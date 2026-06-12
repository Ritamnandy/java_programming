
/* 
Write a Java program to accept a string and change the case of each letter of the string. Display the
new string.
Sample Input : Hello sTRing Tutorial
Sample Output: hELLO StrING tUTORIAL.
 */
import java.util.Scanner;

public class Stringoutput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string:- ");
        String str = scanner.nextLine();
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                result += (char) (str.charAt(i) - 'A' + 'a');
            } else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                result += (char) (str.charAt(i) - 'a' + 'A');
            } else {
                result += str.charAt(i);
            }
        }
        System.out.println("Output string:- " + result + " .");
    }
}
