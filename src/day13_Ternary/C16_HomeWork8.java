package day13_Ternary;

import java.util.Scanner;

public class C16_HomeWork8 {
    public static void main(String[] args) {

 //  soru 8- Kullanicidan bir sayi isteyin ve tek sayimi cift sayi mi yazdirin
 //     orn: 331341 tek sayidir.

        Scanner sayi = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz : ");
        int sayi1 = sayi.nextInt();

        String sonuc = sayi1 % 2 ==0 ? sayi1+" cift sayidir ." : sayi1+" tek sayidir .";
        System.out.println("sonuc = " + sonuc);

    }
}
