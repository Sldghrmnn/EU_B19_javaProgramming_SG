package day44_Inheritance02.AnimalProject;

public class AnimalTest {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.eat();
        dog.bark();

     /*
        Cat cat = new Cat();
        cat.eat();
        cat.meyeaw();

    */


        System.out.println();
        Dog dog1 = new Dog("hav hav");

        System.out.println();

        Dog dog2 = new Dog("hav hav",4);

        dog2.bark();
        dog2.eat();


    }
}
