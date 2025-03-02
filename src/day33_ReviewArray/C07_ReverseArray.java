package day33_ReviewArray;

import java.util.Arrays;

public class C07_ReverseArray {
    public static void main(String[] args) {

        int[] numbers = {2, 3, 50, 60, 36, 3, 5, 6, 0};

        int[] result = reversedArray(numbers);

        System.out.println("Arrays.toString(result) = " + Arrays.toString(result));

    }
    //verilen arrayi tersine ceviren methodu yaziniz

    public static int [] reversedArray(int [] numbers){
        if (numbers.length < 2) return numbers;

        int []reversed = new int[numbers.length];

        for (int i = numbers.length-1 ,k =0; i >=0 ; i--,k++) {
            reversed[k]= numbers[i];

        }
        return reversed;
    }
    //bu sorunun for each ile yapilmasi odevdir.-- bu soruyu for each le cozemeyiz!!!
}
