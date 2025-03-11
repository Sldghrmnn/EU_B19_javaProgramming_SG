package day38_Constructor_PassingObjects02;

import java.util.ArrayList;

public class Student {
    String name;
    String adress;
    int age;
    long id;

    public Student(){
        System.out.println("Default constructor");
        this.name="Belirtilmemis";
        this.adress="Belirtilmemis";
        this.age=0;
        this.id=1000;
    }

    public Student(String name){
        this();
        System.out.println("Constructor with only name field");
        this.name = name;
    }

    public Student(int age){
        this("Merve");
        System.out.println("Constructor with only age field");
        this.age = age;
    }
    public Student(long id){
        this(18);
        System.out.println("Constructor with only id field");
        this.id = id;


    }
}
