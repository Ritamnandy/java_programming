
public class sub {

    public static void addition(int... num) {
        int result = 0;
        for (int i : num) {
            result += i;
        }
        System.out.println(" result :- " + result);
    }

    public static void main(String[] args) {
        sub.addition(10, 2, 3, 40, 10, 34);
    }
}
