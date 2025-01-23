package day12_Switch_Case;

import java.util.Scanner;

public class C12_odev_bes {
    public static void main(String[] args) {
 /*       task 4
        Write a program to display months:
        1-January
        2-February
        3-March
        4-April
        5-May
        6-June
        7-July
        8-August
        9-September
        10-October
        11-November
        12-December

  */


        Scanner input = new Scanner(System.in);
        System.out.println("Ay sirasini giriniz (1-12) : ");
        int aySirasi = input.nextInt();


        String ayAdi = "";
        String mevsimAdi = "";

        switch (aySirasi) {
            case 1 -> ayAdi = "Ocak";
            case 2 -> ayAdi = "Subat";
            case 3 -> ayAdi = "Mart";
            case 4 -> ayAdi = "Nisan";
            case 5 -> ayAdi = "Mayis";
            case 6 -> ayAdi = "Haziran";
            case 7 -> ayAdi = "Temmuz";
            case 8 -> ayAdi = "Agustos";
            case 9 -> ayAdi = "Eylul";
            case 10 -> ayAdi = "Ekim";
            case 11 -> ayAdi = "Kasim";
            case 12 -> ayAdi = "Aralik";
            default -> System.out.println("Gecersiz Ay bilgisi !!!");
        }

        switch (aySirasi) {
            case 12, 1, 2 -> mevsimAdi = "Kis";
            case 3, 4, 5 -> mevsimAdi = "Ilkbahar";
            case 6, 7, 8 -> mevsimAdi = "Yaz";
            case 9, 10, 11 -> mevsimAdi = "Sonbahar";


            default -> System.out.println("Gecersiz Mevsim bilgisi !!!");
        }
        if (ayAdi != "") {
            System.out.println("Aylardan  " + ayAdi + "'dir. Ve " + mevsimAdi + "'dir.");
        }

    }
}
