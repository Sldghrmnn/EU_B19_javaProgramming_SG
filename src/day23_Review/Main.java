package day23_Review;

public class Main {
    public static void main(String[] args) {

        MobilePhone cepTelefonu=new MobilePhone();

        System.out.println("cepTelefonu.boyut = " + cepTelefonu.boyut);


        cepTelefonu.marka="Samsung";
        cepTelefonu.model="Aura";
        cepTelefonu.renk="Siyah";
        cepTelefonu.fiyat=1100;
        cepTelefonu.boyut=16;
        cepTelefonu.kapasite=120;
        cepTelefonu.mesajAtabiliyorMu=true;

        cepTelefonu.ara();



        System.out.println("-------------------------------");

        Cake cake1=new Cake();
        cake1.kekYapan="Selda";
        cake1.yumurtaliMi=false;
        cake1.agirlik=1;


        Cake cake2=new Cake();
        cake2.kekYapan="Metin";
        cake2.yumurtaliMi=true;
        cake2.agirlik=2;

        cake1.kekYe();
        cake1.kekYe();
        System.out.println("cake1.dilim = " + cake1.dilim);

        cake2.kekYe();
        cake2.kekYe();
        cake2.kekYe();
        cake2.kekYe();
        System.out.println("cake2.dilim = " + cake2.dilim);

        System.out.println("Cake.kekDilimi = " + Cake.kekDilimi);


    }
}
