package day21_ReturnMethods_MethodOverloading;

public class C07_MethodOverLoading2 {
    public static void main(String[] args) {

        calculateArea(5);
    }

    public static void calculateArea(int side1,int side2){ System.out.println(side1*side2);}


    public static void calculateArea(int redius){ System.out.println(3.14*redius*redius);}


    public static void calculateArea(double radius){System.out.println(3.14*radius*radius);}





}
/*
CalculateArea isminde method yazın ve overload
olsun. Birincisi kare-dikdörtgen alanını hesaplasın.
İkincisi dairenin alanını hesaplasın. PI: 3,14
*/