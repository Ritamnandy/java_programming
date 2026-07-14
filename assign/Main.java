

interface Engine {

    void startEngine();
}

interface MusicSystem {

    void playMusic();
}
class Car implements Engine, MusicSystem {

    @Override
    public void startEngine() {
        System.out.println("Car engine is started.");
    }

    @Override
    public void playMusic() {
        System.out.println("Car music system is playing.");
    }

    void drive() {
        System.out.println("Car is moving.");
    }
}

public class Main {

    public static void main(String[] args) {

        Car car = new Car();

        car.startEngine();
        car.playMusic();
        car.drive();
    }
}
