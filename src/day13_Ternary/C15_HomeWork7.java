package day13_Ternary;

import java.util.Scanner;

public class C15_HomeWork7 {
    public static void main(String[] args) {
 //   soru 7- Kullanicidan isim, yas ve  adayin ise secilip secilmedigini yazdirin. secildiyse
  //   ORN : Merhaba  Sn.Selda Simsek ,QA Muhendisi olarak secildiniz .
 //         secilmediyse
 //     orn : Merhaba Sn.Selda Simsek , malesef QA Muhendisi olarak secilmediniz.

        Scanner veriGir = new Scanner(System.in);
        System.out.println("Lutfen Adinizi ve Soyadinizi giriniz : ");
        String adSoy = veriGir.nextLine();
        System.out.println("Lutfen yasinizi giriniz : ");
        int yas = veriGir.nextInt();

        String mesaj = yas >= 18 ? "Sayin "+adSoy+" QA Muhendisi olarak secildiniz . " :"Sayin "+adSoy+" malesef QA Muhendisi olarak secilmediniz.";
        System.out.println("mesaj = " + mesaj);
    }
}
