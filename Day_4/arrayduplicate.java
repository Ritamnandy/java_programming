
// find duplicate elements in an array
import java.util.Scanner;

public class arrayduplicate {

    public static void findduplicate(int[] array) {
        boolean isduplicate = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    isduplicate = true;
                    System.out.println("array duplicate element:- " + array[i]);
                }
            }
        }
        if (!isduplicate) {
            System.out.println("No duplicate element found");
        }
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of an array:- ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter elements:- ");
        for (int i = 0; i < size; i++) {
            System.out.print((i + 1) + " element:- ");
            int num = scanner.nextInt();
            array[i] = num;
        }
        arrayduplicate.findduplicate(array);

    }
}
