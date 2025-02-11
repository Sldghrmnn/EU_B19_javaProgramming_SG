package day23_Review;

public class DogTest {
    public static void main(String[] args) {

        //             Stack              Heap
        //Classname Objectname =new Keyword ClassName();---- obje olusturma yontemi
              Dog        dog     = new         Dog();

              Dog        dog3    = new Dog();

        System.out.println(dog);

            dog.ad="Karabas";
            dog.cins="Kangal";
            dog.renk="Beyaz";
            dog.yas=5;

        System.out.println("dog.ad = " + dog.ad);
        System.out.println("dog.renk = " + dog.renk);
        System.out.println("dog.cins = " + dog.cins);
        System.out.println("dog.yas = " + dog.yas);

        // obje uzerinden eylemleri tekrar cagirabilirim

        dog.havla();
        dog.sueuGud();
        dog.mamaYe();
        dog.isir();

        System.out.println("----------------------------------------");
        Dog dog2 = new Dog();

        dog2.ad="Alf";

        System.out.println("dog2.ad = " + dog2.ad);

        // int icin default 0
        System.out.println("dog2.yas = " + dog2.yas);

        //boolean icin default deger false
        System.out.println("dog2.evcilMi = " + dog2.evcilMi);

        //char icin default deger
        System.out.println("dog2.cins = " + dog2.cins);

        System.out.println("--------------------------------------------");

        dog3.ad="Mavi";
        System.out.println("dog3.ad = " + dog3.ad);
        dog3.havla();
        dog3.isir();
        dog3.mamaYe();

        dog=dog3;

        System.out.println("dog.ad = " + dog.ad);

        System.out.println("----------------------------------------");



    }
}
