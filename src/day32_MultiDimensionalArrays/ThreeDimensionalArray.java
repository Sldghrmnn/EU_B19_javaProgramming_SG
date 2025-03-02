package day32_MultiDimensionalArrays;

import java.util.Arrays;

public class ThreeDimensionalArray {
    public static void main(String[] args) {

        int [][][] threeDimArray = new int[3][2][2];
        System.out.println("Arrays.deepToString(threeDimArray) = " + Arrays.deepToString(threeDimArray));

        String str = " [[[0, 0], [0, 0]], [[0, 0], [0, 0]], [[0, 0], [0, 0]]]";
        //deepToString() --her veriyi Stringe donusturur.yazdirabilmek icin.

        threeDimArray[2][0][1] = 555;
        System.out.println("Arrays.deepToString(threeDipArray) = " + Arrays.deepToString(threeDimArray));

        String s = Arrays.deepToString(threeDimArray);

        System.out.println("s.charAt(2) = " + s.charAt(2));
        System.out.println("s.indexOf(\"2\") = " + s.indexOf("2"));
        System.out.println("s.indexOf(\"0\") = " + s.indexOf("0"));

        //literal way

        int [] arr = {2,5,8};
        String name = "Ali";

        //non-literal way
        String ad = new String("Mehmet");

        //three  dim array literal way
        int[][][] threeDimNumbers = {
                {
                        {2,5},
                        {3,2,28,36}
                },
                {
                        {0,1},
                        {2,-98,36,2555},
                        {3,9,3},
                        {1,2,3,4,5,6,7,8,9}
                }
        };

        System.out.println("threeDimNumbers.length = " + threeDimNumbers.length); //2
        System.out.println("threeDimNumbers[1].length = " + threeDimNumbers[1].length); //4
        System.out.println("threeDimNumbers[0][1].length = " + threeDimNumbers[0][1].length); //4
        System.out.println("threeDimNumbers[1][3].length = " + threeDimNumbers[1][3].length); //9
        
        //three dim array yazdirma (for each)
        
        for (int[][] twoDimArray : threeDimNumbers) {
            for (int []oneDimArray :twoDimArray ) {
                for (int number :oneDimArray ) {
                 //   System.out.println( number+" ");
                    if (number < 0){
                        System.out.println("eksi sayi bulundu");
                    }
                }
                System.out.println();
            }
            System.out.println("-----------------------");
        }

        // for (klasik for) ile yazdirma

        for (int i = 0; i < threeDimNumbers.length; i++) {
            for (int j = 0; j < threeDimNumbers[i].length; j++) {
                for (int k = 0; k < threeDimNumbers[i][j].length; k++) {
                    System.out.println(threeDimNumbers[i][j][k] + "-");
                    if (threeDimNumbers[i][j][k]<0){
                        System.out.println("eksi sayi bulundu");
                    }
                }
                System.out.println();
            }
            System.out.println("*****************************");
        }
        	


    }
}
