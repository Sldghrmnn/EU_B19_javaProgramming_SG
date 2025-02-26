package day32_MultiDimensionalArrays;

import java.util.Arrays;

public class C01_TwoDimensionalArrayExample1 {
    public static void main(String[] args) {
        System.out.println("Two dimensional arrays in Java");

        int [][] numbers = new int[3][3];  // 3 satir 3 sutun 3*3=9 elemanlidir.
        //       0.stn 1.stn 2.stn
        //0.satir   0     0    0
        //1.satir   0     0    0
        //2.satir   0     0    0

        System.out.println("Arrays.deepToString(numbers) = " + Arrays.deepToString(numbers));

        numbers[0][0] =1;
        numbers[0][1] =5;
        numbers[0][2] =17;

        System.out.println("Arrays.deepToString(numbers) = " + Arrays.deepToString(numbers));

        int [] birArray = {19,5,0};

        numbers[1] = birArray;

        numbers[2] = new int[]{2,30,-99};

        System.out.println("Arrays.deepToString(numbers) = " + Arrays.deepToString(numbers));

        // literal way ile two dim array olusturma

        String [][] names = {
                {"Ali","Ahmet"},
                {"Elif","Eylul"},
                {"Burak","Hande"}
        };

        System.out.println("names[1][2] = " + names[1][1]); //Eylul

        System.out.println("names.length = " + names.length); //3 yani satir sayisi

        // herhangi bir satirdaki eleman sayisi nasil yazdirilir?

        System.out.println("names [0].length = " + names[0].length);  //2
        System.out.println("names [1].length = " + names[1].length);  //2

    }
}
