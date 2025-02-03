package day17_DDoWhileLoops;

public class C04_DoWhileLoops {
    public static void main(String[] args) {
        /**
         * Do-While Loops
         *
         * do{
         *    // en az 1 kez calistiriliyor
         * }while(kosul)
         */

        do {
            // 1. step code
        }while (false);  // 2.step kosul kontrol ediliyor,ve dogru ise kod calistirilmaya devam ediyor

       int input=5;
        do {

            if (input==8){
                System.out.println("Sayi 8 oldugu icin program sonlanacak!");
                break;
            }

            if (input==7){
                System.out.println("Sayi 7 oldugu icin continue calisacak !");
                input++;
                continue;
            }
            input++;
            System.out.println("Girilen sayi "+input);
        }while (input<10);


    }
}
