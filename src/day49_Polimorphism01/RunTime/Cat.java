package day49_Polimorphism01.RunTime;

public class Cat extends Animal{


    public Cat(String name) {super(name);}

    @Override
    void makeSound() {
        System.out.println("Iam a Cat and I meke sound like 'miyaaw'");
    }

    public void tirmala(){
        System.out.println("Ben bir Kediyim, beni kizdirirsan tirmalarim!!!");
    }
}
