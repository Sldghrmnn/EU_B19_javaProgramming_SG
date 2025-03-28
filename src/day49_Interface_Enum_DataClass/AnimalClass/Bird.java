package day49_Interface_Enum_DataClass.AnimalClass;

public class Bird extends Animal implements Flyable,Swimable,Runnable{

    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" yem yer");
    }

    @Override
    public void sleep() {
        System.out.println("kus agacta uyur");
    }

    @Override
    public void printInfo() {
        System.out.println("My name  :"+getName());
        System.out.println("My age   :"+getAge());
    }

    @Override
    public void fly() {
        System.out.println("kus kanatlari ile ucar");
    }

    @Override
    public void swim() {
        System.out.println("Kuş yüzebilir");
    }

    @Override
    public void run() {
        System.out.println("Kuş iki ayağı ile koş");
    }

}
