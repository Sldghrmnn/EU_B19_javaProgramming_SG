package day23_Review;

public class DogTest {
    public static void main(String[] args) {

        // Stack: daha kucuk bir hafiza-Objenin adi icin. icinde olusuyor
        // Heap: daha buyuk bir hafiza -Objenin kendisi icin(ozellikler ve methodlar)icinde olusuyor.

        //          Stack memory        Heap memory
        //Classname ObjectName = new Keyword  ClassName();---- obje olusturma yontemi
              Dog        dog   = new         Dog();

        System.out.println("dog = " + dog);

              Dog        dog3  = new         Dog();

        System.out.println(dog);

            dog.ad="Karabas";
            dog.cins="Kangal";
            dog.renk="Beyaz";
            dog.yas=5;

        System.out.println("dog.ad = " + dog.ad);
        System.out.println("dog.cins = " + dog.cins);
        System.out.println("dog.renk = " + dog.renk);
        System.out.println("dog.yas = " + dog.yas);


        dog.havla();
        dog.isir();
        dog.mamaYe();
        dog.suruGut();

        // obje uzerinden field'e yeni atama yapabiliriz
        dog.yas=7;

        System.out.println("dog.yas = " + dog.yas);

        // obje uzerinden eylemleri tekrar cagirabilirim

        dog.havla();
        dog.mamaYe();

        System.out.println("----------------------------------------");

        Dog dog2 = new Dog();

        //defaul degerler
        //String icin Null
        System.out.println("dog2.ad = " + dog2.ad);
        System.out.println("dog2.cins = " + dog2.cins);
        System.out.println("dog2.cins = " + dog2.renk);

        // int icin default 0
        System.out.println("dog2.yas = " + dog2.yas);

        //boolean icin default deger false
        System.out.println("dog2.evcilMi = " + dog2.evcilMi);

        //char icin default deger
        System.out.println("dog2.cinsiyet = " + dog2.cinsiyet);


        System.out.println("--------------------------------------------");

        dog3.ad="Mavi";
        System.out.println("dog3.ad = " + dog3.ad);

        dog3.havla();
        dog3.isir();
        dog3.mamaYe();

        dog=dog3;
        System.out.println("dog.ad = " + dog.ad);
        dog.havla();
        dog.mamaYe();
        dog.isir();





    }
}
