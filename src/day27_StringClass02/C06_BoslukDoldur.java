package day27_StringClass02;

public class C06_BoslukDoldur {
    public static void main(String[] args) {

        System.out.println(boslukDoldur("  Merhaba Dünya  "));
    }

    public static String boslukDoldur(String str){

        return str.replace(" ","%");
    }
}

//Kullanıcıdan bir dize sözcük alın ve her
// boşluğa % ibaresi ekleyin. Merhaba dünya Merhaba%dünya
// " merhaba dünya " %%%merhaba%dünya%%