package day15_ForLoops;

public class C07_ForLoop_4 {
    public static void main(String[] args) {

        // tum nümerik data tipleri loop da kullanilabilir.
        // byte,char,int,long,float,double gibi

        for (byte b = 0; b <= 5; b++){
            System.out.println("b = " + b);
        }
        // double kullanalim- cok yaygin birsey degil

        for (double d = 1; d <= 10 ; d += 0.5){
            System.out.println("d = " + d);
        }
        // birden fazla condition kullanilabilir- cok yaygin bir islem turu degil

        for (int i = 3; i < 10  &&  i > 2; i++ ){
            System.out.println("i = " + i);
        }
        // baslangic degeri loop disindan gelebilir

        int x =5;
        for (x = 10; x < 20; x++){
            System.out.println("x = " + x);
        }
        // artirma yada eksiltme kod blokunun icinde de olabilir

        for (int i = 10; i > 0;){
            i--;
            System.out.println("i = " + i);
        }
        // cift sayac(index) kullanilabilir

        for (int i = 0,k = 0; i <= 5 && k <=8; i++,k +=2){
            System.out.println("i = " + i);
            System.out.println("k = " + k);
        }

        // for 'i' loop da sedece for kelimesi ve 2 adet  ;; koymak zorunludur.
        //;; parantez icinde yapildiginda sonsuz kere yazdrir
        for (;;){

        }








    }
}
