package day23_Review;

public class C02_HierarcicalMethodCall {

    public static void main(String[] args) {

        System.out.println("Main Method");
        mesajGoster();
        System.out.println("Tekrar Main Method");

    }
    public static void mesajGoster(){
        System.out.println("Merhaba Dunya");
        hesapMakinasi();
        System.out.println("Tekrar mesaj goster methodunda");
    }

    public static void hesapMakinasi(){
        System.out.println(10*3/2+1);
    }
}
