
class Add {

    void calculate(int a, int b) {
        int sum = a + b;
        System.out.println("Sum of two numbers:- " + sum);
    }

    void calculate(int a, int b, int c) {
        int sum = a + b + c;
        System.out.println("Sum of three numbers:- " + sum);
    }

    void calculate(int a, int b, int c, int d) {
        int sum = a + b + c + d;
        System.out.println("Sum of four numbers:- " + sum);
    }

    void calculate(int... a) {
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        System.out.println("Sum of " + a.length + " numbers:- " + sum);
    }
}

class Sub extends Add {

    //Method Overriding(A child class can redefine a method of its parent class)
    @Override
    void calculate(int a, int b) {
        int sub = a - b;
        System.out.println("Subtraction of two numbers:- " + sub);
    }
}

public class Run {

    public static void main(String[] args) {
        Add add = new Add();
        add.calculate(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        add.calculate(10, 20);
        add.calculate(10, 20, 30);
        add.calculate(10, 20, 30, 40);
        Add sub = new Sub();
        sub.calculate(20, 10);
    }
}
