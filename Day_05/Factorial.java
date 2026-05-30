
import java.util.Scanner;

//calculate Factorial 
public class Factorial {

    private static long calculatefactorial(int num) {
        if (num == 1 || num == 0) {
            return 1;
        }
        return num * calculatefactorial(num - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:- ");
        int num = scanner.nextInt();
        long fact = Factorial.calculatefactorial(num);
        System.out.println("Factorial of " + num + " is " + fact);
    }

}
