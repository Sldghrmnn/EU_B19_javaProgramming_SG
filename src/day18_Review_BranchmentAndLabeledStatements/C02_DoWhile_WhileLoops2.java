package day18_Review_BranchmentAndLabeledStatements;

import java.util.Scanner;

public class C02_DoWhile_WhileLoops2 {
    public static void main(String[] args) {
        /**
         * kosulun bastan bilindigi durumlarda ve döngunun hic calismama ihtimali oldugunda
         * While kullanilir.
         * orn: kullanicidan gecerli bir sayi girmesi istendiginde
         */
        Scanner sc=new Scanner(System.in);
        int sayi=0;

        while (sayi <=0){
            System.out.println("Lutfen pozitif bir sayi giriniz : ");
            sayi= sc.nextInt();
        }
        System.out.println(sayi+" girilmistir.");

        /**
         * kullaniciya bir menu bilgisi verilmek istendiginde
         * Do-While kullaniriz.kullanici hatali girse bile menuyu gorur.
         */

        int secim;
        do {
            System.out.println("1- Basla");
            System.out.println("2- Cikis");
            secim= sc.nextInt();
        }while (secim !=1 && secim !=2);

        System.out.println("Secilen menu : "+secim);
    }
}
