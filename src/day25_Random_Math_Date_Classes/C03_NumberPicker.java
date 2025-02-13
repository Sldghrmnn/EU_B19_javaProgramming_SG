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



    }
}
