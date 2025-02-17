package day26_StringClass01;

import java.util.Locale;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        /*
        herhangi bir metin tersten'de ayni metin ise bu metne palindrom denir
        kullanicidan bir metin alin, metin palindrome ise true degilse false yazdirin....
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Bir metin giriniz ve Palindrom olup olmadigini kontrol edelim... ");
        String metin = sc.nextLine();

        String tersMetin ="";

        for (int i = metin.length()-1; i >=0 ; i--) {
            tersMetin += metin.charAt(i);
        }
        System.out.println("tersMetin = " + tersMetin);
        boolean palindromMu = metin.equals(tersMetin);

        System.out.println("palindromMu = " + palindromMu);

        sc.close();

    }
}
