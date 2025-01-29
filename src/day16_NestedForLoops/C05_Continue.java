package day16_NestedForLoops;

public class C05_Continue {
    public static void main(String[] args) {
        /**
         * continue; // skip,atlamak demek
         *    -- sadeece Loop icerisinde kullanilir
         *    -- continue den sonraki kod kismi atlanir, caalistirmaz
         *
         *    break ve continue dan hemen sonra ,ayni statement in icinde kod yazilamaz:
         *    Unreaachable statement hatasi verir...
          */
        for (int i=1; i<5;i++){
            if (i==3){
                break;
            }
            System.out.println("i = " + i);
        }
        System.out.println("****************************************");

        for (int i=1; i<5;i++){
            if (i==3){
                continue;
            }
            System.out.println("i = " + i);
        }
        System.out.println("****************************************");

        for (int i=1; i<20;i++){
            if (i%2==0){
                continue;
            }
            System.out.println("i = " + i);
        }
        /**
         * 1-1000 arasinda 3 e ve 5 e ortak bolunen
         *  -saayilari ekrana yazdiriniz
         *  -sayilarin adedini yazdiriniz
         */
        System.out.println("****************************************");
        int count=0;
        for (int i=1; i<=1000;i++){
            // cozum 1
            if (!(i%3==0 && i%5==0)){
                count++;
                System.out.println("i = " + i);
            }
            //cozumm 2
            if (!(i%3==0 && i%5==0)){
                continue;
            }
            count++;
            System.out.println("i = " + i);
        }
        System.out.println("count = " + count);


    }
}
