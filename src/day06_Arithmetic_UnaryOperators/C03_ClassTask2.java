package day06_Arithmetic_UnaryOperators;

public class C03_ClassTask2 {
    public static void main(String[] args) {
     /*
        int i=10;
        int j=3;
        int k=i/j;                             // 3.56..... gibi kusurati int atar kusurattan oncesini alir
        System.out.println("k = " + k);         // 3

     */

        // 4500 dakika kac saattir?

        int dk= 4500;
        int saat= dk/60;
        int kalanDk= dk % 60;
        System.out.println(dk+" dakika "+ saat+" saat "+kalanDk+" dakikadir");

        //31502 saniye kaç saat kaç dakika kaç saniyedir?
        // (1 saat 60 dakika 1 dakika 60 sn)

int totalSecond= 31502;
       //3600+3600+3600+.......+2502             3600 sn 1 saattir!
       //60+60+60+...........+altmistan kucuk kalan sayi
int hour= totalSecond / 3600;
int min= totalSecond % 3600/60;
int second= totalSecond % 60;

        System.out.println(totalSecond+" saniye "+ hour+" saat " + min+" dakika " + second+" saniyedir.");












    }
}
