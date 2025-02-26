package day32_MultiDimensionalArrays;

public class C06_ÖgrenciTestKontrol {
    public static void main(String[] args) {

        // 8 ögrenciye ait cevaplar
        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}, //1.Öğrenci Cevapları
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'}, //2.Öğrenci Cevapları
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'}, //3.Öğrenci Cevapları
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'}, //4.Öğrenci Cevapları
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}, //5.Öğrenci Cevapları
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}, //6.Öğrenci Cevapları
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}, //7.Öğrenci Cevapları
                {'D', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}  //8.Öğrenci Cevapları
        };

        //dogru cevap anahtari
         char[] keys = {'D','B','D','C','C','D','A','E','A','D'};

        System.out.println("Ögrenci Not Sonuclari");

        for (int ögrenci = 0; ögrenci < answers.length; ögrenci++) {
             int dogruCevapSayisi = 0;
             String yanlis = "";

            for (int cevap = 0; cevap < answers[ögrenci].length; cevap++) {
                if (answers[ögrenci][cevap]== keys[cevap]){
                    dogruCevapSayisi++;
                }else{
                 yanlis += cevap + 1 +"-"+answers[ögrenci][cevap]+"-> "+keys[cevap]+" / ";
                }
            }
            System.out.println(ögrenci + 1 +".ögrencinin dogru cevap sayisi : "+dogruCevapSayisi);
            System.out.println("Yanlis cevaplar : "+yanlis);
        }
    }
}
