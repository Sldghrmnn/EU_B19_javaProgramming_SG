package day23_Review;

public class MobilePhone {

    String marka;
    String model;
    String renk;
    int fiyat;
    double  boyut;
    int  kapasite;
    boolean mesajAtabiliyorMu;


    public void ara(){
        System.out.println(model+" arama yapiyor");
        mesajAt();
    }
    public void mesajAt(){
        System.out.println(model+" mesaj atiyor");
        fotografCek();
    }
    public void fotografCek(){
        System.out.println(model+" Fotograf cekiyor");
        interneteBaglan();
    }
    public void interneteBaglan(){
        System.out.println(model+" Internete baglaniyor");
        System.out.println("Ana menuye dondu");
    }
}
/*
marka
model
renk
fiyat
boyut
kapasite
mesajAtabiliyorMu


ara()
mesajAt()
fotografCek()
interneteBaglan()
 */