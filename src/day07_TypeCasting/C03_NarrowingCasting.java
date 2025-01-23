package day07_TypeCasting;

public class C03_NarrowingCasting {
    public static void main(String[] args) {

/*
byte b= 5;
short sh= 129;

b= (byte) sh;                      // narrowing - exlicit - manuel casting     buyugu kucuge sigdirmak, veri kaybi
                                   // goze aliyorum ... diyecegimiz asamalarda
                                    // Widenin aksine narrowing de kaybi goze aldiginizi
System.out.println("b = " + b);       // manuel olarak kendiniz yapmak zorundasiniz

int x= 130;
byte y= (byte) x;
System.out.println("y = " + y);

float fl= 2334.5f;
int i= (int) fl;                        // norrawing -exlicit- manuel casting
System.out.println("i = " + i);

short b1= 30;
short b2= 40;

short z= (short) (b1-b2);               // norrawing -exlicit- manuel casting

System.out.println("z = " + z);             // byte ,short ne olursa olsun isleme oldugunda otomatik
                                           // int e girer. isleme girdigi an artik o int dir.
int sayi1= b1*b2;

*/
byte sayi1= 1;
byte sayi2= 10;
short toplam= (short) (sayi1*sayi2);   // narrowing-exlicit-manuel casting

double d= 5.2;
int y= 2;

float  z= (float) (d+y);                // norrawing -exlicit- manuel casting
System.out.println("z = " + z);


    }
}
