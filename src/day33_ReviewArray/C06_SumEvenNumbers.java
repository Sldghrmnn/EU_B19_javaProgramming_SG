package day33_ReviewArray;

public class C06_SumEvenNumbers {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 50, 60, 36};

        System.out.println("sumEven(numbers) = " + sumEven(numbers));
        System.out.println("sumEven_2(numbers) = " + sumEven_2(numbers));

    }

    //bir array in icindeki cift sayilari toplayip donen methodu yaziniz


    public static int sumEven(int[] nums) {
        int toplam = 0;
        for (int number : nums) {
            if (number % 2 == 0) {
                toplam += number;
            }
        }
        return toplam;
    }

    public static int sumEven_2(int[] nums) {
        int toplam = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0)
                toplam += nums[i];
        }
        return toplam;
    }

}
