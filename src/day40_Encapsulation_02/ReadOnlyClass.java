package day40_Encapsulation_02;

import java.util.ArrayList;
import java.util.Locale;

public class ReadOnlyClass {

    // Instance variables --objeye aittir
    private int plaka;
    private  String ilAdi;


    private static ArrayList<String> iller = new ArrayList<>();

    public ReadOnlyClass(int plaka, String ilAdi) {
       /*
        this.plaka = plaka;
        this.ilAdi = ilAdi;
        */
        setPlaka(plaka);
        setIlAdi(ilAdi);
        setIl();
    }

    public int getPlaka() {
        return plaka;
    }

    private void setPlaka(int plaka) {
        if (plaka > 0 && plaka <= 81){
            this.plaka = plaka;}
    }

    public String getIlAdi() {
        return ilAdi;
    }

    private void setIlAdi(String ilAdi) {
        this.ilAdi = ilAdi.toUpperCase();
    }

    public void setIl(){
        String str = plaka + " - " + ilAdi;
        iller.add(str);
    }

    public ArrayList<String> getIller() {
        return iller;
    }

    public ArrayList<String> getIllerV1() {
        return new ArrayList<>(iller);
    }


}
