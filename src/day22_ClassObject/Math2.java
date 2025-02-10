package day22_ClassObject;

public class Math2 {

    public double pow(double taban,int kuvvet){
        double sonuc1 = 1.0;
        if (kuvvet<0){
            taban=1;
            kuvvet= -kuvvet;
        }
        for (int i = 0; i < kuvvet; i++) {
          sonuc1 *= taban;
        }
        return sonuc1;
    }


}

/*
task:

Math2
pow methodu yazin-- po(num1,num2)
iki sayi alacak ve birinci sayi taban,ikinci sayi kuvvet olacak
   2 uzeri 4 =2*2*2*2

buradan bir obje olusturarak pow  methodunu cagiracaksiniz...

1. obje olusturmadan methodu fakli bir main class da cagirin
 2. obje olusturarak methodu farkli bir main class da cagirin
*/