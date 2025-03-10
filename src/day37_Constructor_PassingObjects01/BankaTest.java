package day37_Constructor_PassingObjects01;

public class BankaTest {
    public static void main(String[] args) {
        Banka banka1 = new Banka();
        System.out.println("banka1.name = " + banka1.name);
        System.out.println("banka1.name.length() = " + banka1.name.length());

        System.out.println("banka1.adress = " + banka1.adress);
        System.out.println("banka1.hesapNo = " + banka1.hesapNo);
        System.out.println("banka1.hashCode() = " + banka1.hashCode());

        banka1.name ="ABC Bankasi";
        System.out.println("banka1.name = " + banka1.name);
        System.out.println("banka1.name.length() = " + banka1.name.length());


        Banka banka2 = new Banka("XYZ Bankasi","XYZ bulvari no:3",5000);
        System.out.println("banka2.name = " + banka2.name);
        System.out.println("banka2.adress = " + banka2.adress);
        System.out.println("banka2.hesapNo = " + banka2.hesapNo);


        System.out.println("banka1.müsteriler.size() = " + banka1.musteriler.size());

        Musteri musteri = new Musteri("Alper Falanca","90-316-2343445");
        Musteri musteri1 = new Musteri("Arzu Albay","90-212-5677689");
        Musteri musteri2 = new Musteri("Arzu Unal","49-266-2315455");
        Musteri musteri3 = new Musteri("Selda Simsek","49-216-3672765");

        System.out.println("musteri.name = " + musteri.name);

        banka2.musteriEkle(musteri); //passing object to method
        banka2.musteriEkle(musteri1); //passing object to method
        banka2.musteriEkle(musteri2); //passing object to method
        banka2.musteriEkle(musteri3); //passing object to method

        System.out.println("banka2.müsteriler.size() = " + banka2.musteriler.size());

        banka2.paraYatir(musteri,100);
        System.out.println("musteri.bakiye = " + musteri.bakiye);

        banka2.paraYatir(musteri,340);
        System.out.println("musteri.bakiye = " + musteri.bakiye);

        banka2.paraYatir(musteri1,1575);
        banka2.paraYatir(musteri2,1000000);

        banka2.musteriListe();

        banka2.paraCek(musteri,123);

        banka2.musteriListe();









    }
}
