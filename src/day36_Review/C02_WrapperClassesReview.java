package day36_Review;

import java.util.ArrayList;
import java.util.Arrays;

public class C02_WrapperClassesReview {
    public static void main(String[] args) {
        Integer i;
        Byte b;
        Short s;
        Double d;
        Float f;
        Boolean bl;
        Character ch;
        Long l;
        //Primitive data türlerinin objeye donusmus hali

        // Boxing
        Integer intObje = Integer.valueOf(10);

        //Auto boxing
        Integer intObje1 = 10;

        Integer obje = 25;

        //unboxing
        int y = obje.intValue();

        //Auto Unboxing
        int x = obje ;

        //Java Wrapper classlar ile primitive data türleri arasindaki
        //donusturme islemini otomatik yapar

        Integer[] arr = {2,3,5,62,-9};

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));

        //parse methodlari
        String str = "123";
        int z = Integer.parseInt(str);
        Integer w = Integer.parseInt(str);

        System.out.println("z+w = " +( z + w));

        double db= Double.parseDouble("25.25");
        System.out.println("db*25 = " + db * 25);

        // Max Min degerler

        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);

        //karsilastirma methodu compare()
        //Integer.compare(int x,int y);
        // x < y  --> -1
        // x == y --> 0
        // x > y  --> 1

        System.out.println("Integer.compare(10,20) = " + Integer.compare(10, 20)); //-1
        System.out.println("Double.compare(10,20) = " + Double.compare(5.2, 3.8)); //1
    }
}
