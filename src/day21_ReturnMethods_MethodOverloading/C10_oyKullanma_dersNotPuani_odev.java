package day21_ReturnMethods_MethodOverloading;

import java.util.Scanner;

public class C10_oyKullanma_dersNotPuani_odev {
    public static void main(String[] args) {
      oyKullanmaSarti();

        System.out.println("----------------------");
        System.out.print("Bu dersten aldiginiz puan notunuz : ");
        System.out.println(puanNotu(78));


    }

    //	1. create return  method that can check if a person is eligible to vote
    //  Ex:
    //	eligibleToVote(19, "TR");
    //	output:
    //	You are not eligible to vote!
// bir kisinin oy kullanabilmesi icin uygun olup olmadigini belirten metodu yazin!
// 19 yasindan buyuk ve tc vatandas'i olmasi gerekiyor
// uuygun degiilse "oy kullanmaya uygun degilsiniz yazdirin!

public static void oyKullanmaSarti(){

    Scanner scanner=new Scanner(System.in);
    System.out.print("Lutfen yasinizi giriniz : ");
    int yas= scanner.nextInt();
    scanner.nextLine();
    if (yas<19){
        System.out.println("Resit degilsiniz, oy kullanamazsiniz...");
    }else {
        System.out.print("Lutfen vatandaslik durumunuzu giriniz (ornegin: TC) : ");
        String vatandaslik = scanner.nextLine();
        boolean tcVatandasi = vatandaslik.equalsIgnoreCase("TC");
        if (tcVatandasi) {
            System.out.println("Oyunuzu kulanabilirsiniz...");
        } else {
            System.out.println("Oy kullanmaya uygun degilsiniz...");
        }
    }
}

       //	5. create a method that returns calculate the grade of the student based on the
       // score >= 90 grade 'A'
       // score >= 80 grade 'B'
       // score >= 70 grade 'C'
       // score >= 60 grade 'D'
       // score < 60 grade 'F'

    //ogrencinin notunu puana gore hesaplayan bir metod yazin.
    // puan >= 90 not 'A' gibi

    public static char puanNotu(int puan){
        if (puan>=90 && puan <=100){
            return 'A';
        }else if (puan>=80 && puan<=89){
            return 'B';
        }else if (puan>=70 && puan<=79){
            return 'C';
        }else if (puan>=60 && puan<=69){
            return 'D';
        }else if (puan<60){
            return 'F';
        }else{
            return 'I';
        }

    }
}
