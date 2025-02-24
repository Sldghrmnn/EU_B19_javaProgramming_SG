package day30_Arrays01;

import java.util.Scanner;

public class C08_AlisVeris {
    public static void main(String[] args) {
// Dongu kullanarak, kullanicidan urunleri almak kaydiyla bir urun listesi olusturunuz

        System.out.println("Alisveris Listesi.....");

        String [] sepet = new String[5];

        Scanner sc = new Scanner(System.in);

        System.out.println("Lutfen sepetinize urun ekleyiniz");

        for (int i = 0; i < sepet.length; i++) {
            System.out.println(i+1+". urunu ");
            sepet[i] =sc.nextLine();
        }

        System.out.println("Sectiginiz urun Listesi ");

        for (int i = 0; i <sepet.length ; i++) {
            System.out.println(i+1+". urun :"+sepet[i]);
        }
    }
}
