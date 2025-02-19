package day28_StringReview;

public class C06_HomeWorks {
    public static void main(String[] args) {
        System.out.println("secondHalf(\"Sanayagı\") = " + secondHalf("Sanayagı"));
        System.out.println("secondHalf(\"Mutluluk\") = " + secondHalf("Mutluluk"));
        System.out.println("secondHalf(\"kalay\") = " + secondHalf("kalay"));
        System.out.println("-----------------------");
        System.out.println("replaceChar(\"Merhaba\",\"a\",\"e\") = " + replaceChar("Merhaba", "a", "e"));
        System.out.println("replaceChar(\"Kasaba\",\"a\",\"i\") = " + replaceChar("Kasaba", "a", "i"));
        System.out.println("replaceChar(\"Kasaba\",'a','i') = " + replaceChar("Kasaba", 'a', 'i'));

        System.out.println("replaceChar_1(\"kale\",'l','z') = " + replaceChar_1("kalellllli", 'l', 'z'));
        System.out.println("--------------------");
        System.out.println("tripleWord(\"Ali\") = " + tripleWord("Ali"));

        String str = "Ahmet";
        System.out.println("str.repeat(3) = " + str.repeat(3));
        System.out.println("str = " + str);
        str = str.repeat(3);
        System.out.println("str = " + str);

        System.out.println("--------------------");
        System.out.println("tripleWord(\"Ali\") = " + tripleWord_1("Ali"));

        System.out.println("--------------------");
        System.out.println("substring(\"Merhaba\",3) = " + substring("Merhaba", 3));

        System.out.println("--------------------");
        String s = "  harun merhaba nasılsın   ";
        System.out.println(s);
        System.out.println(trim("  harun merhaba nasılsın   "));


    }
//Kullanıcın girdiği bir kelimenin 2. yarısını
// döndüren bir program yazdırın.
//Sanayagı yagı Mutluluk uluk
// kalay lay

   public static String secondHalf(String word){
       return word.substring(word.length()/2);
   }

//Kullanıcıdan bir kelime , değiştirmek istediği harfi/harfleri ve
// yeni harfi/harfleri alan ve buna göre kelimede/dizede sadece
// ilk bulduğu yeri değiştiren metodu yazınız.
//(Merhaba ,a, e) Merheba (Kasaba , a, i) Kisaba

    public static String replaceChar(String str,String oldChar,String newChar){
        return str.replaceFirst(oldChar,newChar);
    }

    public static String replaceChar(String str,char oldChar,char newChar){
        return str.replaceFirst(oldChar+"",newChar+"");
    }

    public static String replaceChar_1(String str,char oldChar,char newChar){
        String result = "";
        boolean flag = true;
        for (int i = 0; i < str.length(); i++) { //kaleli
            if (str.charAt(i) == oldChar && flag){
                result += newChar;
                flag = false;
                continue;
            }
            result += str.charAt(i);
        }
        return result;
    }

//Kullanıcıdan bir kelime alın ve her harfini 3 defa yazdırın.
//Merhaba MMMeeerrrhhhaaabbbaaa Ali AAAllliii

    public static String tripleWord(String str){
        String result = "";
        for (int i = 0; i < str.length(); i++) {
             result += ""+ str.charAt(i) + str.charAt(i)  + str.charAt(i);
        }
        return result;
    }

    public static String tripleWord_1(String str){
        String result = "";
        for (int i = 0; i < str.length(); i++) {
          String temp = str.substring(i, i+1);
          result = result.concat(temp.repeat(3));
        }
        return result;
    }

// Bir String ve bir index numarası alan substring metodunu yazınız
// "Merhaba" substring(str, 3)=haba
// subString(String str,int index)

    public static String substring(String str,int index){
        String result = "";
        for (int i = index; i < str.length(); i++) {
           result += str.charAt(i);
        }
        return result;
    }
//trim(String str) şeklinde bir metot yazın trim gibi çalışsın
// ve string döndürsün. İçerisinde string in hazır metodu
// olan trim metodunu kullanmayın.
// " harun merhaba nasılsın "

    public static String trim(String sentence){
        int startIndex = 0;
        int endIndex = 0;

        for (int i = 0; i < sentence.length(); i++) {
           if (sentence.charAt(i) != ' '){
               startIndex = i;
               break;
           }
        }
        for (int i = sentence.length()-1; i >= 0 ; i--) {
            if (sentence.charAt(i) != ' '){
                endIndex = i;
                break;
            }
        }
        return sentence.substring(startIndex,endIndex+1);
    }


}

