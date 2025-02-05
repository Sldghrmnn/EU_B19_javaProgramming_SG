package day19_Methods1;

public class C13_ParameterizedMethod {
    public static void main(String[] args) {

       int max = buyukSayi(36,32);
        System.out.println("max = " + max);

        System.out.println("--------------------------");

        System.out.println(buyukSayi(25,38));

    }

   public static int buyukSayi(int sayi1,int sayi2){
        if (sayi1>=sayi2){
            return sayi1;
        }else {
            return sayi2;
        }
   }

}
