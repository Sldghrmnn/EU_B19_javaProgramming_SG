package day49_Interface_Enum_DataClass.Enumeration;

public class C02_ColorsTest {
    public static void main(String[] args) {
        C01_Colors color;
        color = C01_Colors.GREEN;

        System.out.println(color);

        System.out.println("C01_Colors.valueOf(\"GREEN\") = " + C01_Colors.valueOf("GREEN"));
        C04_Araba araba = new C04_Araba(C01_Colors.RED,C03_Brands.FORD,2015);

        System.out.println(araba);
    }
}
