package day26_StringClass01;

import java.util.Locale;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        /*
        herhangi bir metin tersten'de ayni metin ise bu metne palindrom denir
        kullanicidan bir metin alin, metin palindrome ise true degilse false yazdirin....
         */

        String kelime="anastas mum satsana";
        String terstenKelime="";

        for (int i = kelime.length()-1; i >=0 ; i--) {
            terstenKelime=terstenKelime.concat(kelime.substring(i,i+1));
        }
        boolean palindromMu=terstenKelime.equals(kelime);

        System.out.println("palindromMu = " + palindromMu);

    }
}
