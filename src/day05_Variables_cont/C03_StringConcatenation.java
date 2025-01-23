package day05_Variables_cont;

public class C03_StringConcatenation {
    public static void main(String[] args) {
/**
 *  1. oncelik () parantez ici
 *  2. oncelik carpma/bolme
 *  3. öncelik toplama /cikarma
 *  Stringe donustumu artik toplama olmaz.

 */

        String name ="Asli";

        String surname="Yilmaz";
        System.out.println(name + surname);   // Asli Yilmaz

        System.out.println(name + 3);                   // Asli3

        System.out.println(3 + name);                  // 3Asli

        System.out.println(3 + name +3);              // 3Asli3

        System.out.println(3 +3 + name);              // 6Asli

        System.out.println(3 +3 + name +3 +3);        //6Asli33

        System.out.println(3 +3 + name + 3*3);        //6Asli9

        //Sysem.out.prinln( 3 * name - 6 ); bu sekilde kullanilmaz.

        System.out.println(3*3 + name + (3-1) *5);    //9Asli10

        // Asli Yilmaz

        System.out.println(name +" " + surname);

        String s = "";
        int i = 3;

        String s1 = i + s;
        System.out.println("s1 = " + s1 +5);   //35


        String str = "2528";     // bu artik bir rakam degil nesnedir.


    }
}
