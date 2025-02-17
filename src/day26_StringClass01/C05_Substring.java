package day26_StringClass01;

public class C05_Substring {
    public static void main(String[] args) {

        String str = "Merhaba Dunya Hava Cok Guzel";
        //            0123456789012345678901234567

        System.out.println("str.length() = " + str.length());

        System.out.println("str.substring(12) = " + str.substring(12)); //12.index dahil
        System.out.println("str.substring(12,25) = " + str.substring(12, 25)); //12.index dahil ama 25.index daahil degil

        System.out.println("str.substring(23) = " + str.substring(23));
        System.out.println("str.substring(str.length()-5) = " + str.substring(str.length() - 5));
        System.out.println("str.substring(str.length()-3) = " + str.substring(str.length() - 3));


        System.out.println("str.substring(27) = " + str.substring(27,28));

        System.out.println("str.substring(str.length()-1) = " + str.substring(str.length() - 1));//son harfi almak icin
        System.out.println("str.substring(str.length()-1,str.length()) = " + str.substring(str.length() - 1, str.length()));

       // System.out.println("str.substring(5,3) = " + str.substring(5, 3)); kodumuz calisir uyari vermez ancak
        // StringIndexOutOfBoundsException--ust sira hata verir---runtime Time
        // ancak calistirdigimizda hata oldugunu gosterir.




        // İphone 14 ProMax 32GB, hsgfhdfgdfjhagdjkka, 1200 USD;
        // İphone 14 ProMax 32GB, hsgjhagdjkka, 1220 USD;
        // İphone 14 ProMax 32GB, hsgjdfgsdhagdjkka, 1210 USD;
        // İphone 14 ProMax 32GB, hsgjhsdgsgsdgsdgsdgsdagdjkka, 1205 USD;
    }
}
