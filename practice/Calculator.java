
//Write a Program to Make a Simple Calculator.
import java.util.Scanner;

class Calculate {

    private final float num1;
    private final float num2;
    private final char operator;
    private double Result;

    public Calculate(float num1, float num2, char operator) {
        this.num1 = num1;
        this.num2 = num2;
        this.operator = operator;
    }

    public void Operations() {
        switch (operator) {
            case '+' -> {
                Result = num1 + num2;
                System.out.println("Result:- " + num1 + " + " + num2 + " = " + Result);

            }
            case '-' -> {
                Result = num1 - num2;
                System.out.println("Result:- " + num1 + " - " + num2 + " = " + Result);
            }
            case '*' -> {
                Result = num1 * num2;
                System.out.println("Result:- " + num1 + " * " + num2 + " = " + Result);
            }
            case '/' -> {
                Result = num1 / num2;
                System.out.println("Result:- " + num1 + " / " + num2 + " = " + Result);
            }
            default -> {

                System.err.println("Invalid operator");
            }
        }
    }
}

public class Calculator extends Calculate {

    public Calculator(float num1, float num2, char operator) {
        super(num1, num2, operator);
    }

    public static void main(String[] arg) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("A Simple Calculator.....");

        System.out.print("Enter first number:- ");
        float firstnum = scanner.nextFloat();

        System.out.print("Enter second number:- ");
        float secondnum = scanner.nextFloat();

        System.out.print("Enter operator(+,-,*,/):- ");
        char op = scanner.next().charAt(0);

        final Calculator obj = new Calculator(firstnum, secondnum, op);

        obj.Operations();

    }
}
