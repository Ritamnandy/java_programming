//Write a Program to Find Compound Interest.
// compound interest formula A= P(1 + R/100)^t

import java.util.Scanner;

class Find_Interest {

    private final float Principle;
    private final float Rate;
    private final int Time;

    public Find_Interest(float Principle, float Rate, int Time) {
        this.Principle = Principle;
        this.Rate = Rate;
        this.Time = Time;
    }

    public void Find() {

        float div = 1 + (Rate / 100);
        float square = (float) Math.pow(div, Time);
        float total = Principle * square;
        float finalresult = total - Principle;
        System.out.println("Compound Interest =  " + finalresult);
    }
}

public class Compound_Interest extends Find_Interest {

    public Compound_Interest(float Principle, float Rate, int Time) {
        super(Principle, Rate, Time);
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Find Compound Interest.");
        System.out.print("Enter Principle:- ");
        float principle = scanner.nextFloat();
        System.out.print("Enter Rate:- ");
        float rate = scanner.nextFloat();
        System.out.print("Enter Time:- ");
        int time = scanner.nextInt();
        final Compound_Interest obj = new Compound_Interest(principle, rate, time);
        obj.Find();
    }
}
