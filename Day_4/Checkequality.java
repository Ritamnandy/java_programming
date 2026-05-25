
import java.util.Scanner;

//you check the equality of two arrays in Java
public class Checkequality {

    public static void checkarray(int arr1[], int arr2[]) {
        boolean isequal = true;
        if(arr1.length != arr2.length) {
            isequal = false;
        }else{
            for (int i = 0; i < arr1.length; i++) {

                if (arr1[i] != arr2[i]) {
                    isequal = false;

                }
            }
        }
        
        System.out.println("The arrays are " + (isequal ? "equal" : "not equal"));
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of 1st array:- ");
        int size1 = scanner.nextInt();
        int[] arr1 = new int[size1];
        System.out.println("Enter the 1st array elements:- ");
        for (int i = 0; i < size1; i++) {
            System.out.println("Enter " + (i + 1) + " element:- ");
            int num = scanner.nextInt();
            arr1[i] = num;
        }
        System.out.print("Enter the size of 2nd array:- ");
        int size2 = scanner.nextInt();
        int[] arr2 = new int[size2];
        System.out.println("Enter the 2nd array elements:- ");
        for (int i = 0; i < size2; i++) {
            System.out.print("Enter " + (i + 1) + " element:- ");
            int num = scanner.nextInt();
            arr2[i] = num;
        }
        Checkequality.checkarray(arr1, arr2);
    }
}
