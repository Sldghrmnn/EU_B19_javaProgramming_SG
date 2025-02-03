package day18_Review_BranchmentAndLabeledStatements;

import java.util.Scanner;

public class C18_SwitchContinueLabeled {
    public static void main(String[] args) {
        // bankacilik menuleri hazirlayalim
        //switch  case yapisi icerisdinde labeled ifadeler ile menuler arasinda gezinelim

        /**
         * anamenu
         * bankaIslemleri
         * krdiKartiIslemleri
         */
        Scanner klavye=new Scanner(System.in);
        int secenek;
        anaMenu:
        while (true){
            System.out.println("-----------------------");
            System.out.println("------Ana Menu---------");
            System.out.println(" 1- Bankacilik Islemleri");
            System.out.println(" 2- Kredi Karti Islemleri ");
            System.out.println(" 3- Cikis");
            System.out.println("---------------------------");
            System.out.println("Seciminiz +++++++++++++>");
            secenek = klavye.nextInt();

            switch (secenek){
                case 1 :
                    bankaIslem:
                    while (true){
                        System.out.println("-----------------------");
                        System.out.println("------Bankacilik Menu---------");
                        System.out.println(" 1- Para cekme");
                        System.out.println(" 2- Para yatirma ");
                        System.out.println(" 3- Ana menu");
                        System.out.println(" 4- Cikis");
                        System.out.println("------------------------");
                        System.out.println("Seciminiz +++++++++++++>");
                        secenek = klavye.nextInt();
                        switch (secenek){
                            case 1:
                                System.out.println("Cekeceginiz miktari giriniz : ");
                                int miktar = klavye.nextInt();
                                System.out.println(miktar+" TL para cekme islemi gerceklestirildi.");
                            case 2:
                                System.out.println("Yatircaginiz para  miktarini  giriniz : ");
                                 miktar = klavye.nextInt();
                                System.out.println(miktar+" TL para yatirma islemi gerceklestirildi.");
                            case 3:
                                continue anaMenu;
                            case 4:
                                break anaMenu;
                            default:
                                System.out.println("<<<<<<<Yanlis Secim>>>>>>>");

                        }
                    }
                case 2:
                while (true) {
                    System.out.println("-----------------------");
                    System.out.println("------Kredi karti Menu---------");
                    System.out.println(" 1- Ekstra Goruntuleme");
                    System.out.println(" 2- Kredi Karti Sifre degistirme ");
                    System.out.println(" 3- Kredi Karti Borc odeme");
                    System.out.println(" 4- Ana Menu");
                    System.out.println(" 5- Cikis");
                    System.out.println("------------------------");
                    System.out.println("Seciminiz +++++++++++++>");
                    secenek = klavye.nextInt();
                    switch (secenek) {
                        case 1:
                            System.out.println("Kreedi karti ekstraniz asagidaadir.");
                        case 2:
                            System.out.print("Yeni sifrenizi giriniz :");
                            int yeeniSifre = klavye.nextInt();
                            System.out.println("Sifreniz guncellendi");
                        case 3:
                            System.out.println("Odeme miktari giriniz :");
                            int miktar = klavye.nextInt();
                            System.out.println(miktar+" TL Kredi kartina yatirildi");
                            continue ;
                        case 4:
                            continue anaMenu;
                        case 5:
                            break anaMenu;
                        default:
                            System.out.println("<<<<<<<Yanlis Secim>>>>>>>");
                    }

                }
                case 3 :
                    break anaMenu;
                default:
                    System.out.println("<<<<<<<Yanlis Secim>>>>>>>");

            }

        }
        System.out.println("Bankamizi tercih ettiginiz icin Tesekkurler!!!");























    }
}
