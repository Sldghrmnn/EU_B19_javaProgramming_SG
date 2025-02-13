package day22_ClassObject;

public class Math2 {

    public static int sayiKuvveti(int  taban,int kuvvet){
        int sonuc=1;
        for (int i = 0; i < kuvvet; i++) {
            sonuc *= taban;
        }
        return sonuc;
    }

    public int pow(int x,int y){
        int sonuc = 1;
        for (int i = 0; i < y; i++) {
          sonuc *= x;
        }
        return sonuc;
    }


}

/*
task:

Math2
pow methodu yazin-- pow(num1,num2)
iki sayi alacak ve birinci sayi taban,ikinci sayi kuvvet olacak
   2 uzeri 4 =2*2*2*2

buradan bir obje olusturarak pow  methodunu cagiracaksiniz...

1. obje olusturmadan methodu fakli bir main class da cagirin
 2. obje olusturarak methodu farkli bir main class da cagirin
*/