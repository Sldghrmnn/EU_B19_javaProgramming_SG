package day13_Ternary;

import java.util.Scanner;

public class C13_HomeWork5 {
    public static void main(String[] args) {

  //  Soru 5- Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin

        Scanner veriGir = new Scanner(System.in);
        System.out.println("Lutfen 1. sayiyi giriniz : ");
        int sayi1 = veriGir.nextInt();
        System.out.println("Lutfen 2. sayiyi giriniz : ");
        int sayi2 = veriGir.nextInt();

        int kucukSayi = sayi1 < sayi2 ? sayi1 : sayi2;
        System.out.println("Girdiginiz sayilardan kucuk olan : " +kucukSayi+" dir.");
    }
}
