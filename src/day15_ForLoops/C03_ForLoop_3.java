package day15_ForLoops;

import java.util.Scanner;

public class C03_ForLoop_3 {
    public static void main(String[] args) {
       // dongü 0'dan 10'a kadar
        for (int i = 0 ; i <= 10 ; i++) {
            System.out.println("i = " + i);
        }
        System.out.println("----------------------------");

        // dongu 10 dan 0 a index i yazdirin
        for (int i = 10; i >= 0 ; i--) {
            System.out.println("i = " + i);
        }
        System.out.println("-----------------------------");

        // 28 den 97 ye sayilari 8'er yazdiralim
        for (int i = 28 ; i <= 97 ; i += 8) {
            System.out.println("i = " + i);
        }
        System.out.println("-------------------------------");

        //97 den 28 e 8 er yazdir
        for (int i = 97 ; i >= 28 ; i -= 8) {
            System.out.println("i = " + i);
        }
        System.out.println("-----------------------------");
        // 1 den 50 ye sayilarin toplami
        // gauss formulu -> 1 den n e kadar sayilarin toplami: n*(n+1)/2

        System.out.println(50*51/2);
        int sonuc = 0;

        for (int i = 1 ; i <= 50 ; i ++) {
            sonuc += i;
        }
        System.out.println("sonuc = " + sonuc);

        // verilen sayiya kadar olan sayilari toplayan kodu yaziniz
        //Scanner kullanalim.
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz : ");
        int girilenSayi = input.nextInt();
        int toplam = 0;
        for (int i = 1 ; i <= girilenSayi; i++){
            toplam += i;
        }
        System.out.println(" 'e ye kadar olan saayilarin toplami  = " + toplam);


    }
}
