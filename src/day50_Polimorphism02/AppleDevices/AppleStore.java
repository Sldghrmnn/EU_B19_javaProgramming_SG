package day50_Polimorphism02.AppleDevices;

public class AppleStore {
    public static void main(String[] args) {

        AppleDevice mac = new Mac();
        mac.use();
        //mac.code();--- refereans type bu metoda ulasmayi engelliyor
        //cunku bu method child class tarafindan ovveride edilmemistir

        AppleDevice ipad = new Ipad();
        ipad.use();
        //ipad.draw();

        Ipad ipad1 = new Ipad();
        ipad1.use();
        ipad1.draw();

    }
}
