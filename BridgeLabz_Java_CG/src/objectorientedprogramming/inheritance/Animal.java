package objectorientedprogramming.inheritance;

class Animaldemo {
    String name;
    int age;

    Animaldemo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animaldemo {

    Dog(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animaldemo {

    Cat(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

class Bird extends Animaldemo {

    Bird(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println("Bird chirps");
    }
}

public class Animal {
    public static void main(String[] args) {
        Animaldemo a1 = new Dog("Buddy", 3);
        Animaldemo a2 = new Cat("Kitty", 2);
        Animaldemo a3 = new Bird("Parrot", 1);

        a1.makeSound();
        a2.makeSound();
        a3.makeSound();
    }
}
