package day56_OOP_Review01.Interface;

import java.util.ArrayList;

public class Armut implements Tagabale {

    private String name;

   // private static final ArrayList<Armut> sepet= new ArrayList<>();
   private static final ArrayList<Tagabale> sepet = new ArrayList<>();

    public Armut(String name) {this.name = name;}

    public static void sepetListe(){
        System.out.println("Armut sepetindeki armutlar");
        System.out.println("--------------------------");

        for (Tagabale armut :sepet ) {
            System.out.println(((Armut)armut).name);
        }
    }

    @Override
    public void select(Tagabale tagabaleObj) {sepet.add(tagabaleObj);}
}
