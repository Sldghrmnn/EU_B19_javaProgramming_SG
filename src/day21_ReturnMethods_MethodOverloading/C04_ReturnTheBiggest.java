package day21_ReturnMethods_MethodOverloading;

public class C04_ReturnTheBiggest {
    public static void main(String[] args) {


        System.out.println(buyukSayi(3, 5));



    }
    //a method that returns the biggest number of two numbers
    public static int buyukSayi(int a,int b){
        return (a>b)?a:b;
    }

}
