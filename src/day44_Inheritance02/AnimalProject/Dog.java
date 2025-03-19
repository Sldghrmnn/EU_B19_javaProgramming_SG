package day44_Inheritance02.AnimalProject;

public class Dog extends Animal{

    public Dog(){System.out.println("Dog'a ait default const.calisti");}

    public Dog(String sound){
       this();
        System.out.println("Dog a ait parametreli const.calisti : "+sound);
    }

    public Dog(String sound,int age){
       // super();eger baska bir constr. cagrilmadi ise superin default'u burada yazmasakta,vardir.
        System.out.println("Dog'a ait 2 parametreli const. calisti :"+sound+" age :"+age);
    }

    public void bark(){
        System.out.println("Dog is barking");
    }
}
