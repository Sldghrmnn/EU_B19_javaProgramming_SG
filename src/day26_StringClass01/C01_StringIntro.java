package day26_StringClass01;

import day22_ClassObject.Car;

public class C01_StringIntro {
    public static void main(String[] args) {
        System.out.println("Java'da String bir poroje uretmek");
        // 1. By String literal vaw
        //    Stack =   Heap(String Pool)
        String str1 = "Java";
        String str3 = "Java";
        System.out.println("str1 ----->"+System.identityHashCode(str1));
        System.out.println("str3 ----->"+System.identityHashCode(str3));



        //2. By new keyword (new String ())
        //     stack              Heap
        String str2 = new String("Merhaba");
        String str4 = new String("Merhaba");

        System.out.println("str2 ----->"+System.identityHashCode(str2));
        System.out.println("str4 ----->"+System.identityHashCode(str4));

        System.out.println(str1 == str3);  //true
        System.out.println(str2 == str4); //falce
        System.out.println(str2.equals(str4)); //true

        //String bir degiskende 2 metnin ayni metin olup olmadigini
        //kontrol etmek isterseniz equals() methodunu kullanmalisiniz

        Car car=new Car();
        car.marka="Tesla";
        car.model="Model X";
        car.dur();



    }
}
