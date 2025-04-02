package day50_Polimorphism02.ReferenceType;

public class ChildA extends Parent implements MyInterface{


    @Override
    public void method2() {System.out.println("my interface method 2 over Child A");}

    public void method3(){System.out.println("Child A method 3");}
}
