
//Constructors
// Default Constructor
// public class Students {
//     public Students() {
//         System.out.println("This is a Default Constructor");
//     }
//     public static void main(String[] args) {
//         Students s1 = new Students();
//         System.out.println(s1.hashCode());
//     }
// }
// Parameterized Constructor
// public class Students {
//     private final String name;
//     private final int age;
//     private final int rollno;
//     public Students(String name, int age, int rollno) {
//         this.name = name;
//         this.age = age;
//         this.rollno = rollno;
//     }
//     public void getDetails() {
//         System.out.println("Students name:- " + this.name);
//         System.out.println("Students age:- " + this.age);
//         System.out.println("Students Roll no:- " + this.rollno);
//     }
//     public static void main(String[] args) {
//         Students s1 = new Students("Ritam", 20, 10);
//         s1.getDetails();
//         Students s2 = s1;
//         s2.getDetails();
//         System.out.println(s1.hashCode());
//     }
// }


// Copy Constructor

class One {

    final String name;
    final int age;

    public One(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public One(One obj) {
        this.name = obj.name;
        this.age = obj.age;
    }

}

public class Students {

    public static void main(String[] args) {
        System.out.println("First object:- ");
        One o1 = new One("Ritam", 20);
        System.out.println("Students name & age:- " + o1.name + " & " + o1.age);
        System.out.println();
        System.out.println("Seconds object:- ");
        One o2 = new One(o1);
        System.out.println("Students name & age:- " + o2.name + " & " + o2.age);
    }

}
