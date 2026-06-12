// Writea Java program to calculate area of Triangle using class TriangleArea 

// with the following methods :
// (a) Initialize the base and height of a triangle using constructor
// (b) Give method to calculate area() using base and height
// (c) Give method to print the triangle details, i.e., its base, height and area.
class TriangleArea {

    private final double base;
    private final double height;

    public TriangleArea(double base, double height) {
        this.base = base;
        this.height = height;
    }

    private double calculateArea() {
        double area = (base * height) / 2;
        return area;
    }

    public void printDetails() {
        System.out.println("Base:- " + base);
        System.out.println("Height:- " + height);
        System.out.println("Area of triangle is:- " + calculateArea());
    }
}

public class Triangle {

    public static void main(String[] args) {
        TriangleArea t = new TriangleArea(10, 5);
        t.printDetails();
    }
}
