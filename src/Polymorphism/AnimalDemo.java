package Polymorphism;

class Animal {
    void sound() {
        System.out.println("Some animal sound...");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog says: Woof Woof!");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat says: Meow Meow!");
    }
}

class Cow extends Animal {
    @Override
    void sound() {
        System.out.println("Cow says: Moo Moo!");
    }
}

public class AnimalDemo {

    public static void main(String[] args) {

        // Runtime Polymorphism — same method, different behavior
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        Animal a3 = new Cow();

        a1.sound();   // Dog's sound
        a2.sound();   // Cat's sound
        a3.sound();   // Cow's sound

        System.out.println("----------");

        // Method Overloading — Compile time Polymorphism
        Calculator calc = new Calculator();
        System.out.println(calc.add(10, 20));         // two ints
        System.out.println(calc.add(10, 20, 30));     // three ints
        System.out.println(calc.add(10.5, 20.5));     // two doubles
    }
}

// Overloading example
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}