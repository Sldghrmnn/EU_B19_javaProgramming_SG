package day31_Arrays02;

import java.util.Arrays;

public class C10_HomeWork_Arrays {
    public static void main(String[] args) {

        int [] sayilar = {1,2,3,4,5,6};
        System.out.println(buyukIse(sayilar));

        System.out.println("-------------------------------------");

        int numbers [] = {1,2,3,4,5,6};
        boolean containsbes = containsNumber(numbers,5);
        System.out.println("Bu dizi 5 iceriyor mu? " + containsbes);

        System.out.println("-------------------------------------");

        int[]arr1 ={1,2,3};
        int[]arr2 ={1,4,5};
        int[]arr3 ={2,3,4};
        System.out.println(esitMi(arr1, arr2));
        System.out.println(esitMi(arr1,arr3));

        System.out.println("-------------------------------------");

        int [] sayi1 ={1,3,5};
        int [] sayi2 ={2,4,6};
        int [] birlesikSayilar = birlesikArrays(sayi1,sayi2);
        System.out.println("Birlestirilen sayilar : " + Arrays.toString(birlesikSayilar));

        System.out.println("-------------------------------------");

        int[] sayilar1 = {10,25,3,47,5};
        int enBuyukSayi = enBuyukEleman(sayilar1);
        if (enBuyukSayi != Integer.MIN_VALUE){
            System.out.println("en buyuk sayi : "+enBuyukSayi);
        }else{
            System.out.println("Bos veya gecersiz !");
        }




    }
    //Bir method yazın ve int[] kabul etsin. length i 5 den büyükse true döndürsün.
    public static boolean buyukIse(int [] arr){
        return arr.length > 5;
    }
    //Bir method yazın int array kabul etsin array in içinde 5 olup olmadığını kontrol etsin.b

    public static boolean containsNumber(int []arr,int number){
        for (int element : arr ) {
            if (element ==number){
                return true;
            }
        }
        return false;
    }
    //Bir method yazın ve 2 array kabul etsin ilk elemanları eşitse true döndürsün.

    public static boolean esitMi(int [] arr1,int [] arr2){
        // dizilerin bos olup olmadigini kontrol edelim
        if (arr1.length ==0 || arr2.length ==0){
            return false;
        }
        //ilk elemanlari karsilatiralim
        return arr1[0] == arr2 [0];
    }
    //Verilen 2 arrayi birleştirip array döndüren bir method yazın.

    public static int[] birlesikArrays(int[] sayi1,int[] sayi2){
        int uzunluk1 = sayi1.length;
        int uzunluk2 = sayi2.length;
        int[] sonuc = new int[uzunluk1+uzunluk2];

        for (int i = 0; i < uzunluk1; i++) {
            sonuc[i] = sayi1[i];
        }
        for (int i = 0; i < uzunluk2; i++) {
            sonuc[i+uzunluk1] = sayi2[i];
        }
        return sonuc;
    }
    //İnt arry in en büyük elemanının döndüren bir method yazın
    public static int enBuyukEleman(int[]sayi){
        if (sayi == null || sayi.length ==0){
            return Integer.MIN_VALUE;
        }
        int enBuyuk = sayi[0];
        for (int i = 1; i <sayi.length ; i++) {
            if (sayi[i]>enBuyuk){
                enBuyuk = sayi[i];
            }
        }
        return enBuyuk;
    }
}
