package day33_ReviewArray;

import java.util.Arrays;

public class C11_EvenOdd {
    public static void main(String[] args) {

        int[] numbers = {1, 0, 1, 0, 0, 1, 1};

        System.out.println(Arrays.toString(evenOdd(numbers)));

    }
/*
arrayler soll ciftleri sag tekleri sirala yeniden hizalayan method
Return an array that contains the exact same numbers as the given array,
but rearranged so that all the even numbers come before all the odd numbers.
Other than that, the numbers can be in any order.
You may modify and return the given array, or make a new array.

evenOdd([1, 0, 1, 0, 0, 1, 1]) → [0, 0, 0, 1, 1, 1, 1]
evenOdd([3, 3, 2]) → [2, 3, 3]
evenOdd([2, 2, 2]) → [2, 2, 2]
*/
    public static int[] evenOdd(int [] arr){
        int[] result = new int [arr.length];
        int index = 0;

        for (int cift :arr ) {
            if (cift % 2 ==0){
                result[index++]= cift;
            }
        }
        for (int tek : arr) {
            if (tek % 2 ==1){
                result[index++]=tek;
            }
        }
        return result;
    }
}
