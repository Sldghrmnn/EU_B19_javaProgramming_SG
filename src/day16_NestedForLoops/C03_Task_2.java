package day16_NestedForLoops;

public class C03_Task_2 {
    public static void main(String[] args) {
        /**
         * 1 2 3 4 5
         * 1 2 3 4 5
         * 1 2 3 4 5
         *
         *
         * 1 2 3 4 5
         * 1 2 3 4
         * 1 2 3
         * 1 2
         * 1
         *
         *      x x x x x
         *      x x x x
         *      x x x
         *      x x
         *      x
         *
         *      x
         *      x x
         *      x x x
         *      x x
         *      x
         */
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.print("\n");
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j <= 6 - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" x");
            }
            System.out.println();
        }
        System.out.print("\n");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("x ");
            }
            System.out.println();
        }
        for (int i = 2; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("x ");
            }
            System.out.println();
        }
        System.out.println("-------------------------------------\n");
        for (int i = 1; i < 6; i++) {
            if (i <= 3) {
                // inner loop 1
                for (int j = 1; j <= i; j++) {
                    System.out.print("x ");
                }
                System.out.println();
            } else {
                // inner loop 2
                for (int k = 5; k >= i; k--) {
                    System.out.print("x ");
                }
                System.out.println();
            }
        }

/***
 *      x           kutu 1  findik sayisi 1
 *      x x         kutu 2  findik sayisi 1-2
 *      x x x       kutu 3  findik sayisi 1-3
 *      x x x x     kutu 4  findik sayisi 1-4
 *      x x x x x   kutu 5  findik sayisi 1-5
 *      x x x x     kutu 6  findik sayisi 1-4
 *      x x x       kutu 7  findik sayisi 1-3
 *      x x         kutu 8  findik sayisi 1-2
 *      x           kutu 9  findik sayisi 1
 */

        // Hint :

        // outer loop
        for (int i = 1; i < 10; i++) {
            if (i <= 5) {
                // inner loop 1
                for (int j = 1; j <= i; j++) {
                    System.out.print("x ");
                }
                System.out.println();
            } else {
                // inner loop 2
                for (int k = 9; k >= i; k--) {
                    System.out.print("x ");
                }
                System.out.println();
            }
        }
        // ornek cozum:
        int kutuSayisi = 9;
        for(int i=1;i<=kutuSayisi;i++){
            int findikSayisi = i;
            if(i>(kutuSayisi/2 +1)){
                findikSayisi = kutuSayisi + 1 - i;
            }
            for(int j=1;j<=findikSayisi;j++){
                System.out.print("x ");
            }
            System.out.println();
        }


    }
}

