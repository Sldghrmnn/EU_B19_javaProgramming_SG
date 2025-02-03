package day18_Review_BranchmentAndLabeledStatements;

public class C05_Counter {
    public static void main(String[] args) {
        // 1 den 1000'e kadar olan sayilar icerisinde 17'e tam bolunuebilen
        // kac sayi oldugunu bulan bir kod yaziniz.
        //cevap: 58

        int counter = 0;

        for (int i = 1; i <= 1000; i++){
            if (i % 17 == 0){
                counter++;
            }
        }

        System.out.println(" 1-1000 arasinda 17'e tam bolunen " +counter+" sayi vardir.");

        //while loop ile deneeyelim birde

        int index = 0;
        int counter1 = 0;
        while (index <= 1000){
            index++;
            if (index % 17 == 0){
                index++;
            }
        }
        System.out.println("conter1 = " + counter1);



    }
}
