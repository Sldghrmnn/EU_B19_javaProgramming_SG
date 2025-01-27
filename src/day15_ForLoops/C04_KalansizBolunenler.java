package day15_ForLoops;

public class C04_KalansizBolunenler {
    public static void main(String[] args) {
        // 1 ila 100 arasinda 5 ile kalansiz bolunen sayilari yazdirin.

        for (int i = 1; i <= 100; i++){
            if (i % 5 == 0){
                System.out.println("i = " + i);
            }
        }
        System.out.println("--------------------------------------------------");

        // 2.yol
        for (int i =5; i <=100; i+=5){
            System.out.println("i = " + i);
        }
        System.out.println("--------------------------------------------");
        // 1 iila 50 arasinda 6 ya tam bolunen ssailarin toplami kactir?

        int toplam = 0;
        for (int i = 1; i <=50; i++){
            if (i % 6==0){
             toplam += i;
            }
        }

        System.out.println("toplam = " + toplam);
        int toplam2 = 0;

        //2.yol
        for (int i =6; i <= 50; i+=6){
            toplam2 += i;
        }
        System.out.println("toplam2 = " + toplam2);


    }
}
