package day15_ForLoops;

public class C01_ForLoop_1 {
    public static void main(String[] args) {
        // 5 kere "Hello World" yazdirin.

        // old way - eski sistem

        String massege = "Hello World";

        System.out.println(massege);
        System.out.println(massege);
        System.out.println(massege);
        System.out.println(massege);
        System.out.println(massege);

        System.out.println("---------------------------");

        // new way with loop- yeni sistem

        for (int i =0 ; i < 5; i++){
            System.out.println(massege);
        }

            // for (;;){
           // System.out.println("Selda");
            // bir  detayi olmadigi icin sonsuz kez selda yazar!
        }

        // local variable sadece tanimli oldugu loop'da erisilen bir yapidadir





    }

