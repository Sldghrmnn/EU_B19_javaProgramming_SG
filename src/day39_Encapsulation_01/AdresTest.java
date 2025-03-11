package day39_Encapsulation_01;

public class AdresTest {
    public static void main(String[] args) {

        Adres adres= new Adres("Ataturk Caaddesi no:345","Istanbul","Turkiye");
        System.out.println("adres = " + adres);

        adres.setStreet("");
        System.out.println("adres = " + adres);
    }
}
