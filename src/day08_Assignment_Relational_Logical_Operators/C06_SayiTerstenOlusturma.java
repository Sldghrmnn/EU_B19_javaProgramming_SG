package day08_Assignment_Relational_Logical_Operators;

import java.util.Scanner;

public class C06_SayiTerstenOlusturma {
    public static void main(String[] args) {
        // ödev
        // verilen 3 basamakli sayiyi tersten olusturan kodu yaziniz
        // 123 ---> 321

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen üç basamaklı bir sayı girin, \n size o sayının tersini yazayım : ");

                        int sayi=123;
                        int sonBasamak=0;
                        int sayininSonHali=0;
      // ilk basamak icin
                                    sonBasamak=sayi%10;  //3
                                    sayininSonHali=sayininSonHali*10+sonBasamak;  //3
        //2.basamak icin
                                    sayi/=10;  //12
                                    sonBasamak=sayi%10;  //2
                                    sayininSonHali=sayininSonHali*10+sonBasamak;  //32
        //3.basamak icin
                                    sayi/=10;  //1
                                    sonBasamak=sayi%10;  //1
                                    sayininSonHali=sayininSonHali*10+sonBasamak;
        System.out.println(sayininSonHali);









    }
}
