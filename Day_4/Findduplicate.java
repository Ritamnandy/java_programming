//find duplicate characters in a string in Java

import java.util.Scanner;

public class Findduplicate {

    public static void find(String str) {
        int count;
        for (int i = 0; i < str.length(); i++) {
            boolean isrepeat = false;
            for (int j = 0; j < i; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    isrepeat = true;
                    break;

                }
            }
            if (isrepeat) {
                continue;
            }
            count = 0;
            for (int j = i; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (count >= 0) {
                System.out.println(str.charAt(i) + " is repeated " + count + " times");
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
