package day55_CollectionReview;

import java.util.Arrays;

public class C01_Arrays {
    public static void main(String[] args) {

        /**
         * ayni tipten, birden fazla datayi tutmak icin kullanilirlar
         * index kullanilir
         * arraylerin boyu sabittir--size fix dir
         * primitive,non-primitive kullanilabilir
         * atama yapilmadiginda default degeri vardir
         *
         */

        int[] numbers = {2,3,5};
        System.out.println("Arrays.toString(numbers) = " + Arrays.toString(numbers));

        String[] names = new String[]{"Ali","Ahmet"};
        System.out.println("Arrays.toString(names) = " + Arrays.toString(names));

        System.out.println("numbers.length = " + numbers.length);

        // numbers.lenght = 5; hata verir

        int[] nums = new int[]{2,6,9};

        System.out.println(Arrays.toString(firstElements(numbers, nums)));

        int nums2 []=new int[2];// c-type gosterim. tercih edilmez

        nums2[0]= 58;
        nums2[1]= 5;
    }

    private static int[] firstElements(int[] sayilar1,int[]sayilar2){

        //eger sayilar1 ve sayilar2 dizilerinden herhangi birisi bos ise
        //[-1,-1] elemanlari olan bir array donsun
        int[] result = new int[2];

        if (sayilar1.length == 0 || sayilar2.length == 0){
            return new int[]{-1,-1};
        }else {
            result[0] = sayilar1[0];
            result[1] = sayilar2[0];
        }
        return result;
    }

}
