package day33_ReviewArray;

import java.util.Arrays;

public class C02_Fix23 {
    public static void main(String[] args) {

        int[] numbers = {1,2,2,3,3,3,2,3}; //1,2,0

       //  System.out.println(Arrays.toString(fix23(numbers)));

        System.out.println("Arrays.toString(fix23_2(numbers)) = " + Arrays.toString(fix23_2(numbers)));


    }
/*
Given an int array length 3, if there is a 2 in the array immediately followed by a 3,
 set the 3 element to 0.Return the changed array.


fix23([1, 2, 3]) → [1, 2, 0]
fix23([2, 3, 5]) → [2, 0, 5]
fix23([1, 2, 1]) → [1, 2, 1]
*/

    public static int[] fix23(int[]nums){  //bu method sadece 3 elemani array'de calisir.
        // eger dizinin ilk elemani 2 ise
        if (nums[0]==2 && nums[1]==3){
            nums[1]=0;
        }
        // eger dizinin ikinci elemani 2 ise
        if (nums[1]==2 && nums[2]==3){
            nums[2]=0;
        }
        return nums;
    }

    public static int[] fix23_2(int[]arr){
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] == 2 && arr[i+1]==3){
                arr[i+1]=0;
            }
        }
        return arr;
    }

}
