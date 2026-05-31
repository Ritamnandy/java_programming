// Third largest element in an array

import java.util.*;

public class Thirdlargestelement {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of an array:- ");
        int size = scanner.nextInt();
        System.out.println("Enter the elements:- ");
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter " + (i + 1) + " element:- ");
            int num = scanner.nextInt();
            arr[i] = num;
        }
        Thirdlargestelement.thirdlargest(arr);
    }

    private static void thirdlargest(int[] arr) {
        int len=arr.length;
        if(len<3){
            System.err.println("Array size should be greater than 3");
        }else{
            Arrays.sort(arr);
            System.out.println("Third largest element is:- "+arr[len-3]);
        }
    }
}
