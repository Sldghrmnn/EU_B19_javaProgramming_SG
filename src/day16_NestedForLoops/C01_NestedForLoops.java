package day16_NestedForLoops;

public class C01_NestedForLoops {
    public static void main(String[] args) {
        /**
         * Nesteed For Loop -ic ice For donguleri
         * (döngü) Loop nerelerde kullanilir:
         * --tekrarlayan,benzer(ayni)islemleri yaptirmak icin
         *   ör:ex: Sayi dizisinde istenilen sayiyi arama
         *
         *   Nested Loop nerelerde kullanilir?
         *   --2 boyutlu bir tekrar isleminde kullanilir
         *   ör:ex: tekrarlanan islemlerin boyutlari 1 den fazla ise...
         *   x x x x
         *   x x x x
         *   x x o x
          */
        for (int i = 1; i < 3; i++){   // 2 satir
            //code
            //System.out.println("x");
            System.out.print("i = " + i);
            for (int j =1; j < 5; j++){  //4 sütun
                //code
               // System.out.print("x");

                System.out.print("j = " + j);
            }
            System.out.println();
        }
        System.out.println("*********************************************");
        //x basma
        for (int j = 1; j < 6; j++){
            System.out.print("x ");
        }
        System.out.println("\n*******************************************");
        for (int i = 1; i < 4; i++){
            //x basma
            for (int j = 1; j < 6; j++){
                System.out.print("x ");
            }
            System.out.println();
        }

        /**           j=1     j=2    j=3    j=4    j=5
         *  (i=1)      x       x      x      x      x
         *  (i=2)      x       x      x      x      x
         *  (i=3)      x       x      x      x      x
         *
         */


    }
}
