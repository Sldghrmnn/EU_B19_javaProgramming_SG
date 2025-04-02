package day49_Polimorphism01.CompileTime;

public class MethodOverloading {

    //Compile time Polimorphism-- static polimorphism-- method overloading

    public static int carpma(int a,int b){return a*b;}
    public static int carpma(int a,int b,int c){return a*b*c;}
    public static double carpma(double a,double b){return a*b;}

    public static int toplama(int a,int b){return a+b;}
    public static int toplama(int a,int b,int c){return a+b+c;}
    public static double toplama(double a, int b){return a+b;}
    public static double toplama(int a,double b){return a+b;}


    public static void main(String[] args) {
        System.out.println("carpma(2,5) = " + carpma(2, 5));
        System.out.println("carpma(2.3,4.6) = " + carpma(2.3, 4.6));
        System.out.println("carpma(2,5,7) = " + carpma(2, 5, 7));

        System.out.println("toplama(34,23) = " + toplama(34, 23));
        System.out.println("toplama(12.4,23) = " + toplama(12.4, 23));
        System.out.println("toplama(23,56.5) = " + toplama(23, 56.5));
    }
}
