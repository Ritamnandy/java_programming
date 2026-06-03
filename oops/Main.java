
class Animal {

    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal {

    @Override
    public void animalSound() {
        System.out.println("The dog barks");
    }
}

class Cat extends Animal {

    @Override
    public void animalSound() {
        System.out.println("The cat meows");
    }
}

class Cow extends Animal {

    @Override
    public void animalSound() {
        System.out.println("The cow moos");
    }
}

public class Main {

    public static void main(String[] args) {
        // Animal myAnimal = new Animal();
        // Animal myDog = new Dog();
        // Animal myCat = new Cat();
        // Animal myCow = new Cow();
        // myAnimal.animalSound();
        // myDog.animalSound();
        // myCat.animalSound();
        // myCow.animalSound();
        Animal myAnimal;
        myAnimal = new Animal();
        myAnimal.animalSound();
        myAnimal = new Dog();
        myAnimal.animalSound();
        myAnimal = new Cat();
        myAnimal.animalSound();
        myAnimal = new Cow();
        myAnimal.animalSound();
    }
}
