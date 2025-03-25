package day46_AccessModifiers.Zoo;

public sealed class Animal permits Dog,Bird{

//Bir class'ı "sealed class" class olarak tanımlarsak kendisini miras alacak
//Child class'ların hangileri olduğunu "permits" anahtar kelimesi ile belirleyebiliriz
//permits ile belirlediğimiz class'lardan başkası bu Animal class'ını miras alamaz
//Yani Parent class'ı hangi class'ların miras alabileceğini belirleyebiliyoruz.
//Miras alan child class'lar da ya "final" ya da "non-sealed" tanımlanmaları gerekir.

    private String name;
    private int age;
    private String color;

    //Public olarak tanımlandığından bu constructor'a erişim her yerden yapılabilir
    public Animal() {}

    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public int getAge() {return age;}

    public void setAge(int age) {this.age = age;}

    public String getColor() {return color;}

    public void setColor(String color) {this.color = color;}

    public void move(){
        System.out.println("I'am an animal. I am moving.");
    }
    public void eat(){
         System.out.println("I'am an animal. I am eating.");
    }
    public void makeSound(){
        System.out.println("I'am an animal. I am make sound.");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
