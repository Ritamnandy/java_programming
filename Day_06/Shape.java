
class Rectangle {

    double width;
    double length;

    public Rectangle(double width, double height) {
        this.width = width;
        this.length = height;
    }

    void getArea() {
        double area = width * length;
        System.out.println("Area of rectangle is:- " + area);
    }
}

public class Shape extends Rectangle {

    double radius;

    public Shape(double radius, double width, double length) {
        super(width, length);
        this.radius = radius;
    }

    @Override
    void getArea() {
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Area of circle is:- " + area);
    }

    public static void main(String[] args) {
        Shape s = new Shape(2, 3, 4);
        s.getArea();
        Rectangle r = new Rectangle(2, 3);
        r.getArea();
    }
}
