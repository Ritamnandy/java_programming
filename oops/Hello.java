
//Abstraction in Java
abstract class TV {

    abstract void start();

    abstract void play();

    abstract void stop();
}

class Remote extends TV {

    @Override
    void start() {
        System.out.println("Tv is trun on");
    }

    @Override
    void play() {
        System.out.println("Tv is playing");
    }

    @Override
    void stop() {
        System.out.println("Tv is trun off");
    }
}

public class Hello {

    public static void main(String[] args) {
        TV r = new Remote();
        r.start();
        r.play();
        r.stop();
    }
}
