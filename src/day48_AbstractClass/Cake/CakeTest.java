package day48_AbstractClass.Cake;

public class CakeTest {
    public static void main(String[] args) {

        VanilyaliKek vanilyaliKek=new VanilyaliKek(2,300,150,1,200,200);
        vanilyaliKek.setVanilya(2);
        vanilyaliKek.karistir();

        CikolataliKek cikolataliKek=new CikolataliKek(2,300,150,1,200,200);
        cikolataliKek.setCikolata(100);
        cikolataliKek.karistir();
        cikolataliKek.pisir();
    }
}
