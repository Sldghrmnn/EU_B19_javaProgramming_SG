package day33_ReviewArray;

import java.util.Arrays;

public class C05_Front11 {
    public static void main(String[] args) {

        int[]numbers={2,3,5,6,36};
        int[]nums={-6};

        int [] resultArr =front11(numbers,nums);

        System.out.println("Arrays.toString(resultArr) = " + Arrays.toString(resultArr));

    }
/*
Given 2 int arrays, a and b, of any length, return a new array with the first element of each array.
If either array is length 0, ignore that array.

front11([1, 2, 3], [7, 9, 8]) → [1, 7]
front11([1], [2]) → [1, 2]
front11([1, 7], []) → [1]
front11([],[])-> []
*/

    public static int[]front11(int[]arr1,int[]arr2){
        if (arr1.length==0 && arr2.length==0)return new int[]{};
        if (arr1.length==0)return new int[]{arr2[0]};
        if (arr2.length==0)return new int[]{arr1[0]};

        int[] result = new int[2];
        result[0] = arr1[0];
        result[1] = arr2[0];

        return result;
    }
}
