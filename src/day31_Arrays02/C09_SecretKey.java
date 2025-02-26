package day31_Arrays02;

public class C09_SecretKey {
    public static void main(String[] args) {
        findSecret("Bazen", "kederler", "sessiz", "degisiklik", "yapmk","kismetsizliginde", "ıslanmak", "istemezsler");

    }

    public static void findSecret(String... str){
        String result ="";
        for (int i = 0; i < str.length; i++) {
            result += str[i].charAt(i);
        }
        System.out.println("Sampiyon  " + result);
    }

}
// Verilen String dizesi icerisinde gizlenmis kelimeyi bulunuz.
// Her bir kelimenin bulundugu index nosuna gore
// kelimede index e karsilik gelen karakteri alip birlestirmek suretiyle

//"Bazen", "kederler", "sessiz", "degisiklik", "yapmk","kismetsizliginde", "ıslanmak", "istemezsler";