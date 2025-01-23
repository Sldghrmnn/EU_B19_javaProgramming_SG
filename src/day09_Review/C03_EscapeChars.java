package day09_Review;

public class C03_EscapeChars {
    public static void main(String[] args) {

 /*
escape chars
\b backspace     geri tusu son bir hrf yada rakami siliyor ---
\n new line      yeni satir
\t tab           sekme
\r               satır başı
\"
\\
*/
        String name= "Yusuf";
        int birthDay= 30;
        String monthOfBirth="August";
        int birthYear= 1985;

        // Emre was born on "June \5\1992"

       System.out.println(name+" was born on \""+monthOfBirth+"\\"+ birthDay+"\\"+birthYear+"\"" );

       // System.out.println(name+" was born on "+monthOfBirth+"\\"+birthDay+"\\"+birthYear);

    }
}
