
class Store {

    static int count = 0;

    public static void Add() {
        count++;
    }
}

public class Count {

    public static void main(String[] args) {
        Store.Add();
        Store.Add();
        Store.Add();
        System.out.println("Number of objects created:- " + Store.count);
    }
}
