package day37_Constructor_PassingObjects01;

import java.util.ArrayList;

public class Banka {

    String name;
    String adress;
    int hesapNo;

    ArrayList<Musteri> musteriler;

    public Banka(){
        name = "Isimsiz Banka";
        adress = "Adres bilgisi yok";
        hesapNo = 1000;
        musteriler = new ArrayList<>();
    }

    public Banka(String name,String adress,int hesapNo){
     this.name = name;
     this.adress = adress;
     this.hesapNo = hesapNo;
     musteriler = new ArrayList<>();
    }

     public void musteriEkle(Musteri musteri){
        hesapNo++;
        musteri.hesapNo = hesapNo;
        musteriler.add(musteri);
        System.out.println(musteri.name +" isimli musteri icin "+musteri.hesapNo+" hesap no ile hesap acilmistir");
     }


     public void paraYatir(Musteri musteri,double miktar){
        if (miktar > 0){
            musteri.bakiye += miktar;
        }
     }

     public void paraCek(Musteri musteri,double miktar){
        if (miktar > 0 && musteri.bakiye >= miktar){
            musteri.bakiye -= miktar;
        }else {
            System.out.println("Hesabinizda yeterli bakiye yok");
            System.out.println("En fazla "+musteri.bakiye+" TL miktarinda para cekebilirsiniz");
        }
     }




     public void findByHesapNo(int hesapNo) {
         System.out.println("Heaap Numarasi ile Müsteri bulma");
         System.out.println("--------------------------------");

         boolean isFond = true;

         for (Musteri musteri : musteriler) {
             if (musteri.hesapNo == hesapNo) {
                 isFond = false;
                 musteri.showInfo();
                 break;
             }
         }
         if (isFond) {
             System.out.println(hesapNo + " hesap numarali müsteri yotur");
         }

     }

     public void findByName(String name){
         System.out.println("Isimden müsteri bulma");
         System.out.println("---------------------");

         int count = 0;
         for (Musteri musteri :musteriler ) {
         	if (musteri.name.startsWith(name)){
                 count++;
                 musteri.showInfo();
                System.out.println("-----------------");
            }
         }
         if (count==0){
             System.out.println(name+" isminde bir müsteri yoktur");
         }else {
             System.out.println(name+" isminde "+count+" adet müstri vardir");
         }



     }





     public void musteriListe(){
        for (Musteri musteri :musteriler ) {
        	musteri.showInfo();
            System.out.println("--------------------------");
        }
     }





}
