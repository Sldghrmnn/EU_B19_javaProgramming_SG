package day15_ForLoops;

import java.util.Scanner;

public class C06_Faktoriyel {
    public static void main(String[] args) {

     // girilen sayinin faktoriyel degerini bulunuz.faktoriyel deger carparak ilerler!

        Scanner scanner = new Scanner(System.in);
        System.out.println("Faktoriyeli alinacak poz. tam sayiyi aliniz : ");
        int girilenSayi =scanner.nextInt();
        int sonuc = 1;

        for (int i = 1; i <= girilenSayi; i++){
            sonuc *= i;
        }
        System.out.println("sonuc = " + sonuc);


    }
}
