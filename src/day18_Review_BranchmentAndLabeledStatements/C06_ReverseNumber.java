package day18_Review_BranchmentAndLabeledStatements;

import java.util.Scanner;

public class C06_ReverseNumber {
    public static void main(String[] args) {
        // verilen sayiyi tersten yazan bir dongu yaziniz
        // 123 --> 321
        // 720 --> 27 // while loop

        Scanner scanner=new Scanner(System.in);
        System.out.print("Lutfen bir tam sayi giriniz : ");
        int sayi = scanner.nextInt();
        int tersSayi = 0;

        while (sayi != 0){
            int sonHane = sayi % 10;
            System.out.println("sonHane = " + sonHane);
            tersSayi = tersSayi *10 + sonHane;
            sayi /= 10;

            System.out.println("tersSayi = " + tersSayi);
        }



    }
}
