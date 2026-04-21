
public class Add {

    public static void Sum(int... n) {
        int sum = 0;
        for (int i : n) {
            sum += i;
        }
        System.out.println("Sum of " + n.length + " numbers:- " + sum);
    }

    public static void main(String[] args) {
        Add.Sum(10, 20, 30, 40);
    }
}
