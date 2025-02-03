package day18_Review_BranchmentAndLabeledStatements;

public class C16_LabeledForLoop {
    public static void main(String[] args) {
        // nested i ve j dongulerinde
        // i ve j'nin carpimiyla hedef sayisina ulasinca donguyu bitiren
        // kodu yaziniz
        // eger hedeflenen rakam carpim sonucunda olusmuyorsa
        // bu durum ayrica belirtilsin.

        int hedefSayi = 16;
        boolean bulunduMu = false;
        loopA:
        for (int i = 1; i <= 10 ; i++) {
            System.out.println("i = " + i);
            for (int j = 1; j <= 5 ; j++) {
                System.out.println("j = " + j);
                if (i * j == hedefSayi){
                    System.out.println("Hedef sayiya ulasildi.. "+hedefSayi);
                    bulunduMu = true;
                    break loopA;
                }

            }

        }
        if (!bulunduMu){
            System.out.println("Hedef sayiya ulasilamadi.. "+hedefSayi);
        }






    }
}
