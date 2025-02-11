package day23_Review;

public class MobilePhone {



    String marka;
    String model;
    String renk;
    double fiyat;
    double  boyut;
    int  kapasite;
    boolean mesajAtabiliyorMu;


    public void ara(){
        System.out.println(model+" arama yapiyor");
    }
    public void mesajAt(){
        System.out.println(model+" mesaj atiyor");
    }
    public void fotografCek(){
        System.out.println(model+" Fotograf cekiyor");
    }
    public void interneteBaglan(){
        System.out.println(model+" Internete baglaniyor");
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