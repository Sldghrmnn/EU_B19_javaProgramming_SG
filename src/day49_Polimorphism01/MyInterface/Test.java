package day49_Polimorphism01.MyInterface;

public class Test {
    public static void main(String[] args) {


//MyInterface myInterface = new MyInterface();

        //Non-polymorphic way
        ClassA classA = new ClassA();
        ClassB classB = new ClassB();

        //polimorphic way
        MyInterface obj1 = new ClassA();
        obj1.method();

        obj1 = new ClassB();
        obj1.method();

        System.out.println();

        MyInterface obj2 = new ClassB();
        obj2.method();

    }
}
