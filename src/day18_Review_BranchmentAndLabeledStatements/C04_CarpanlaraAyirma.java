package day18_Review_BranchmentAndLabeledStatements;

import java.util.Scanner;

public class C04_CarpanlaraAyirma {
    public static void main(String[] args) {
        // bir sayinin carpanlarini yazdiran bir dongu kurgulayalim
        // 10 --> 1, 2, 5 ,10 kalansiz carpanlari

        Scanner scanner=new Scanner(System.in);
        System.out.print("Lutfen bir tam sayi giriniz : ");
        int sayi = scanner.nextInt();
        String carpanlar =" ";

        for (int i = 1; i <= sayi; i++){
            if (sayi % i == 0){
                carpanlar += i + " ";

            }
        }
        System.out.println("carpanlar = " + carpanlar);














    }
}
