package day41_Review;

import java.util.Arrays;

public class C01_PassByValue {
    public static void main(String[] args) {

        //primitive
        double fiyat= 200;
        System.out.println("fiyat = " + fiyat);

        indirim10(fiyat);
        System.out.println("fiyat = " + fiyat);

        indirim10_2(fiyat);
        System.out.println("fiyat = " + fiyat);

        //String
        String word = "Ayse";
        addStar(word);
        System.out.println("word = " + word);

        //Arrayler
        int[] sayilar = {1,5,7};

        System.out.println("Arrays.toString(sayilar) Method'dan once = " + Arrays.toString(sayilar));
        onEkle(sayilar);
        System.out.println("Arrays.toString(sayilar) Method'dan sonra = " + Arrays.toString(sayilar));

        StringBuilder sb = new StringBuilder("Hasan");
        sb.reverse();
        System.out.println("sb = " + sb);

        String str = "Hasan";
        str.toUpperCase();
        System.out.println("str = " + str);

    }

    public static void indirim10(double fiyat){
        fiyat = fiyat * 0.9;
        System.out.println("Method ici fiyat = "+fiyat);
    }
    public static double indirim10_2(double fiyat){
        fiyat = fiyat * 0.9;
        System.out.println("Method ici fiyat = "+fiyat);
        return fiyat;
    }
    public static String addStar(String word){
        word = "***"+word+"***";
        System.out.println("Method ici = "+word);
        return word;
    }
    public static int[]onEkle(int[]sayilar){
        int[] sayilar2 = sayilar.clone();
        for (int i = 0; i < sayilar2.length; i++) {
            sayilar2[i] += 10;
        }
        System.out.println("Arrays.toString(sayilar)-Method ici = " + Arrays.toString(sayilar2));
        return sayilar2;
    }
}
