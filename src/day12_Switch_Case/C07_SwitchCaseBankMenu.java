package day12_Switch_Case;

import java.util.Scanner;

public class C07_SwitchCaseBankMenu {
    public static void main(String[] args) {

        System.out.println("ABC Bankasina hos geldiniz ");
        System.out.println("----------------------------------");

        Scanner input = new Scanner(System.in);
        System.out.println("1- Bakiye goruntuleme");
        System.out.println("2- Para cekme");
        System.out.println("3- Para yatirma");
        System.out.println("4- Cikis");

        System.out.println("Yapacaginiz islem numarasini giriniz : ");

        int secim = input.nextInt();
        int bakiye = 5000;

        switch (secim){
            case 1 :
                System.out.println("Bakiyeniz = " +bakiye+ " TL");
                break;
            case 2 :
                System.out.println("Cekeceginiz para miktarini giriniz --->");
                int miktar = input.nextInt();
                if (miktar > bakiye){
                    System.out.println("yetersiz bakiye...!");
                    System.out.println("En fazla cekebileceginiz miktar = " +bakiye+ " TL");
                }else{
                    bakiye -= miktar;
                    System.out.println("Guncel bakiyeniz = " +bakiye+" TL");
                }
                break;
            case  3 :
                System.out.println("Yatiracaginiz  para miktarini giriniz --->");
                int yatirilanMiktar = input.nextInt();
                bakiye += yatirilanMiktar;
                System.out.println("Guncel bakiyeniz = " +bakiye+" TL");

            case 4 :
                System.out.println("Bankamizi tercih ettiginiz icin tesekkurler...");
                break;
            default:
                System.out.println("gecersiz islem...!");
        }






    }
}
