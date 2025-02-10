package day22_ClassObject;

public class C01_Static_Math2 {
    public static double sayiKuvveti(double taban,int kuvvet){
        double sonuc=1.0;

        if (kuvvet<0){
            taban =1;
            kuvvet= -kuvvet;
        }
        for (int i = 0; i < kuvvet; i++) {
            sonuc *= taban;
        }
        return sonuc;
    }


}
