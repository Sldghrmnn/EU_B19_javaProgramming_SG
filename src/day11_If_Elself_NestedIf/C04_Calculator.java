package day11_If_Elself_NestedIf;

import java.util.Scanner;

public class C04_Calculator {
    public static void main(String[] args) {

//+,-,*,/
// 4 işlem yapacak şekilde bir hesap makinesi yapın
// kullanıcıdan 2 sayı alın
//yapmak istediği işlemi seçsin +,-,*,/
//hatalı işlem girişlerinde kullanıcıya uyarı verin
//ekrana sonuç döndüren programı yazınız.

        Scanner scan=new Scanner(System.in);

        System.out.println("sayi 1: " );
        double sayi1=scan.nextDouble();

        System.out.println("sayi 2: ");
        double sayi2=scan.nextDouble();

        System.out.println("Lutfen yapilacak islemi yaziniz : ");
        String islem=scan.next();

       // islem == +-*/

        if (islem.equals("+")){
            System.out.println(sayi1+sayi2);
        }else if (islem.equals("-")){
            System.out.println(sayi1-sayi2);
        }else if (islem.equals("*")){
            System.out.println(sayi1*sayi2);
        }else if (islem.equals("/")){
            System.out.println(sayi1/sayi2);
        }else {
                System.out.println("Hatali islem girdiniz");
        }




                }
            }