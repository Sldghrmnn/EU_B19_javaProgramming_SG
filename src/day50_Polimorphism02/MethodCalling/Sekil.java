package day50_Polimorphism02.MethodCalling;

public class Sekil {

    public void ciz(){System.out.println("sekil ciziliyor");}

    public void sekilOlustur(){System.out.println("sekil olusturuluyor");}

    public double alanHesapla(int i){return 0;}
}



class Kare extends Sekil{

    public void ciz(){System.out.println("kare ciziliyor");}

    public double alanHesapla(int i){return i*i;}
}


class Ucgen extends Sekil{

    public void ciz(){System.out.println("ucgen ciziliyor");}

    public double alanHesapla(int i){return i*i*i;}
}


class Daire extends Sekil{

    public void ciz(){System.out.println("Daire ciziliyor");}

    public double alanHesapla(int i){return Math.PI*i*i;}
}



class SekilTest{
    public static void main(String[] args) {

        Sekil sekil = new Sekil();
        sekil.ciz();
        sekil.sekilOlustur();

        Kare kare = new Kare();
        kare.ciz();
        kare.sekilOlustur();

        System.out.println("-----------------------");

        Sekil sekil1 = new Kare();
        sekil1.ciz();
        sekil1.sekilOlustur();

        System.out.println("-----------------------");

        Sekil sekil2 = new Ucgen();
        sekil2.ciz();
        sekil2.sekilOlustur();

        System.out.println("-----------------------");

        Sekil sekil3 = new Daire();
        sekil3.ciz();
        sekil3.sekilOlustur();
    }
}