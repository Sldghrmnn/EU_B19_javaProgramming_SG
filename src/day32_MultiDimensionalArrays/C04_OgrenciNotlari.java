package day32_MultiDimensionalArrays;

public class C04_OgrenciNotlari {
    public static void main(String[] args) {
        int[][] ogrenciler = new int[5][3];

        int [] ogrenci1;
        ogrenci1= new int[]{90,80,75};

        int[] ogrenci2 = {55,90,70};
        int[] ogrenci3 = {90,90,100};
        int[] ogrenci4 = new int[]{78,89,76};

        ogrenciler[0] = ogrenci1;
        ogrenciler[1] = ogrenci2;
        ogrenciler[2] = ogrenci3;
        ogrenciler[3] = ogrenci4;
        ogrenciler[4] = new int[]{100,89,95};

        C03_TwoDimArrayPrintMethods.forEachPrint(ogrenciler);

        //birinci ogrencinin notunu guncelleme

        ogrenciler[0][2]= 100;

        C03_TwoDimArrayPrintMethods.forEachPrint(ogrenciler);
        System.out.println("-------------------");
        //for i methodu ile ogrenci notlarini yazdiralim

        for (int ogrenci = 0; ogrenci < ogrenciler.length ; ogrenci++) {
            for (int not = 0; not < ogrenciler[ogrenci].length ; not++) {
                System.out.println(ogrenciler[ogrenci][not]+"\t\t");
            }
            System.out.println();
        }

    }
}
