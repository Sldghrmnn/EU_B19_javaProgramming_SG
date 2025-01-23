package day14_Review;

import java.util.Scanner;

public class C08_IfBeden {
    public static void main(String[] args) {
        /*
        bu soruyu if le deneyin odev bedeni alin!
        beden numarasi alsin
        small 38,40,42
        medium 44,46,48
        large 50,52,54
        Example output : 50 numara bir large bendendir.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir benden numarasi  giriniz : ");
        int bedenNumarasi = scanner.nextInt();


        if (bedenNumarasi == 38 || bedenNumarasi == 40 || bedenNumarasi == 42) {
            System.out.println(bedenNumarasi + " bu Small bedendir.");
        } else if (bedenNumarasi == 44 || bedenNumarasi == 46 || bedenNumarasi == 48) {
            System.out.println(bedenNumarasi + " bu Medium bedendir.");
        } else if (bedenNumarasi == 50 || bedenNumarasi == 52 || bedenNumarasi == 54) {
            System.out.println(bedenNumarasi + " bu Large bedendir.");
        } else {
            System.out.println("Gecersiz beden numarasi girdiniz .");
        }


    }

}
