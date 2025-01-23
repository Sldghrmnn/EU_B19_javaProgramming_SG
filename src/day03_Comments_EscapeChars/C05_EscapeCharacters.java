package day03_Comments_EscapeChars;

public class C05_EscapeCharacters {
    public static void main(String[] args) {

        System.out.println("Merhaba Dünya");

        /*
             \n  = yeni satir -new line
             \t  = bir tab bosluk birakir
             \b  = Backspace son harf yada rakami siler konola yazarken
             \"  =  "      double quote
             \r  = satir basi
             \\  = \
         */
        System.out.println("-----------------------");
        System.out.println("One\tTwo\tThree");
        System.out.println("One\bTwo\bThree");
        System.out.println("One\nTwo\nThree");
        System.out.println("-----------------------");
        System.out.println("One Two\rThree");

        System.out.println("\"One\" \"Two\" \"Three\"");

        System.out.println("------------------------------");


        System.out.println("\" Merhaba Dunya \"");




    }

}
//Metin "Merhaba Dünya"    "One" "Two" "Three"