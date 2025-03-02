package day33_ReviewArray;

import java.util.Arrays;

public class C01_RaggedArraySentencesAndWords {
    public static void main(String[] args) {
        String text = "Bu iceisinde cumleler olan örnek bir dökümandir. Icerisindeki cumleler gayet "+
                "dogal olarak farkli sayida kelime icermektedir. Cumleler birbirinden nokta ile ayrilirken "+
                "kelimeler birbirindenn bosluk ile ayrilmistir .Bu taskin hedefi her bir cümlenin kac kelimeden olustugunu "+
                "arrayleri kullanarak bulmaktadir.";

        String[]cumleler = text.split("\\.");

        System.out.println("Arrays.toString(cumleler) = " + Arrays.toString(cumleler));

        System.out.println("cumleler.length = " + cumleler.length);

        String [][] kelimeler = new String[cumleler.length][];
        for (int i = 0; i < cumleler.length; i++) {
            kelimeler[i] = cumleler;// cumleyi " " bosliklaran bolerek array'e cevirir
        }

        for (String [] satir :kelimeler ) {
            int counter = 0;
            for (String kelime :satir ) {
                System.out.print(kelime +" - ");
                counter++;
            }
            System.out.println();
            System.out.println("Bu cumle "+counter+" kelimeden olusmaktadir");
        }

    }
}
