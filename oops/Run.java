
class Add {

    void calculate(int a, int b) {
        int sum = a + b;
        System.out.println("Sum of two numbers:- " + sum);
    }
}

class Sub extends Add {

    @Override
    void calculate(int a, int b) {
        int sub = a - b;
        System.out.println("Subtraction of two numbers:- " + sub);
    }
}

public class Run {

    public static void main(String[] args) {
        Add add = new Add();
        add.calculate(10, 20);
        Add sub = new Sub();
        sub.calculate(20, 10);
    }
}
