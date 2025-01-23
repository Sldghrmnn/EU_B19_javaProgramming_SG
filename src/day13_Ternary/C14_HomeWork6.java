package day13_Ternary;

import java.util.Scanner;

public class C14_HomeWork6 {
    public static void main(String[] args) {
// Soru 6- Kullanicidan bir sayi alin ve mutlak degerini yazdirin.//sayi 1 ile 4 arasi deger alir

        Scanner sayi = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz : ");
        int sayi1 = sayi.nextInt();

        int mutlakDeg = sayi1 >= 0 ? sayi1 : -sayi1;

        System.out.println("Bu sayinin mutlak degeri : " +mutlakDeg);
    }
}
