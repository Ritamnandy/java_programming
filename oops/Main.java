
import java.util.Scanner;

class Student {

    int roll;
    String name;

    void getStudentData(int r, String n) {
        roll = r;
        name = n;
    }

    void displayStudent() {
        System.out.println("Roll No:- " + roll);
        System.out.println("Name:-  " + name);
    }
}
class Exam extends Student {

    int marks;

    void getMarks(int m) {
        marks = m;
    }

    void displayMarks() {
        System.out.println("Marks:- " + marks);
    }
}

class Result extends Exam {

    void displayResult() {
        if (marks >= 40) {
            System.out.println("Result  : Pass");
        } else {
            System.out.println("Result  : Fail");
        }
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Result obj = new Result();

        System.out.print("Enter Roll No:- ");
        int roll = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name:- ");
        String name = sc.nextLine();

        System.out.print("Enter Marks:- ");
        int marks = sc.nextInt();
        obj.getStudentData(roll, name);
        obj.getMarks(marks);
        System.out.println("\n----- Student Details -----");
        obj.displayStudent();
        obj.displayMarks();
        obj.displayResult();
    }
}
