package day37_Constructor_PassingObjects01;

public class Musteri {
    String name;
    int hesapNo;
    String phone;
    double bakiye;


    public Musteri() {

    }


    public Musteri(String name,String phone) {
        this.name = name;
        this.phone= phone;
    }

    public double getBakiye(){
        return this.bakiye;
    }

    public void showInfo(){
        System.out.println("**** Müşteri Bilgileri ******");
        System.out.println("Müşterini adı            :"+ this.name );
        System.out.println("Müşterini telefonu       :"+ phone );
        System.out.println("Müşterini hesap No       :"+ hesapNo );
        System.out.println("Müşterini bakiyesi       :"+ bakiye );
    }






}
