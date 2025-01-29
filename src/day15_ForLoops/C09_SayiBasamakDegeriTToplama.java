package day15_ForLoops;

import java.util.Scanner;

public class C09_SayiBasamakDegeriTToplama {
    public static void main(String[] args) {

        // klavye'den sayinin basamak degeri toplmini veren kod ?
        // ornegin: 123 ---> 1+2+3 =6
        //45897 ---> 4+5+8+9+7 =33
        // 100000000 ----> 1+0+0+.... = 1
        //meraklisina : ayni loop icinde basamak sayisini da bulabilirsiniz.
        // input 'bu' ise output 'budur'...girilen ve sonuc!

        //1. step input al

        Scanner input=new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz : ");
         int number= input.nextInt();
        System.out.println("number = " + number);

        //2. loop icerisinde inputun uzunlugunu kaydet
        //3.loop icerisinde her bir basamagin degerini alarak bir degiskende tut

        int basamakSayisi = 0;
        int basamakDegerleriToplami = 0;
        for (int i = number; 0 < i;){

            // 123
            // 163%10=3, 18954%10=4
            // %10 :10'a bolumunden kalanini verecek
            // number%10=3
            // number =number/10=12
            // number%10=2
            // number=number/10=1
            // number%10=1
            // number=number/10=0

            basamakSayisi++;
            basamakDegerleriToplami += i % 10;
            i /=10; //i= i/10
        }
        //4. print basamak degerleri toplamini ve basamak sayisini yazdir

        System.out.println("basamakSayisi = " + basamakSayisi);
        System.out.println("basamakDegerleriToplami = " + basamakDegerleriToplami);


    }
}
