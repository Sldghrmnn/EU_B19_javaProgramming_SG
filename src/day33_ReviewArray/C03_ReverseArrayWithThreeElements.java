package day33_ReviewArray;

import java.util.Arrays;

public class C03_ReverseArrayWithThreeElements {
    public static void main(String[] args) {

        int[] reversed = reverse3(new int[]{8, 9, 10});

        System.out.println("Arrays.toString(reversed) = " + Arrays.toString(reversed));

    }
 /*
Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3,
2, 1}.

reverse3([1, 2, 3]) → [3, 2, 1]
reverse3([5, 11, 9]) → [9, 11, 5]
reverse3([7, 0, 0]) → [0, 0, 7]
*/

    public static int[] reverse3(int[]nums){
        if (nums.length < 3) return nums;

        int temp;
        temp=nums[0];
        nums[0]=nums[2];
        nums[2]=temp;

        return nums;
    }
}
