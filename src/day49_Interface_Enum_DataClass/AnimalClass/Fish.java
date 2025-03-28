package day49_Interface_Enum_DataClass.AnimalClass;

public class Fish extends Animal implements Swimable{

    public Fish(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("balik kucuk baliklari yer");
    }

    @Override
    public void sleep() {
        System.out.println("Balik gozu acik uyur");
    }

    @Override
    public void swim() {
        System.out.println("Balik iyi yuzer");
    }
    public void printInfo() {
        System.out.println("My name  :"+getName());
        System.out.println("My age   :"+getAge());
    }
}
