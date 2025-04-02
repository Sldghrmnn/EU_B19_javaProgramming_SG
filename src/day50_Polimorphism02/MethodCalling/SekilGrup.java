package day50_Polimorphism02.MethodCalling;

import day49_Polimorphism01.RunTime.Cat;

public class SekilGrup extends Object {
    public static void main(String[] args) {

        String [] strings = new String[4];

        //Sekil sekil = new Sekil();
        //Kare kare = new Kare();

        Sekil [] sekiller = new Sekil[3];//icerisinde 3 tane eleman olan bir array tanimliyorum
                                        // bu 3 eleman sekil tipinde olmalidir
        sekiller[0]= new Kare();
        sekiller[1]= new Ucgen();
        sekiller[2]= new Daire();



        for (Sekil sekil : sekiller) {
        	sekil.ciz();
        }


        System.out.println("--------------------------");

        for (Sekil sekil : sekiller) {
            System.out.println(sekil.getClass().getSimpleName());
            if (sekil.getClass().getSimpleName().equalsIgnoreCase("kare")){
                System.out.println(sekil.alanHesapla(4));
            }
        }




      /*
        Object [] objects = new Object[4];
        objects[0]= new Cat("Pamuk");

       */
    }
}
