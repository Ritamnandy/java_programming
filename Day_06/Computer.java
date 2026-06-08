
class Computer {

    class Processor {

        void display() {
            System.out.println("My Processor is intel core i5");
        }
    }

    void display() {
        Processor p = new Processor();
        p.display();
    }

    public static void main(String[] args) {
        Computer c = new Computer();
        c.display();
    }
}
