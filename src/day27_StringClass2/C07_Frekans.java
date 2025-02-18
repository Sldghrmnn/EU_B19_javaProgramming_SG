package day27_StringClass2;

import java.util.Scanner;

public class C07_Frekans {
    public static void main(String[] args) {

        // frekans=count=sayac


        // String str="AABACCCDC";
        // char ch='C';
        // 4


        Scanner input=new Scanner(System.in);
        System.out.println("String");
        String str=input.nextLine();
        System.out.println("Char");
        char ch=input.nextLine().charAt(0);

        int sayac =0;

        for (int i = 0; i < str.length() ; i++) {
            if (str.charAt(i)==ch){
                sayac++;
            }
        }
        System.out.println(sayac);
        System.out.println("karakter '"+ch+"' toplam "+sayac+" tane var...");
    }
}
