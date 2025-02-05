package day19_Methods1;

import java.util.Scanner;

public class C03_UniqueNumber {
    public static void main(String[] args) {
        uniqueNumber();

    }
    /*
    verilen 3 sayi icerisinde kac farkli sayi oldugunu yazdiran metod nedir?
     */
    public static void uniqueNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Uc tane tam sayi giriniz : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sonuc;

      if(a == b && b == c) {
           sonuc = 1;
       }else if (a == b || a== c || b == c){
           sonuc = 2;
      }else{
          sonuc = 3;
       }
        // ternary ile
        //  sonuc = (a == b && b == c ) ? 1 : (a==b || a==c || b==c) ? 2 : 3;

        System.out.println("Farkli sayi adedi : "+sonuc);
    }

}
