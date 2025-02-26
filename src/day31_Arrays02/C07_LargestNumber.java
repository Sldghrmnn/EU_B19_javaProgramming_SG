package day31_Arrays02;

import java.util.Arrays;

public class C07_LargestNumber {
    public static void main(String[] args) {

        int [] x={42,35,86,45,37,56};
        int [] y={23,34,47,72,56,90,546};

        bigger(x,y);


    }

    public static void bigger(int [] arr1,int [] arr2){
        int toplam1=0;
        for (int a : arr1 ) {
        	toplam1 += a;
        }

        int toplam2=0;
        for (int a : arr2 ) {
            toplam2 += a;
        }

        if (toplam1 > toplam2){
            System.out.println(Arrays.toString(arr1) + " buyuktur");
        }else if (toplam2 > toplam1){
            System.out.println(Arrays.toString(arr2) + " buyuktur");
        }else{
            System.out.println(Arrays.toString(arr1) + " ve" + Arrays.toString(arr2) + " birbirine esittir");
        }


    }
}
// Verilen 2 arraydeki sayilarin toplami buyuk olan arrayi tespit eden bir method yaziniz