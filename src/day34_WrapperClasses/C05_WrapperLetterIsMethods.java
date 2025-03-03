package day34_WrapperClasses;

public class C05_WrapperLetterIsMethods {
    public static void main(String[] args) {

        String str =  "Abc6846294**89812)7&5+89123ABc&4Ankara646-9813asa7";

        parseString(str);
    }

    public static void parseString(String str){
        String letter = "";
        String numbers= "";
        String specialChars= "";

        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))){
               letter += str.charAt(i);
            } else if (Character.isDigit(str.charAt(i))) {
                numbers += str.charAt(i);
            }else{
                specialChars += str.charAt(i);
            }
        }
        System.out.println(letter);
        System.out.println(numbers);
        System.out.println(specialChars);

    }
}
