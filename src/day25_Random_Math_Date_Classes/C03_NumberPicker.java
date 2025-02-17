package day25_Random_Math_Date_Classes;

import java.util.Random;
import java.util.Scanner;

public class C03_NumberPicker {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen 1-10 arasi bir sayi giriniz : ");
        int hedefSayi = scanner.nextInt();

        System.out.println("Bu program kac denemede tuttugunuz sayiyi buldugunu gosterir");

        Random random= new Random();

        int denemeSayisi = 0;

        while (true){
            denemeSayisi++;
            int randomSayi = random.nextInt(10)+1;
            System.out.println(denemeSayisi+"----> "+randomSayi);

            if (randomSayi == hedefSayi){
                System.out.println("Tuttugunuz sayi olan "+hedefSayi+"---> "+denemeSayisi+" denemede bulunmustur.");
                break;
            }
        }

        System.out.println("-----------------------------------");

        //konsoldan bir sayi veriniz ve max 3 tahminde bunu random da bulmasini isteyiniz.
        // bulamazsa üzgünüm dogru tahmin edemediniz! desin...

        Scanner sc = new Scanner(System.in);
        Random random1 = new Random();
        System.out.print("1 ila 10 arasinda bir sayi secin : ");
        int sayi = sc.nextInt();

        int deneme = 0;
        int denemeHakki = 3;
        int rastGeleSayi;

        do {
            rastGeleSayi = random.nextInt(10)+1;
            deneme++;
            System.out.println("Uretilen sayi : "+rastGeleSayi);

            if (rastGeleSayi == sayi){
                System.out.println("Tebrikler ! Sayiniz "+deneme+". denemede bulundu.");
                return;
            }
        }while (deneme < denemeHakki);

        System.out.println("Uzgunum, "+denemeHakki+" denemede sayinizi bulamadim...");




    }
}
