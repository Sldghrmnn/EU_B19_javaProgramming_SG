package day20_CustomMethods;

import java.util.Scanner;

public class C05_MethodsTasks {
    public static void main(String[] args) {

        dollarTlKuru(50);
        System.out.println(dollarTlKuru(50));
       // double dolar = 50;
       // double tl = dollarTlKuru(dolar);
       // System.out.println(dolar+" DolLar = " + tl + " TL'dir.");

        System.out.println("---------------------------------------------");

        kilogramiLibrayaCevir(5.0);
        System.out.println(kilogramiLibrayaCevir(5));
        //double kilogram= 5;
        //double lp = kilogramiLibrayaCevir(kilogram);

        //System.out.println(kilogram+" kg = " + lp + " (libra) lb'dir");

        System.out.println("---------------------------------------------");
        int sayi1 = 5;
        int sayi2 = -10;
        int sayi3 = 0;
        System.out.print(sayi1+"-->");
        sayininDurumunuGoster(sayi1);
        System.out.println();
        System.out.print(sayi2+"-->");
        sayininDurumunuGoster(sayi2);
        System.out.println();
        System.out.print(sayi3+"-->");
        sayininDurumunuGoster(sayi3);




    }
// 1. create a method that can convert dollar to TL rate:35.98 -return yap
// 2. create a method that can convert kg to lb 2.2            -return yap kg*2.2=lb
// 3. create a method that can determine if the given integer is positive, negative or zero -void yap

    /**
     * dolari kur hesabi uzerinden tl ye cevir
     *
     * @param dollarMiktari
     * @return
     */
    public static double dollarTlKuru(double dollarMiktari){
        double kurTl = 35.98;

        return dollarMiktari*kurTl;
    }

    /**
     * kilo yu libreye cevir kilo*2.2=lb
     *
     * @param kilogram
     * @return
     */


    public static double kilogramiLibrayaCevir(double kilogram){
        double katSayi = 2.2;

        return kilogram * katSayi;
    }


    public static void sayininDurumunuGoster(int  sayi){
        if (sayi>0){
            System.out.println(" Sayi Pozitif.");
        }else if (sayi<0){
            System.out.println("Sayi Negatif");
        }else {
            System.out.println("Sayi Sifir");
        }

    }

}
