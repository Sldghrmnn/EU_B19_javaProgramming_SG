package day30_Arrays01;

import java.util.Scanner;

public class C05_Aylar {
    public static void main(String[] args) {
        // Yilin aylarini gosteren bir array olusturarak,
        // kullanicidan aldiginiz dogdugu ayi bastiran bir code yaziniz

        String [] aylar = new String[12];

        aylar [0] = "Ocak";
        aylar [1] = "Subat";
        aylar [2] = "Mart";
        aylar [3] = "Nisan";
        aylar [4] = "Mayis";
        aylar [5] = "Haziran";
        aylar [6] = "Temmuz";
        aylar [7] = "Agustos";
        aylar [8] = "Eylul";
        aylar [9] = "Ekim";
        aylar [10] = "Kasim";
        aylar [11] = "Aralik";

        System.out.println("Lutfen dogdugunuz ayi rakam olarak  giriniz");
        Scanner scanner=new Scanner(System.in);
        int index = scanner.nextInt();

        if (index>0 && index<=12){
            System.out.println("Dogum ayiniz : "+aylar[index-1]);
        }else{
            System.out.println("Yanlis ay girisi yaptiniz !");
        }



    }
}
