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
            default -> System.out.println("Geçersiz gün bilgisi!!!");
        }
//////////////////////////
        switch (day){
            case 1,2,3,4,5 -> gunTipi = "Haftaiçi";
            case 6,7 -> gunTipi = "Haftasonu";
            default -> System.out.println("Geçersiz gün bilgisi!!!");
        }

        if (gunAdi != ""){
            System.out.println("Haftanın "+gunAdi+ " günüdür. Ve "+gunTipi+ "'dir.");
        }





    }
}
