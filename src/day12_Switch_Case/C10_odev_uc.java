package day12_Switch_Case;

import java.util.Scanner;

public class C10_odev_uc {
    public static void main(String[] args) {
/*
  soru 2-
Kullanicidan artik yil olup olmadigini kontrol
etmek icin yil girmesini isteyin.
Kural 1: 4 ile bolunemeyen yillar artik yil
degildir
Kural 2: 4 ile bolunup 100 ile bolunemeyen
yillar artik yildir
Kural 3: 4’un kati olmasina ragmen 100 ile
bolunebilen yillardan sadece
400’un kati olan yillar artik yildir
*/

      /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir Yil giriniz :  ");
        double artikYil= scanner.nextDouble();

    if (artikYil/4 ==0 && !(artikYil/100==0)){
        System.out.println(artikYil+" Artik Yil'dir.");
        if(artikYil/4 ==0 ){
            System.out.println(artikYil+" Artik Yil'dir.");
        }else{
            System.out.println("Artik Yil degildir");
        }


    }else {
        System.out.println(artikYil+" Artik yil degildir.");
    }
*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir Yil giriniz :  ");
        int yil= scanner.nextInt();
        if ((yil % 4 ==0 &&yil % 100 !=0) || (yil % 400 ==0)){
            System.out.println(yil+" bir artik yildir");
        }else{
            System.out.println(yil+" bir artik yil degildir.");
        }
        scanner.close();
    }
}
