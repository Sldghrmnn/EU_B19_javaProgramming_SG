package day26_StringClass01;

public class C07_Initials {
    public static void main(String[] args) {
        String str = "Selda Gehrmann";
        //A.B.

        char c1= str.charAt(0);
        char ch2 = str.charAt(str.indexOf(" ") + 1);


//2. yol;)
        String substring = str.substring(str.indexOf(" ") + 1);
        System.out.println("substring = " + substring);
        char ch3 = substring.charAt(0);


        System.out.println("(c1+\".\"+ch2+\".\") = " + (c1 + "." + ch2 + "."));


        System.out.println("(c1+\".\"+ch3+\".\") = " + (c1 + "." + ch3 + "."));
    }
}
