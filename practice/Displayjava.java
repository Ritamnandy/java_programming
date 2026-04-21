
public class Displayjava {

    public static void printJ() {
        for (int i = 1; i <= 4; i++) {
            if (i == 1) {
                System.out.print("  ");
            } else {
                System.out.print("J  ");
            }
        }
        System.out.println();
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                if (i == 3 && j == 1) {

                    System.out.print("J ");
                } else if (i == 4 && (j == 4 || j == 2)) {

                    System.out.print("J ");
                } else {
                    System.out.print("  ");
                }
            }
            for (int k = 1; k <= 1; k++) {
                if (i == 4) {
                    System.out.print("  ");
                } else {
                    System.out.println("J");
                }
            }
        }
    }

    public static void main(String[] args) {
        Displayjava.printJ();
    }
}
