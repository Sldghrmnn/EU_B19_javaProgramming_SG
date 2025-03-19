package day44_Inheritance02.AnimalProject;

public class Animal {

    public Animal(){
        System.out.println("Animal'a ait default const. calisti");
    }

    public Animal(String sound){
        System.out.println("Animal'a ait parametreli const.calisti :"+sound);
    }

    public void eat(){
        System.out.println("Animal is eating");
    }
}
