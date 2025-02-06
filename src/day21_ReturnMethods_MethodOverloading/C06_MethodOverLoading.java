package day21_ReturnMethods_MethodOverloading;

public class C06_MethodOverLoading {
    public static void main(String[] args) {

        System.out.println(sum(2, 5));




    }
    public static int sum(int num1,int num2){
      return num1+num2;
    }

    public static double sum(double a,double b){
       return a+b;
    }

    public static int sum(int i,int i1,int i2){
        return 0;

    }
    public static double sum(double a,double b,double c){
        return a+b+c;
    }



}
// method isimleri ayni olabilir ancak parametreler farkli olmak zorunlu!! yukaridaki orn: gibi