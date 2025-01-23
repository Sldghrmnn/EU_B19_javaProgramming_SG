package day13_Ternary;

import java.util.Scanner;

public class C10_HomeWork2 {
    public static void main(String[] args) {
        //  Soru 2- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
        //        “Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.

        Scanner esKenar = new Scanner(System.in);
        System.out.println("1. Kenar uzunlugunu yaziniz : ");
        int kenar1 =esKenar.nextInt();
        System.out.println("2. Kenar uzunlugunu yaziniz : ");
        int kenar2 =esKenar.nextInt();
        System.out.println("3. Kenar uzunlugunu yaziniz : ");
        int kenar3 =esKenar.nextInt();

        String sonuc = kenar1 == kenar2 && kenar2 == kenar3 ? "Eskanar ucgendir ." :" Eskenar ucgen degildir.";
        System.out.println("sonuc = " + sonuc);


    }
}
