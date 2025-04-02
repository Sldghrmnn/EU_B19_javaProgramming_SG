package day49_Polimorphism01.RunTime;

public abstract class Animal {

    private String name;

    public Animal(String name) {this.name = name;}

    public String getName() {return name;}

    public void printName(){
        System.out.println("Parent class printName methodu");
        System.out.println("Name : "+name);
    }

    abstract void makeSound();
}
