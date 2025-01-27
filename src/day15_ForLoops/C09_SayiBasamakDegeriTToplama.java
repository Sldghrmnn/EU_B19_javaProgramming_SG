package day15_ForLoops;

import java.util.Scanner;

public class C09_SayiBasamakDegeriTToplama {
    public static void main(String[] args) {
        // klavye'den sayinin basamak degeri toplmini veren kod ?
        // ornegin: 123 ---> 1+2+3 =6
        //45897 ---> 4+5+8+9+7 =33
        // 100000000 ----> 1+0+0+.... = 1


        //meraklisina : ayni loop icinde basamak sayisini da bulabilirsiniz.


        int sayi = 479895;
        int basamakToplam = 0;

        for (int i = 0; sayi > 0 ;  sayi /=10){
            basamakToplam += sayi % 10;
        }

        System.out.println("Basamaklarin Toplami = " + basamakToplam+"'dir.");

        System.out.println("-----------------");

        int sayi1 = 479895;
        int basamakToplam1 = 0;
        int basamakSayisi = 0;

        for (int i = 0; sayi > 0 ;  sayi /=10){
            basamakToplam += sayi % 10;
            basamakSayisi++;
        }

        System.out.println("Basamak degerlerinin  Toplami = " + basamakToplam+"'dir.");
        System.out.println("basamakSayisi = " + basamakSayisi);


    }
}
