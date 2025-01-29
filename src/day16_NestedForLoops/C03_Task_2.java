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
        for (int i=1;i<=3;i++){
            for (int j=1;j<=5;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.print("\n");
        for (int i=5;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for (int i=5;i>=1;i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" x");
            }
            System.out.println();
        }
        System.out.print("\n");
        for (int i=1;i<=3;i++){
            for (int j=1;j<=i;j++){
                System.out.print(" x");
            }
            System.out.println();
        }
        for (int i=2;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print(" x");
            }
            System.out.println();
        }








    }
}

