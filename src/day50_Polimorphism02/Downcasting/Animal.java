package day50_Polimorphism02.Downcasting;

public class Animal {
    public void makeSound(){
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal{

    public void makeSound(){
        System.out.println("Hav Hav");
    }

    public void wagTail(){
        System.out.println("Dog is wagging tail");
    }
}

class Cat extends Animal{

    public void makeSound(){
        System.out.println("Miyav Miyav");
    }

    public void mirrr(){
        System.out.println("Cat mirrrs");
    }
}

class DownCastingExample{

    public static void main(String[] args) {

        Animal animal = new Dog();

        animal.makeSound();
        // animal.wagTail();

        Dog dog = (Dog) animal;
        dog.makeSound();
        dog.wagTail();

        if(animal instanceof Dog){
            Dog dog2 = (Dog) animal;
            dog2.wagTail();
        }

        // Downcasting and calling method in one line
        Animal animal2 = new Dog();
        ((Dog) animal2).wagTail();

        Animal animal3 = new Cat();
        ((Cat) animal3).mirrr();

    }
}
