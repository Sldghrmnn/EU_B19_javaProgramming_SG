package day17_DDoWhileLoops;

import java.util.Random;
import java.util.Scanner;

public class C07_SayiTahminOyunu_2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        int randomSayi= random.nextInt(0,100); // 100 degil

        //System.out.println("Random sayi : "+randomSayi);
        int girilenSayi=0;
        int denemeSayisi=1;
        do {
            System.out.print("Lutfen 1-99 araliginda bir sayi giriniz : ");
            girilenSayi=scanner.nextInt();
            if (girilenSayi<randomSayi)
                System.out.println("Kucuk bir sayi girdiniz! \n Deneme sayisi : " +denemeSayisi);
            else if (girilenSayi>randomSayi)
                System.out.println("Buyuk bir sayi girdiniz! \n Deneme sayisi : " +denemeSayisi);
            else
                System.out.println("Bravooo! Sayiyi buldunuz! \n Deneme sayisi : " +denemeSayisi);
            denemeSayisi++;
        }while (girilenSayi != randomSayi);
    }
}
