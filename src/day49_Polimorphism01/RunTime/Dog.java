package day49_Polimorphism01.RunTime;

public class Dog extends Animal{


    public Dog(String name) {super(name);}

    @Override
    void makeSound() {
        System.out.println("Iam a Dog and I meke sound like 'how how'");
    }
}
