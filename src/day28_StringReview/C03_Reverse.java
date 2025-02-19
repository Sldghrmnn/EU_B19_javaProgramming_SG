package day28_StringReview;

public class C03_Reverse {
    public static void main(String[] args) {
        System.out.println("reverse(\" katakulli\") = "+reverse("katakulli"));
        System.out.println("reverse1(\"katakulli\") = " + reverse1("katakulli"));
        System.out.println("reverse2(\"katakulli\") = " + reverse2("katakulli"));

        String s = "Ahmet"; // length = 5 ama index 4'de bitiyor
        System.out.println("s.substring(s.length()) = " + s.substring(s.length()-1)); //t
        System.out.println("s.substring(s.length()) = " + s.substring(s.length()-2)); //et
        System.out.println("s.substring(0,s.length()-1) = " + s.substring(0, s.length()-1));

    }
    //verilen String'i terse ceviren methodu yaziniz.

    public static String reverse(String str){
        String reversed = "";
        for (int i = str.length(); i >= 0 ; i--) {
          reversed += str.charAt(i);
        }
        return reversed;
    }

    public static String reverse1(String str){
        String reversed = "";
        for (int i = str.length()-1; i >=0 ; i--) {
          reversed = reversed.concat(str.substring(i,i+1));
        }
        return reversed;
    }

    public static String reverse2(String str){
        String reversed = "";
        while (!str.isEmpty()){
            String lastLetter = str.substring(str.length()-1);
            reversed += lastLetter;
            str = str.substring(0,str.length()-1);
        }
        return reversed;
    }
}
