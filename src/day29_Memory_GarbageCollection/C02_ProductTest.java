package day29_Memory_GarbageCollection;

public class C02_ProductTest {
    public static void main(String[] args) {
        C01_Product urun1 = new C01_Product();
        C01_Product urun2 = new C01_Product();
        C01_Product urun3 = new C01_Product();
        // urun1,urun2,urun3 ---> heap memory'de olusan nesnenin adresini/referansini
        // barindiran ve stack'te olusan degiskenler

        urun1.name ="Elma";  // heap memory'de bulunur
        urun1.unitPrice = 15; // heap memory'de bulunur

        urun2.name ="Elma";  // heap memory'de bulunur
        urun2.unitPrice = 15; // heap memory'de bulunur

        urun3.name ="Elma";  // heap memory'de bulunur
        urun3.unitPrice = 15; // heap memory'de bulunur


        System.out.println("urun1 = " + urun1);
        System.out.println("urun2 = " + urun2);
        System.out.println("urun3 = " + urun3);

        System.out.println("(urun1 == urun2) = " + (urun1 == urun2));

        System.out.println("urun1.name = " + urun1.name);
        System.out.println("urun3.name = " + urun3.name);

        urun1 = urun3; //urun1 artik urun3 e ait referansi tutmaktadir

        System.out.println("urun1 = " + urun1);
        System.out.println("urun2 = " + urun2);
        System.out.println("urun3 = " + urun3);


        System.out.println("urun1.name = " + urun1.name);
        System.out.println("urun3.name = " + urun3.name);

    }
}
