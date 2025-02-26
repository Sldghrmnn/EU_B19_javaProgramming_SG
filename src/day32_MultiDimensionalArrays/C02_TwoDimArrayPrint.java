package day32_MultiDimensionalArrays;

import java.util.Arrays;

public class C02_TwoDimArrayPrint {
    public static void main(String[] args) {

        double [][] doubleNumbers = new double[5][3];

        doubleNumbers[2][2] = 8;
        doubleNumbers[3][1] = 8;

        //cok boyutlu array'i deepToString ile yazdirma

        System.out.println("Arrays.deepToString(doubleNumbers) = " + Arrays.deepToString(doubleNumbers));

        //for i loop + toString ile

        for (int i = 0; i < doubleNumbers.length; i++) {
            System.out.println("Arrays.toString(doubleNumbers["+i+"]) = " + Arrays.toString(doubleNumbers[i]));
        }
        System.out.println("----------klasik for ile----------------------");

        for (int satir = 0; satir < doubleNumbers.length; satir++) { //satir dongusu
            for (int sutun = 0; sutun < doubleNumbers[satir].length; sutun++) {
                System.out.print(doubleNumbers[satir][sutun]+"\t\t");
            }
            System.out.println();
        }

        System.out.println("--------advanced for ile(for each)---------------");

        //doubleNumbers' foreach ile yazdirmak

        for ( double [] satirDoubles: doubleNumbers) {
            for ( double number : satirDoubles) {
                System.out.println(number + " ");
            }
           System.out.println();
        }

        for ( double [] satirDoubles: doubleNumbers) {
            for ( double number : satirDoubles) {
                if (number == 8){
                    System.out.println("Sayi bulundu");
                }
            }
            System.out.println();
        }

    }
}
