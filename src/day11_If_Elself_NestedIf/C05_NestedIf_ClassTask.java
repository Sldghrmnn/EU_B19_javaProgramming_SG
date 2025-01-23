package day11_If_Elself_NestedIf;

import java.util.Scanner;

public class C05_NestedIf_ClassTask {
    public static void main(String[] args) {


// Bir havuz girişte kullanıcıya 18 yaşında olup olmadığını sorun
// 18 yaşın altında ise giremezsiniz şeklinde ikaz verip
// 18 ve üzerinde ise yanında bayan olup olmadığını sorun
// bayan yok ise giremesin
//bayan var ise yüzme bilip bilmediğiniz sorun
//yüzme bilmiyor ise yine giriş yapamasın


        Scanner scanner=new Scanner(System.in);
        System.out.println("Yaşınızı giriniz : ");
        int age=scanner.nextInt();

        if (age>=18){

            System.out.println("Yanınızda bayan var mı? Evet / Hayır");
            String cevap = scanner.next();
            if (cevap.equalsIgnoreCase("evet")){
                System.out.println("Yüzme biliyor musunuz? Evet / Hayır");
                String cevap2=scanner.next();

                if (cevap2.equalsIgnoreCase("evet")){
                    System.out.println("Havuzumuza hoş geldiniz");
                }else{
                    System.out.println("Yüzme bilmeyenler havuza girmez");
                }

            }else {
                System.out.println("Yanınızda bayan yok giremezsiniz");
            }


        }else {
            System.out.println("giremezsiniz");
        }








    }
}




































