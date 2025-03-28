package day49_Interface_Enum_DataClass.Shape;

public class ShapeTest {
    public static void main(String[] args) {

        Circle daire = new Circle("Cember","Beyaz",3);
        System.out.println("daire.perimeter() = " + daire.perimeter());
        System.out.println("daire.area() = " + daire.area());
        System.out.println("daire.getName() = " + daire.getName());
        System.out.println();

        Rectangle kare = new Rectangle("Kare","Mavi",2,2);
        System.out.println("kare.area() = " + kare.area());
        System.out.println("kare.perimeter() = " + kare.perimeter());
        System.out.println("kare.getName() = " + kare.getName());

        kare.displayInfo();
    }
}
