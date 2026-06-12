/*
 Write a Java program to print all permutation of a given string of length 3. Permutations of the string
'ABC' is - ABC, ACВ, ВАС, ВСА, СВА, САВ.
 */

public class Permutation {

    public static void main(String[] args) {
        String str = "ABC";
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                for (int k = 0; k < str.length(); k++) {
                    if (str.charAt(i) == str.charAt(j) || str.charAt(i) == str.charAt(k) || str.charAt(j) == str.charAt(k)) {
                        continue;
                    }
                    System.out.println(str.charAt(i) + "" + str.charAt(j) + "" + str.charAt(k));
                }
            }
        }
    }
}
