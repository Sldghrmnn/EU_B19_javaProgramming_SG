package day12_Switch_Case;

import java.util.Scanner;

public class C09_odev_iki {
    public static void main(String[] args) {
/*
 Kullanicidan aldigi urun adedi ve urun fiyatini alin,
 kullaniciya musteri karti olup olmadigini sorun.
 Musteri karti varsa
10 urun veya fazla alirsa %20,
 10 urunden az alirsa %15 indirim yapin,
 Musteri karti yoksa
 10 urun veya fazla alirsa %15,
 10 urunden az %10 indirim yapin
*/


        Scanner scanner = new Scanner(System.in);
        System.out.println("Aldiginiz urunu adedini yaziniz : ");
        int urunAdedi = scanner.nextInt();
              // System.out.println("urunAdedi = " + urunAdedi);
        System.out.println("Aldiginiz urunun fiyati : ");
        double urunFiyati = scanner.nextDouble();


        System.out.println("Musteri kartiniz var mi ?   Evet / Hayir ");
        String musKarti = scanner.next();
       if (musKarti.equalsIgnoreCase("evet")){
           if (urunAdedi>=10){
               System.out.println("Urunlerinize %20 indirim uygulandi. ");
               urunFiyati-=(urunFiyati*0.2);
           }if (urunAdedi<10  && urunAdedi>0){
               System.out.println("Ureunleriinie %15 indirim uygulandi. ");
               urunFiyati-=(urunFiyati*0.15);
           }
       }else if (musKarti.equalsIgnoreCase("hayir")){
           if (urunAdedi>=10){
               System.out.println("Urunlerinize %15 indirim uygulandi. ");
               urunFiyati-=(urunFiyati*0.15);
           }if (urunAdedi<10  && urunAdedi>0){
               System.out.println("Ureunleriinie %1 indirim uygulandi. ");
               urunFiyati-=(urunFiyati*0.1);
           }
       }
        double toplamTutar = urunAdedi*urunFiyati;
              // System.out.println("tOplamTutar = " + toplamTutar);
        System.out.println("Tutar " +toplamTutar+"TL'dir.");

    }
}
