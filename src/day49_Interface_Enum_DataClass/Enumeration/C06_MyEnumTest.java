package day49_Interface_Enum_DataClass.Enumeration;

import java.util.Arrays;

public class C06_MyEnumTest {
    public static void main(String[] args) {

        C05_MyEnum.Brands arabaMarka = C05_MyEnum.Brands.HONDA;

        System.out.println(arabaMarka.ordinal());

        System.out.println(arabaMarka.name());
        System.out.println(arabaMarka);

        C05_MyEnum.Days[] values = C05_MyEnum.Days.values();

        System.out.println("Arrays.toString(values) = " + Arrays.toString(values));

        C05_MyEnum.Colors color = C05_MyEnum.Colors.RED;

        System.out.println("color.ordinal() = " + color.ordinal());
        System.out.println("color.name() = " + color.name());




    }
}
