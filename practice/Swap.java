
class Method {

    private int a = 10;
    private int b = 10;
    private int temp = 0;

    public Method(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void swap() {
        System.out.println("Before swap:- " + a + " " + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swap:- " + a + " " + b);
    }

}

public class Swap extends Method {

    public Swap(int a, int b) {
        super(a, b);
    }

    public static void main(String[] args) {
        Swap swap = new Swap(10, 20);
        Swap swap1 = new Swap(20, -10);

        swap.swap();
        swap1.swap();
    }
}
