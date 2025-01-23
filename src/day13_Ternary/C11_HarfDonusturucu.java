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

        }



    }
}
/*
int level =1;
String levelStr;

      switch (level){
        case 1 ->  levelStr= "A";
        case 2 ->  levelStr= "B";
        case 3 ->  levelStr= "C";
default -> levelStr= "E";
        };
*/