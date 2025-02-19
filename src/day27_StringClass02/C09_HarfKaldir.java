package day27_StringClass02;

public class C09_HarfKaldir {
    public static void main(String[] args) {

        System.out.println(harfKaldir("Merhaba", 'a'));


    }

    public static String harfKaldir(String str,char ch){
        String result ="";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)!= ch){
                result +=str.charAt(i);
            }
        }
        return result;
    }
}
// kullanicidan bir kelime ve bir harf alin
// kelimenizin icinde bu harfin hepsi kaldirilmis sekilde String donduren programi yaziniz
//(Merhaba, a)Merhb
// bir String ve bir Char al