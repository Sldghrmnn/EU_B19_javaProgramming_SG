package day33_ReviewArray;

import java.util.Arrays;

public class C10_MissingOddNummer {
    public static void main(String[] args) {

        int [] arr ={9,7,13,15};

        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("eksikTekSayi(arr) = " + eksikTekSayi(arr));

    }
    // verilen bir arraydeki eksik tek sayiyi bullan methodu yaziniz--> 9,7,13,15--> 11  bulacak
    // verilen bir arraydeki eksik tek sayiyi bullan methodu yaziniz--> 5,3,7,13,11--> 9  bulacak
    //once arrayi short et yani sirala sonrada....int donecek

    public static int eksikTekSayi(int[] arr) {
        Arrays.sort(arr);

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] % 2 !=0 && arr[i+1] != arr[i]+2){
                return arr[i] + 2;
            }
        }
        return -1;
    }
}
