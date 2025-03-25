package day46_AccessModifiers.Zoo;

import day45_Review.A.A;

public class AnimalTest {
    public static void main(String[] args) {

        Animal animal = new Animal("Kus",3,"Sari-Lacivert");
        System.out.println(animal);
        animal.eat();
        animal.makeSound();

        Bird bird = new Bird("Mavis",2,"Mavi");
        bird.move();
        bird.makeSound();
    }
}
