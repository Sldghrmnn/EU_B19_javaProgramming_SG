package day50_Polimorphism02.ReferenceType;

public class ChildB extends Parent implements MyInterface{


    @Override
    public void method2() {System.out.println("my interface method 2 over Child B");}

    public void method4(){System.out.println("Child B method 4");}
}
