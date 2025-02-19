package day27_StringClass02;

public class C10_KarakterSayisi {
    public static void main(String[] args) {

        System.out.println(karakterSay("AnkaranarRa", 'R'));
        System.out.println(karakterSay2("Ankara", 'a'));
        System.out.println(karakterSay3("ARRRRnkara", "r"));

    }


    public static int karakterSay(String str,char ch){
       int sayac =0;
       String x=""+ch;

        for (int i = 0; i < str.length(); i++) {
           if (str.substring(i,i+1).equalsIgnoreCase(x)){
               sayac++;
           }
        }
        return sayac;
    }

    //2.yol
    public static int karakterSay2(String str,char ch){
        int sayac=0;
        for (int i = 0; i < str.length(); i++) {
          if (str.charAt(i)==ch){
              sayac++;
          }
        }
        return sayac;
    }

    //3.yol
    public static int karakterSay3(String str,String ch){

        str=str.toLowerCase();
        ch= ch.toLowerCase();

        int ilkUzunluk=str.length();
        int sonUzunluk=str.replace(ch,"").length();

        return ilkUzunluk-sonUzunluk;
    }
}
// kullanicidan bir kelime ve bir karakter alin
//ve bu kelimenin istenen karakterin kac adet oldugunu
// donduren methodu yaziniz.(buyuk kucuk harfi goz ardi edilecek)
//Ankara ,a 3  Edirne,e 2