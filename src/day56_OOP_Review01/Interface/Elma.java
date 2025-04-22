package day56_OOP_Review01.Interface;

import java.util.ArrayList;

public class Elma implements Tagabale {

    private String name;

    private static final ArrayList<Tagabale> sepet= new ArrayList<>();

    public Elma(String name) {this.name = name;}

    public static void sepetListe() {
        System.out.println("Elma sepetindeki elmalar");
        System.out.println("--------------------------");

        for (Tagabale elma : sepet) {
            System.out.println( ((Elma)elma).name);
        }
    }

    @Override
    public void select(Tagabale tagabaleObj) {sepet.add(tagabaleObj);}
}
