package day16_NestedForLoops;

public class C02_Task_1 {
    public static void main(String[] args) {
        /**
         * 1 yil =12 ay
         * 1 ay = 30 gun varsayimina gore
         * 40 yil yasamis birisi
         * -- kac ay yasamistir?
         * --kac gun yasamistir?
          */
        int yas =40;
        int yilSayisi=0;
        int aySayisi=0;
        int gunSayisi=0;

        for (int yil=1;yil<41;yil++){
            yilSayisi++;
            for (int ay=1;ay < 13; ay++){
                aySayisi++;
                for (int gun=1;gun < 31; gun++){
                    gunSayisi++;

                }
            }
        }
        System.out.println("yilSayisi = " + yilSayisi);
        System.out.println("aySayisi = " + aySayisi);
        System.out.println("gunSayisi = " + gunSayisi);


    }
}
