//Write a Java program to create and display a unique three-digit number using 1, 2, 3, 4. Also count how many three-digit numbers are there.

public class UniqueNumbers {

    public static void main(String[] args) {

        int[] digits = {1, 2, 3, 4};
        int count = 0;
        for (int i : digits) {
            for (int j : digits) {
                for (int k : digits) {
                    if (i != j && j != k && i != k) {
                        count++;
                        System.out.println(i + " " + j + " " + k);
                    }
                }
            }
        }
        System.out.println("\nTotal number of the three-digit-number is:- " + count);
    }
}
