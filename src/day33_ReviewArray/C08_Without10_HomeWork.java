package day33_ReviewArray;

import java.util.Arrays;

public class C08_Without10_HomeWork {
    public static void main(String[] args) {

     int [] nums ={2,10,10,5,7,10};
        System.out.println(Arrays.toString(withoutTen(nums)));
    }
/*

Return a version of the given array where all the 10's have been removed.
The remaining elements should shift left towards the start of the array as needed,
and the empty spaces a the end of the array should be 0.
So {1, 10, 10, 2} yields {1, 2, 0, 0}.
You may modify and return the given array or make a new array.

withoutTen([1, 10, 10, 2]) → [1, 2, 0, 0]
withoutTen([10, 2, 10]) → [2, 0, 0]
withoutTen([1, 99, 10]) → [1, 99, 0]
*/

    public static int [] withoutTen(int[] arr){
        int [] resualt = new int[arr.length];
        int index =0;
        for (int num :arr ) {
            if (num != 10){
                resualt [index++]=num;
            }
        }
        return resualt;
    }
}
