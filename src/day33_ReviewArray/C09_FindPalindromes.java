package day33_ReviewArray;

public class C09_FindPalindromes {
    public static void main(String[] args) {

        String[] words = {"kayak", "ata", "ali", "ama", "kek", "adam", "madam"};
        System.out.println("findPalindromes(words) = " + findPalindromes(words));

    }
    //verilen bir arraydeki palindrom kelimeleri bir stringe depolayan methodu yaziniz.
    //kelimeler arasinda  - konulmalidir....

    public static String findPalindromes(String[] kelimeler) {
        String result = "";

        for (String kelime : kelimeler) {
            if (isPalindrome(kelime)) {
                result += kelime + "-";
            }
        }
        return result.substring(0, result.length() - 1);
    }


    private static boolean isPalindrome(String kelime) {
        String kelimeninTersi = "";
        for (int i = kelime.length() - 1; i >= 0; i--) {
            kelimeninTersi += kelime.charAt(i);
        }
        return kelime.equals(kelimeninTersi);
    }
}