package day28_StringReview;

import java.util.Random;

public class C02_RandomPassword {
    public static void main(String[] args) {
        System.out.println("generatePassword(12) = " + generatePassword(12));
        System.out.println("generatePassword(16) = " + generatePassword(16));

    }
    // 12 karaktereli bir rastgele sifre olusturan methodu yaziniz...

    public static String generatePassword(int passwordLength){
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()";
        String password = "";

        Random random = new Random();

        for (int i = 0; i < passwordLength; i++) {
            int index= random.nextInt(characters.length()); //5
            password += characters.charAt(index);

        }
        return password;
    }
}
