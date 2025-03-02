package day33_ReviewArray;

public class C04_SumTwo {
    public static void main(String[] args) {
        int[] sayilar ={100,120,25,36,32};

        System.out.println("sumTwo(sayilar) = " + sumTwo(sayilar));

    }
    // arrayin ilk iki elemanini toplayip donen methodu yaziniz
    //eger arrayin tek ellemani varsa,bunu sonuc olarak versin
    //eger arrayin elemani yoksa sonuc -1 olsun.

    public static int sumTwo(int[]numbers){
        if (numbers.length==0)return  -1;
        if (numbers.length==1)return numbers[0];
        return numbers[0]+numbers[1];
    }
}
