package day16_NestedForLoops;

public class C04_Break {
    public static void main(String[] args) {
        /**
         * Break; kirma,biraakma,terketme
         * (atlama)
         * --Switch - Loop icerisinde kullanilir.
          */
        for (int i=1; i <=20; i++){
            System.out.print(i + ", ");
            if (i == 16){
                System.out.println("Burasi Almanya, burdan cikis yok!");
                break;
            }
        }
        System.out.println("---------------------------------------");

        int toplam =0;
        for (int i =1; i <100; i++){
            System.out.print(i + ", ");
            toplam += i;
            if (160 <= toplam){
                break;
            }

        }
        System.out.println("toplam = " + toplam);

        System.out.println("---------------------------------------");

        int toplam1 =0;
        for (int i =1; i <1000; i++){
            System.out.print(i + ", ");
            toplam1 += i;
            if (10000 <= toplam){
                break;
            }
        }
        System.out.println("toplam = " + toplam1);
        System.out.println("--------------------------------------");
        hans:  //etiket herhangi bir sey yazilabilir
        for (int i=1; i<=10; i++){
            for (int j =1; j<=10; j++){
                if (i * j==16 || i * j==20){
                   // break; // inner loop un sonuna atiyor
                    break hans; //outer loop un sonuna atar
                }
                System.out.println( i +"*"+ j + "=" + i*j +"\t");
            }
        }// breaak hans-> buraya gönderir


        // 1*1=1   1*2=2 ......1*10=10
        // 2*1=2   2*2=4 ......2*7=14   (2*8=16)
        // 3*1=3   3*2=6.......3*10=30
        // 4*1=4   4*2=8........( 4*4=16)
        // 5*1=5   5*2=10.....(5*4=20)











    }
}
