package day30_Arrays01;

import java.util.Arrays;

public class C11_ArraysToString {
    public static void main(String[] args) {
        String [] arr = new String[4];
        arr [0]="Alper";
        arr [1]="Ayse";
        arr [2]="Selda";
        arr [3]="Gulden";

        System.out.println("arr.toString() = " + arr.toString());

        String str = Arrays.toString(arr);
        System.out.println("str = " + str);

        System.out.println("------------------------------");

        System.out.println(toString(arr));

        System.out.println("------------------------------");

        int [] sayilar6 = new int[5];

        sayilar6[0] = 7; //1. element
        sayilar6[1] = 5;
        sayilar6[2] = 12;
        sayilar6[3] = 23;
        sayilar6[4] = 45;

        System.out.println(toString(sayilar6));

        System.out.println(toString(arr));
    }


    public static String toString(Object[] arr){
        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i== arr.length-1){
                result += arr[i]+"]";
            }else{
                result += arr[i]+", ";
            }
        }
        return result;
    }

    public static String toString(int[] arr){  // method overloading--same name ,different parameter
        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i== arr.length-1){
                result += arr[i]+"]";
            }else{
                result += arr[i]+", ";
            }
        }
        return result;
    }

    public static String toString(byte [] arr){ // method overloading --- same name, different parameter
        String result="[";
        for (int i = 0; i < arr.length; i++) {
            if (i== arr.length-1){
                result+=arr[i]+"]";
            }else {
                result += arr[i] + ", ";
            }
        }
        return result;
    }
}
