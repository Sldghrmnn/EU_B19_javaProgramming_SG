package day31_Arrays02;

import java.util.Arrays;

public class C10_HomeWork_Arrays {
    public static void main(String[] args) {
        //1.
        int [] sayilar = {1,2,3,4,5,6};
        System.out.println(buyukIse(sayilar));

        System.out.println("--------------2.-----------------------");
        //2.
        int numbers [] = {1,2,3,4,5,6};
        boolean containsbes = containsNumber(numbers,5);
        System.out.println("Bu dizi 5 iceriyor mu? " + containsbes);

        System.out.println("-------------3.------------------------");
        //3.
        int[]arr1 ={1,2,3};
        int[]arr2 ={1,4,5};
        int[]arr3 ={2,3,4};
        System.out.println(esitMi(arr1, arr2));
        System.out.println(esitMi(arr1,arr3));

        System.out.println("--------------4.-----------------------");
        //4.
        int [] sayi1 ={1,3,5};
        int [] sayi2 ={2,4,6};
        int [] birlesikSayilar = birlesikArrays(sayi1,sayi2);
        System.out.println("Birlestirilen sayilar : " + Arrays.toString(birlesikSayilar));
        System.out.println("-----------5.--------------------");

        // 5.Bir array oluşturun ve ilk ve son element leri swap(yer değiştirme) yapın.
        int [] nums = {3,4,5,7};
        int temp;
        temp=nums[0];
        nums[0]=nums[nums.length-1];
        nums[nums.length-1]= temp;
        for (int sayi :nums ) {
            System.out.print(sayi+ ",");
        }
        System.out.println();

        System.out.println("-------------6.------------------");
        //6.
        int[] sayilar1 = {10,25,3,47,5};
        int enBuyukSayi = enBuyukEleman(sayilar1);
        if (enBuyukSayi != Integer.MIN_VALUE){
            System.out.println("en buyuk sayi : "+enBuyukSayi);
        }else{
            System.out.println("Bos veya gecersiz !");
        }
        System.out.println("-------------7.--------------------");
        //7.
        int[]arr5={2,3,5,6,36};
        int[]arr6={4,6,8,2};
        System.out.println(Arrays.toString(ilkElemanlari(arr5, arr6)));

        System.out.println("------------8.--------------------");
        //8.
        int[] numbers1 = {2, 3, 50, 60, 36, 3, 5, 6, 0};
        System.out.println(Arrays.toString(reverse(numbers1)));

        System.out.println("------------9.--------------------");

        int[] sayilar2={2,7,5,3,4,8,9,6};
        int toplam = tekSayiIndexToplama(sayilar2);
        System.out.println("Tek sayi indexlerinin toplami = " + toplam);

        System.out.println("------------10.--------------------");

        int[] number6={4,5,6};
        System.out.println(Arrays.toString(toplaVeCarp(number6)));


    }
    //1.Bir method yazın ve int[] kabul etsin. length i 5 den büyükse true döndürsün.
    public static boolean buyukIse(int [] arr){
        return arr.length > 5;
    }
    //2.Bir method yazın int array kabul etsin array in içinde 5 olup olmadığını kontrol etsin.b

    public static boolean containsNumber(int []arr,int number){
        for (int element : arr ) {
            if (element ==number){
                return true;
            }
        }
        return false;
    }
    //3.Bir method yazın ve 2 array kabul etsin ilk elemanları eşitse true döndürsün.

    public static boolean esitMi(int [] arr1,int [] arr2){
        if (arr1.length ==0 || arr2.length ==0){
            return false;
        }

        return arr1[0] == arr2 [0];
    }
    //4.Verilen 2 arrayi birleştirip array döndüren bir method yazın.

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
    //6.İnt arry in en büyük elemanının döndüren bir method yazın
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
  //7.  2 array kabul eden bir method yazın ve arraylerin llk elemanları ile yeni bir array döndürsün.
   public static int[] ilkElemanlari(int[]arr1,int[]arr2){
       int[] result = new int[2];
       result[0] = arr1[0];
       result[1] = arr2[0];

       return result;
   }
   //8.Bir method yazın ve verilen arry in elemanlarını tersden sıralayıp yeni bir array döndürsün.

    public static int[] reverse(int[]number){
        int[] tersten= new int[number.length];
        for (int i = number.length-1,j=0; i >=0 ; i--,j++) {
          tersten [j] = number[i];
        }
        return tersten;
    }
    //9.Bir methodla verilen array ın teksayı indexinde bulunan elemanların toplamını alın.

    public static int tekSayiIndexToplama(int[]arr1){
        int tekleriTopla= 0;
        for (int i = 1; i < arr1.length ; i+=2) {
            tekleriTopla += arr1[i];
        }
       return tekleriTopla;
    }
    //10.İnt array ın elemanlarının toplamını ve çarpımını yeni bir array içinde döndüren bir method yazın

    public static int[] toplaVeCarp(int[] arr){
        int toplam = 0;
        int carp = 1;
       for (int sayi :arr ) {
           toplam += sayi;
           carp *= sayi;
       }
       return new int[]{toplam,carp};
    }



}
