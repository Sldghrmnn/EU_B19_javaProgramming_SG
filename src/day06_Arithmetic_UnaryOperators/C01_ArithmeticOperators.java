package day06_Arithmetic_UnaryOperators;

public class C01_ArithmeticOperators {
    public static void main(String[] args) {

         /**
       + - * \ %
          islem onceeligi
       1.   () icindeki islemler
       2.    *  \ %
       3.    + -

       */

        System.out.println("90" +10);  //9010
        System.out.println(10 + "90");  //1090
        System.out.println(10 +10+"90");  //2090
        System.out.println(10+ "90"+10);  //109010
        System.out.println("90" +10 +10);  //901010
        System.out.println(10+20+30+"90");  //6090
        System.out.println("" +10+20+"90");   //1020990

        int x=5;
        int y=2;
        int z=x+y;   //7
        System.out.println("z = " + z);


        System.out.println("Merhaba" +x+y);  //Merhaba52
        //                          "5"+"2
        System.out.println(x-y+"Merhaba");    //3Merhaba
       // System.out.println("Merhaba"+x-y);  hata verir.!tirnaktan(String) önce gelen hersey hesaplanabilir,
                                             // Stringden sonra sadece eklenebilir o yuzden cikarma yapilacak
                                             // bir islem tanimaz.

        System.out.println("Merhaba"+"Dunya");

        //  5 / 2 * 4 % ( 12 -9)     ( % )mod olarak adlandiriyor
        double num=(double)5 / 2 * 4 % (12-9);
        //                 5 / 2 * 4 %  3
        //                  2.5  * 4 %  3
        //                        10 %  3     % --> burda hesaplamada kalani yazar!
        //                            1

        System.out.println("num=" + num);






































    }


}
