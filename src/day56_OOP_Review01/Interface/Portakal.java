package day56_OOP_Review01.Interface;

import java.util.ArrayList;

public class Portakal implements Tagabale{

    private String name;

    private static final ArrayList<Tagabale> sepet= new ArrayList<>();

    public Portakal(String name) {this.name = name;}

    public static void sepetListe() {
        System.out.println("Portakal sepetindeki portakallar");
        System.out.println("--------------------------");

        for (Tagabale portakal: sepet) {
            System.out.println( ((Portakal)portakal).name);
        }
    }

    @Override
    public void select(Tagabale tagabaleObj) {sepet.add(tagabaleObj);}
}
