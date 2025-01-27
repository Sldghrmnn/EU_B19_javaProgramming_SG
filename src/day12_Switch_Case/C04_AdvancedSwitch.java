package day12_Switch_Case;

import java.util.Scanner;

public class C04_AdvancedSwitch {
    public static void main(String[] args) {

        System.out.println("Switch case statement in Java");
        Scanner input=new Scanner(System.in);
        System.out.println("Gun numarasini giriniz (1-7) : ");
        int day=input.nextInt();

        String gunAdi="";
        String gunTipi="";

        switch (day){
            case 1 -> gunAdi="Pazartesi";
            case 2 -> gunAdi="Sali";
            case 3 -> gunAdi="Carsamba";
            case 4 -> gunAdi="Persembe";
            case 5 -> gunAdi="Cuma";
            case 6 -> gunAdi="Cumartesi";
            case 7 -> gunAdi="Pazar";
            default -> System.out.println("Gecersiz gun bilgisi");

        }

        /// /////////////////////////////////////////////

        switch (day){
            case 1,2,3,4,5 -> gunTipi="Haftaici";
            case 6,7-> gunTipi="Haftasonu";
            default ->  System.out.println("Gecersiz gun bilgisi !!!");
        }
        if (gunAdi != ""){
            System.out.println("Haftanın "+gunAdi+ " günüdür. Ve "+gunTipi+ "'dir.");
        }
    }
}
