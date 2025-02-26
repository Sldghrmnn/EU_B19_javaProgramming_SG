package day32_MultiDimensionalArrays;

import java.util.Arrays;

public class C03_TwoDimArrayPrintMethods {
    public static void main(String[] args) {
        int[][] numbers = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };

        printArray(numbers);
        forIndexPrint(numbers);
        forEachPrint(numbers);

    }

    // deep to String ile yazdirma

    public static void printArray(int[][]dimArrr){
        System.out.println("Arrays.deepToString ile yazdirma");
        System.out.println("-------------------");
        System.out.println(Arrays.deepToString(dimArrr));
    }

    public static void forIndexPrint(int [][]dimArr){
        System.out.println("klasik fori ile yazdirma");
        System.out.println("------------------------");

        for (int i = 0; i < dimArr.length; i++) {
            for (int j = 0; j < dimArr[i].length; j++) {
                System.out.println(dimArr[i][j]+"\t\t");
            }
           System.out.println();
        }
    }

    public static void forEachPrint(int[][]dimArr){
        System.out.println("for each ile yazdirma");
        System.out.println("------------------------");
        for (int[]herbirSatir : dimArr) {
           for ( int n : herbirSatir) {
               System.out.print(n+" - ");
           }
           System.out.println();
        }
    }
}
