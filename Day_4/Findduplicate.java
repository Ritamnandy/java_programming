//find duplicate characters in a string in Java

import java.util.Scanner;

public class Findduplicate {

    public static void find(String str) {
        int count;
        for (int i = 0; i < str.length(); i++) {
            count = 0;
            for (int k = i + 1; k < str.length(); k++) {
                if (str.charAt(i) == str.charAt(k)) {
                    break;
                } else {
                    System.out.println(str.charAt(i) + " :- " + count);

                }
                //Better
            }
        }
    }

    public static void main(String args[]) {
        final Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the String:- ");
        String strValue = scanner.nextLine();
        Findduplicate.find(strValue);
    }
}
