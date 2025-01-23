package day14_Review;

public class c05_IfExample2 {
    public static void main(String[] args) {
  // elimizde belirli sayida 5 kg luk ve 1 kg luk paketler var
  // musterinin talep ettigi kilo sayisinda paketi verip,vermeyecegimizi
  // kontrol eden bir program yazin

          int beslikPaketSayisi =6;
          int birlikPaketSayisi =2;
          int talep =28;
          boolean karsilanabilirMi= false;

        if (talep > 0) {
            if(beslikPaketSayisi*5>=talep){
                if (beslikPaketSayisi>=talep%5){
                    karsilanabilirMi = true;
                }
            }else if (birlikPaketSayisi>=talep - beslikPaketSayisi *5){
                karsilanabilirMi = true;
            }

            if(karsilanabilirMi){
                System.out.println(talep + " kilo talebiniz depomuzda muvcut");
            }else {
                System.out.println(talep + " kilo talebiniz depolarimizda mevcut degildir.");
            }


        }else{
            System.out.println("Talebiniz anlasilamamistir.");
        }


    }

}

/*
int beslikPaketSayisi = 4;
int birlikPaketSayisi = 5;
int talep= 23;

int beslikKilo = beslikPaketSayisi * 5;
int birlikKilo = birlikPaketSayisi * 1;
int toplamKilo = beslikKilo +birlikKilo;




//4 tane 5 lik 20 kilo
  //3 tane birlik  3 kilo

if (talep<= toplamKilo )
 */