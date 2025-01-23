package day10_IfStatements;

public class C03_If_Example {
    public static void main(String[] args) {

      double fizik= 50;
      double kimya= 30;
      double ortalama= (fizik + kimya) /2;
        System.out.println("ortalama = " + ortalama);

        if (ortalama>50) {
            System.out.println("Ali gecti");
            System.out.println("Ogretmen Ali yi tebrik etti");
        }else {
            System.out.println("Ali kaldi");
            System.out.println("Ogretmen Ali ye cok calismalisin dedi.");

        }
        System.out.println("Program bitti");


    }
}
 /*
alinin fizik notu 50
kimya notu 30
ortalaması 50 üzerinde ise ekrana geçti yazsın
50 altında ise herhangi bir şey yazdırmasız
 */

/*
 if ( condition ) {

Condition true ise bu bady nin içindeki işlemleri yapar
Condition false ise bu body nin içindeki işlemler atlar

}

        else {
condition true ise bu body nin içindeki işlemleri atlar
condition false ise bu body nin içindeki işlemleri yapar
}

 */