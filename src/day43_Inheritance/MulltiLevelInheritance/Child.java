package day43_Inheritance.MulltiLevelInheritance;

public class Child extends Parent {

    int age;

    public Child(String name,String lastname,int age){
        super(name,lastname);
        this.age = age;
    }


    public void display(){
        super.display();
        super.miras();
        System.out.println("age : "+age);
    }
}
