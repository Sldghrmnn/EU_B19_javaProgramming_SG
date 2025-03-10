package day38_Constructor_PassingObjects02.okul;

public class Adres {
    String cadde;
    String ilce;
    String sehir;
    int no;

    public Adres() {
        System.out.println("No params");
        cadde="Belirtilmemis";
        ilce="Belirtilmemis";
        sehir="Belirtilmemis";
        no=0;
    }

    public Adres(String sehir) {
        /*
        cadde="Belirtilmemis";
        ilce="Belirtilmemis";
        no=0;
         */
        this();  // constructor chaining--- bir costructor icinde baska bir constr.cagrilmasidir.
        System.out.println("Sehir parametreli");
        this.sehir = sehir;
    }

    public Adres(String ilce,String sehir){
     /*  this() ;
        this.sehir=sehir;
     */
        this(sehir);
        System.out.println("2 parametreli");
        this.ilce = ilce;
        //this.sehir=sehir;
    }


    public Adres(String cadde, String ilce, String sehir, int no) {
        this.cadde = cadde;
        this.ilce = ilce;
        this.sehir = sehir;
        this.no = no;
    }

    public String toString() {
        return "Adres{" +
                "cadde = " + cadde +
                ", ilce = " + ilce +
                ", sehir = " + sehir +
                ", no = " + no +
                "}";

    }
}
