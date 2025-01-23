package day11_If_Elself_NestedIf;

import java.util.Scanner;

public class C06_odev_denemesi {
    public static void main(String[] args) {

// Bir havuz girişte kullanıcıya 18 yaşında olup olmadığını sorun
// 18 yaşın altında ise giremezsiniz şeklinde ikaz verip
// 18 ve üzerinde ise yanında bayan olup olmadığını sorun
// bayan yok ise giremesin
//bayan var ise yüzme bilip bilmediğiniz sorun
//yüzme bilmiyor ise yine giriş yapamasın

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz : ");
        int yas= scanner.nextInt();

        if (yas>=18){
            System.out.println("Yaninizda bayan var mi?   Evet / Hayir");
            String cevap=scanner.next();
            if (cevap.equalsIgnoreCase("evet")){
                System.out.println("Yuzme biliyor musunuz ? Evet /Hayir");
                String cevap1=scanner.next();
                if (cevap1.equalsIgnoreCase("evet")){
                    System.out.println("Havuzumuza hos geldiniz");
                }else{
                    System.out.println("Yuzme bilmeyenler giremez");
                }
            }else{
                System.out.println("Bayan olmadan giremezsiniz");
            }



        }else{
            System.out.println("Giremezsiniz");
        }




































    }
}
