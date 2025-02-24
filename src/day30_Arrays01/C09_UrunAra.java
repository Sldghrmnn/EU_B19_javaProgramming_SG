package day30_Arrays01;

import java.util.Scanner;

public class C09_UrunAra {
    public static void main(String[] args) {
    // Dongu kullanarak, kullanicidan urunleri almak kaydiyla bir urun listesi olusturunuz

        String [] urunler ={"Elma","Armut","Muz","Karpuz","Seftali"};

        System.out.println("Lutfen bir urun giriniz ");
        Scanner sc = new  Scanner(System.in);
        String arananUrun = sc.nextLine();

        boolean flag =false;

        for (int i = 0; i < urunler.length; i++) {
            if (urunler[i].equalsIgnoreCase(arananUrun)){
              flag=true;
              break;
            }
        }

        if (flag){
            System.out.println("Aranana urun listede mevcuttur");
        }else{
            System.out.println("Aranan urun listede yoktur");
        }
    }
}
