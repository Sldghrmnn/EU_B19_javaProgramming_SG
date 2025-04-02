package day50_Polimorphism02.MethodCalling;

public class InstanceOf {
    public static void main(String[] args) {


        Sekil sekil = new Daire();
        Sekil sekil1 = new Kare();
        Sekil sekil2 = new Ucgen();

        if (sekil1 instanceof Kare kare){
            System.out.println(kare.alanHesapla(4));
        }
        if (sekil1 instanceof Ucgen){
            System.out.println(sekil1.alanHesapla(4));
        }
        if (sekil1 instanceof Daire){
            System.out.println(sekil1.alanHesapla(4));
        }
    }
}
