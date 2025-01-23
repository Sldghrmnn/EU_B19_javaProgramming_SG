package day08_Assignment_Relational_Logical_Operators;

public class C05_SwappingTwoNumbers {
    public static void main(String[] args) {

    // verilen iki sayinin degerlerini birbiryle degistiren kod nedir ?

    int sayi1= 15;
    int sayi2= 33;
        System.out.println("sayi1 = " + sayi1);
        System.out.println("sayi2 = " + sayi2);

    // 1. cözüm   // gecici bir 3. degisken kullanilarak.

    int temp;                // gecici bir deegisken !
    temp=sayi1;
    sayi1= sayi2;
    sayi2= temp;
        System.out.println("sayi1 = " + sayi1);
        System.out.println("sayi2 = " + sayi2);

    // 2. cözüm
        sayi1= 15;
        sayi2= 33;

    sayi1 += sayi2;            // 48
    sayi2 = sayi1 - sayi2;     // 15
    sayi1 -= sayi2;            // 33

        System.out.println("sayi1 = " + sayi1);
        System.out.println("sayi2 = " + sayi2);


    }
}
