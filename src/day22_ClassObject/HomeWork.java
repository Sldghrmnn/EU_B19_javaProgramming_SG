package day22_ClassObject;

public class HomeWork {
    public static void main(String[] args) {


        C01_Static_Math2.sayiKuvveti(3.0,4);
        System.out.println(C01_Static_Math2.sayiKuvveti(3.0,4));

        System.out.println("-----------------------------------");

        Math2 hesaplama= new Math2();
        System.out.println("hesaplama.pow(2.0,3) = " + hesaplama.pow(2.0, 3));


    }
}
