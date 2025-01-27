package day12_Switch_Case;

import java.util.Scanner;

public class C03_SwitchWeekDays {
    public static void main(String[] args) {


        System.out.println("Switch case statement in Java");

        Scanner input = new Scanner(System.in);
        System.out.println("Gün numarasını giriniz (1-7) : ");
        int day = input.nextInt();

        String gunAdi = "";
        String gunTipi = "";

        switch (day){
            case 1 -> gunAdi = "Pazartesi";
            case 2 -> gunAdi = "Salı";
            case 3 -> gunAdi = "Çarşamba";
            case 4 -> gunAdi = "Perşembe";
            case 5 -> gunAdi = "Cuma";
            case 6 -> gunAdi = "Cumartesi";
            case 7 -> gunAdi = "Pazar";
          //  default -> System.out.println("Geçersiz gün bilgisi!!!");
        }
        if (gunAdi != ""){
            System.out.println("Haftanın "+gunAdi+ " günüdür. ");
        }
//////////////////////////
        switch (day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                gunTipi = "Haftaiçi";
                break;
            case 6:
            case 7:
                 gunTipi = "Haftasonu";
                 break;
               default:
                    System.out.println("Geçersiz gün bilgisi!!!");
        }

        if (gunAdi != ""){
            System.out.println("Haftanın "+gunAdi+ " günüdür. Ve "+gunTipi+ "'dir.");
        }





    }
}
