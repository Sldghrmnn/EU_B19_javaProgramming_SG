package day18_Review_BranchmentAndLabeledStatements;

import java.util.Scanner;

public class C20_whileLoopTamSayilar {
    public static void main(String[] args) {
 //  Soru 4- Kullanicidan bir sayi ve hesaplamak istedigi ussunu isteyin.
        // While loop kullanarak verilen sayinin istenen ussunu hesaplayip yazdirin.

        Scanner input =new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz : ");
        int sayi = input.nextInt();

        System.out.print("Lutfen üst degerini giriniz : ");
        int us = input.nextInt();

        int sonuc = 1;
        int sayac = 0;

        while (sayac < us){
            sonuc *= sayi;
            sayac++;
        }
        System.out.println(sayi + "^" + us +" = " +sonuc);

        System.out.println("-------------------------------------------------------------");
        //Soru 5- Kullanicidan bir pozitif sayi isteyin, verilen sayı tam kare değilse kullanıcı sayı girmeye devam etsin, tam kare ise
        //: “Girilen sayı 2 sayısının tam karesidir.” yazdırsın..
        //Ornek : input : 16,  output : Girilen sayı 4 sayısının tam karesidir.

        Scanner sc=new Scanner(System.in);

        int sayi1;
        while (true){
            System.out.print("Lutfen bir pozitif sayi giriniz : ");
            sayi1 = sc.nextInt();
            if (sayi <=0){
                System.out.println("Pozitif bir sayi giriniz : ");
                continue;
            }
            boolean tamKareMi = false;
            int kareKok = 1;
            while (kareKok * kareKok <= sayi1){
                if (kareKok * kareKok == sayi1){
                    tamKareMi = true;
                    break;
                }
                kareKok++;
            }
            if (tamKareMi){
                System.out.println("Girilen sayi "+ kareKok+" sayisinin tam karesidir.");
                break;
            }else {
                System.out.println(sayi1+" Tam kare degil, lutfen tekrar deneyin !!!");
            }
        }














    }
}
