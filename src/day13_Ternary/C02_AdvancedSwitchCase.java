package day13_Ternary;

public class C02_AdvancedSwitchCase {
    public static void main(String[] args) {
       int level =1;
       String levelStr;

      switch (level){
           case 1 ->  levelStr= "A";
           case 2 ->  levelStr= "B";
           case 3 ->  levelStr= "C";
           default -> levelStr= "E";
       };


        System.out.println("levelStr = " + levelStr);
         //switch islemi sonucunda olusan deger bir variable atanmak isteniyorsa,
        // butun case'lerin sonucunda olusan deger ile atanacak variable data tipi ayni olmali!

        switch (level){
            case 1 -> levelStr = "A";
            case 2 -> System.out.println("B");
            case 3-> System.out.println(22);
            default -> System.out.println("Hatali giris");
        }

    }
}
