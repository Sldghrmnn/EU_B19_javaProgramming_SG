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
        // local variable sadece tanimli oldugu loop'da erisilen bir yapidadir

        if (massege.equals("dd")){
            int j =0;
            System.out.println("j = " + j);
        }
       // System.out.println("j = " + j);hata verir

        //global degisken clasin her yerinde degisim olur
        // orn; i yi bady iicinde atamissan süslü parantezin disinda tanimaz...
        // tanimasi icin i yi daha once atamasini yapman gerekir
        }
          // for (;;){
        // System.out.println("Selda");
        // bir  detayi olmadigi icin sonsuz kez selda yazar!







    }

