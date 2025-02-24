package day30_Arrays01;

public class C03_AlternatifYol {
    public static void main(String[] args) {
        //1.yol
        int [] numbers;

        //2.yol
        int numbers2 [];

        //3.yol
        int [] numbers3,numbers4,numbers5;

        //4.yol
        int numbers6,numbers7,numbers8 [];

        //5.yol
        int numbers9[],numbers10[],numbers11[];

        //int [] numbers12,numbers13;--error verir

        int [] sayilar = {10,15,20,25,30,35};
        System.out.println("sayilar[0] = " + sayilar[0]);
        System.out.println("sayilar[1] = " + sayilar[1]);
        System.out.println("sayilar[2] = " + sayilar[2]);
        System.out.println("sayilar[3] = " + sayilar[3]);
        System.out.println("sayilar[4] = " + sayilar[4]);
        System.out.println("sayilar[5] = " + sayilar[5]);

        //System.out.println("sayilar [6] = " + sayilar[6]); //ArrayIndexOutOfBoundsException

        //Arrays fixed size'dir...

        System.out.println("sayilar = " + sayilar); //referansi verir!!!

        sayilar[6] = 40; // ArrayIndexOutOfBoundsException--hata verir Array fix dir ve ekleme yapmaz!!!

     /*
       int [] sayilar2;
       sayilar2 = {1,2,3,4,5};--- error verir

       Alternatif yol ilie  array tanimlamak ayni satirda mumkundur
     */
    }
}
