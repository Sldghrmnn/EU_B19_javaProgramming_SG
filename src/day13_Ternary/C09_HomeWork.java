package day13_Ternary;

import java.util.Scanner;

public class C09_HomeWork {
    public static void main(String[] args) {

 // Soru 1- Kullanicidan bir sayi isteyin, sayiyi kontrol edip 5 ile bolunebiliyorsa “Sayi 5’in tam kati” yazdirin.

        Scanner birSayi = new Scanner(System.in);

        System.out.print("Lutfen bir sayi giriniz : ");
        int sayi = birSayi.nextInt();

        if (sayi % 5 == 0){
            System.out.println(sayi+" 5'in tam katidir.");
        }else {
            System.out.println("Sayiniz 5'in katlarina ait degildir.");
        }







    }
}

