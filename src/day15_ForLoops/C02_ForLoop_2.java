package day15_ForLoops;

public class C02_ForLoop_2 {
    public static void main(String[] args) {
       // dongu sayisi i ile gosterilir ve dongu esnasinda kullanilabilir...

       for (int i = 0 ; i <= 3 ; i++){
           System.out.println("i = " + i);
       }
        System.out.println("----------------------------------");
       //donguyu istedigimiz noktadan baslatabiliriz
        // 10 ila 20 arasindaki sayilari yazdirin(dahil)

        for (int i = 10; i <= 20; i++){
            System.out.println("i = " + i);
        }
        // donguyu istedigimiz oranda arttirabiliriz
        // 0 ila 10 arasindaki cift sayilari yazdiralim.
        for (int i = 0 ; i <=10; i+=2){
            System.out.println("i = " + i);
        }
        System.out.println("-----------------------------------------");
       // dongulerde,index degeri degistirilmezse, sonsuz donguye girilir.
        // i'yi degeri bady icinde de degistirilebilir.
        int i;
        for (i = 0; i <= 10; i += 2){
            System.out.println("i = " + i);

        }
        System.out.println("for sonrasi");
        System.out.println("i = " + i);


    }
}
