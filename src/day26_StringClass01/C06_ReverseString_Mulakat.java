package day26_StringClass01;

public class C06_ReverseString_Mulakat {
    public static void main(String[] args) {

        //  herhangi bir metni tersten yazdirmak icin!!!mulakat sorusu ;)

        String str = "EY EDIP ADANADA PIDE YE";
         //           01234567890123456789012

        String reverse="";

        for (int i = str.length()-1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        System.out.println("str = " + str);
        System.out.println("reverse = " + reverse);
    }
}
