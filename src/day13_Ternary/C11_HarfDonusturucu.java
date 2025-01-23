package day13_Ternary;

import java.util.Scanner;

public class C11_HarfDonusturucu {
    public static void main(String[] args) {

 //Soru 3- Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
 //yoksa girilen harfi yazdirin

        Scanner veriGir = new Scanner(System.in);
        System.out.print("Lutfen bir harf yaziniz : ");
        String input = veriGir.next();
        char karakter = input.charAt(0);

        if (input.length() != 1){
            System.out.println("Lutfen bir karakter giiriniz : ");
        }else {
            String kucukHarf = input.toLowerCase();
            String buyukHarf = input.toUpperCase();
            if (input.equals(kucukHarf) && !input.equals(buyukHarf)){
                System.out.println("Donusturulmus harf : " +buyukHarf);
            }else{
                System.out.println("Girilen harf : " +input);
            }
        }



    }
}
