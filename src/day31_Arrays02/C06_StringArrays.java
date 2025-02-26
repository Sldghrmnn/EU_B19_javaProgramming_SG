package day31_Arrays02;

import java.util.Arrays;

public class C06_StringArrays {
    public static void main(String[] args) {
        String [] cars = {"Toyota","Honda","Opel","Mercedes","Audi"};

        System.out.println(cars[0].length());
        System.out.println(cars.length);
        System.out.println(cars[1].charAt(2));
        System.out.println(cars[3].trim());
        System.out.println(cars[2].substring(1, 3));
        System.out.println(cars[3] == cars[4]);
        System.out.println(cars[3].equals(cars[4]));

        System.out.println("-------------------");

        //sprit()    ----stringi bolup array haline cevirebiliyor...bolup birden fazla string olustuyor
        String str = "It will split the string to the array";

        String[] arr = str.split(" ");

        System.out.println(arr[5]);

        System.out.println("-------------------------------");

        System.out.println(arr.length);

        for (String split : arr ) {
            System.out.println(split);
        }

        System.out.println("-------------------------------");

        System.out.println(Arrays.toString(cars));

        String [] strArr =  Arrays.copyOfRange(cars,1,4);
        System.out.println(Arrays.toString(strArr));

        System.out.println(strArr.length);


        System.out.println("-----------------------------------");

        //sort ---siralamak
        int [] arry = new int[5];

        arry[0]=34;
        arry[1]=23;
        arry[2]=12;
        arry[3]=4;
        arry[4]=59;

        System.out.println(Arrays.toString(arry));
        Arrays.sort(arry);
        System.out.println(Arrays.toString(arry));

        System.out.println("----------------------------------------");

        //fill()
        int [] arry1 = new int[5];

        arry1[0]=3;
        arry1[1]=2;
        arry1[2]=1;
        arry1[3]=4;
        arry1[4]=5;

        System.out.println(Arrays.toString(arry1));

        Arrays.fill(arry1,1,3,10);
        System.out.println(Arrays.toString(arry1));

        Arrays.fill(arry1,10);
        System.out.println(Arrays.toString(arry1));


    }
}
