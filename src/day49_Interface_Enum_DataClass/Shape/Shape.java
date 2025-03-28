package day49_Interface_Enum_DataClass.Shape;

public interface Shape {
    //interface icindeki propertiler(variable,field,data members) default olarak public,static,final olurlar
    public static final double PI=3.14;

    public abstract double perimeter();
    double area();

   default void threeDPrinter(){
        System.out.println("3 boyutlu Class'lar icindir");
    }

    default void displayInfo(){System.out.println("I'am shape interface");}

    static void staticMethod(){
        System.out.println("I'am a static method from Shape interface");
    }
}
