package day26_StringClass01;

public class C02_StringMethods {
    public static void main(String[] args) {

        String programlamaDili = "Java"; //Heap -- String Pool icerisinde bir obje olustu
        System.out.println("programlamaDili.length() = " + programlamaDili.length());

        programlamaDili ="Phyton";
        System.out.println("programlamaDili.length() = " + programlamaDili.length());

        System.out.println("--------------------------------------");

        //toLowerCase() and toUpperCase() kucuk harf ve buyuk harf

        System.out.println("programlamaDili.toLowerCase() = " + programlamaDili.toLowerCase());
        System.out.println("programlamaDili.toUpperCase() = " + programlamaDili.toUpperCase());
        System.out.println("programlamaDili = " + programlamaDili);

        programlamaDili = programlamaDili.toUpperCase(); //PHYTON
        System.out.println("programlamaDili = " + programlamaDili);

        System.out.println("-------------------------------------------");

        //charAt()  //P H Y T O N
        //            0 1 2 3 4 5

        System.out.println("programlamaDili.charAt(1) = " + programlamaDili.charAt(1));
        System.out.println("programlamaDili.charAt(1) = " + programlamaDili.charAt(5));


        System.out.println("programlamaDili.charAt(programlamaDili.length()-1) = " + programlamaDili.charAt(programlamaDili.length() - 1));

        programlamaDili = "Phyton Programming";
        System.out.println("programlamaDili.length() = " + programlamaDili.length());
        System.out.println("programlamaDili.charAt(6) = " + programlamaDili.charAt(6));

        programlamaDili = "PHYTON";
       // System.out.println("programlamaDili.charAt(-1) = " + programlamaDili.charAt(-1));//StringIndexOutOfBoundsException

        System.out.println("-----------------------------------------");

        //concat()
        System.out.println("programlamaDili = " + programlamaDili);
        System.out.println(programlamaDili+" Programlama Dili " );
        System.out.println("programlamaDili.concat(\"Programlama Dili\") = " + programlamaDili.concat("Programlama Dili"));
        String dil = "Programlama Dili";
        System.out.println("programlamaDili.concat(dil) = " + programlamaDili.concat(" ".concat(dil)));

        System.out.println("-----------------------------------------------");

        //PHYTON
        //contains()---boolean deger dondurur

        System.out.println("programlamaDili = " + programlamaDili);
        System.out.println("programlamaDili.contains(\"HY\") = " + programlamaDili.contains("HY"));
        System.out.println("programlamaDili.contains(\"YH\") = " + programlamaDili.contains("YH"));
        System.out.println("programlamaDili.contains(\"hy\") = " + programlamaDili.contains("hy"));

        programlamaDili = "   Phyton Programlama Dili   ";
        System.out.println("programlamaDili.contains(\"phyton\") = " + programlamaDili.contains("phyton"));
        System.out.println("programlamaDili.contains(\"n Prog\") = " + programlamaDili.contains("n Prog"));

        System.out.println("----------------------------------------------------");

        // trim()-- bastaki ve sondaki bosluklari atar

        System.out.println("programlamaDili = " + programlamaDili);
        System.out.println("programlamaDili.trim() = " + programlamaDili.trim());
        System.out.println("programlamaDili = " + programlamaDili);
        System.out.println("programlamaDili.charAt(programlamaDili.length()-1) = " + programlamaDili.charAt(programlamaDili.length() - 1));

        System.out.println("---------------------------------------------------");

        //replace() --------"   Phyton Programlama Dili   "
        System.out.println("programlamaDili = " + programlamaDili);
        System.out.println("programlamaDili.replace(\" \",\" \") = " + programlamaDili.replace(" ", " "));
        System.out.println("programlamaDili.replace(\"P\",\"a\") = " + programlamaDili.replace("P", "a"));

        programlamaDili=programlamaDili.replace(" ","");
        System.out.println("programlamaDili = " + programlamaDili);
        System.out.println("programlamaDili.replace(\"Phyton\",\"Java\") = " + programlamaDili.replace("Phyton", "Java"));

        System.out.println("--------------------------------------------------------");

        //indexOf(),lastIndexOf()

        System.out.println("programlamaDili = " + programlamaDili);

        System.out.println("programlamaDili.indexOf('a') = " + programlamaDili.indexOf('a'));
        System.out.println("programlamaDili.indexOf(\"Programlama\") = " + programlamaDili.indexOf("Programlama"));
        System.out.println("programlamaDili.lastIndexOf('a') = " + programlamaDili.lastIndexOf('a'));

        System.out.println("------------------------------------------------------------");

        //
        System.out.println("programlamaDili = " + programlamaDili);
        System.out.println(programlamaDili.length());
        System.out.println(programlamaDili.indexOf(programlamaDili.charAt(programlamaDili.length() / 2)));

        //equals()
        String str1 ="hello";
        String str2 ="hello";
        String str3 = new String("Hello");
        String str4 = new String("Hello");

        System.out.println(str1 == str2);

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1.equals(str4));

        System.out.println("--------------------------------------------------------");

        //equalsIgnoreCase()
        System.out.println(str1.equalsIgnoreCase(str4));

        System.out.println(str1.toLowerCase().equals(str4.toLowerCase()));

    }

}
