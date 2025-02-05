package day19_Methods1;

import java.util.Scanner;

public class C02_BuyukSayi {
    public static void main(String[] args) {

        buyukSayi();
        buyukSayi();
    }
    /**
     * girilen 2 sayidan buyuk olanini yazdiran metod nedir?
     */

    public static void buyukSayi(){
        Scanner input = new Scanner(System.in);
        System.out.println("Iki tane sayi giriniz : ");
        int sayi1 = input.nextInt();
        int sayi2 = input.nextInt();

        if (sayi1 >= sayi2){
            System.out.println(sayi1+" buyuk olan sayidir");
        }else {
            System.out.println(sayi2+" buyuk olan sayidir");
        }
    }
}
