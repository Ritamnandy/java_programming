
// . Write a program in Java to accept marks of a student and display pass or 
// 		  fail.

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        int marks;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Marks:- ");
        marks = sc.nextInt();
        if (marks >= 35) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}   