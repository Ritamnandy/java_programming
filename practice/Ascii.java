
public class Ascii {

    public static void printAscii(char a) {
        int num = (int) a;
        System.out.println("ASCII Value of " + "\'" + a + "\' :- " + num);
    }

    public static void main(String[] args) {
        Ascii.printAscii('A');
        Ascii.printAscii('C');
    }
}
