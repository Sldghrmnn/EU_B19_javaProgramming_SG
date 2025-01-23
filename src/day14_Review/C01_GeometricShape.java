package day14_Review;

public class C01_GeometricShape {
    public static void main(String[] args) {
   // verilen kenar sayisindan seklin hangi geometrik sekil oldugunu tespit eden
   // bir program yazin
   // 3-6 arasi kenar sayisi kabul edilir

   int kenarSayisi = 4;
                                            // String sekil =" ";
  /*
   if (kenarSayisi==3){
       System.out.println("bu bir ucgendir");
   }else if (kenarSayisi==4){
       System.out.println("bu bir dortgendir");
   }else if (kenarSayisi==5){
       System.out.println("bu bir besgendir");
   }else if (kenarSayisi==6){
       System.out.println("bu bir altigendir");
   }else{
       System.out.println("belirlenmemis sekil");
   }
   // usteki sekilde de yapilabilir ama alttaki ornekleme daha rahat
  */
        String sekil =" ";

        if (kenarSayisi==3){
            sekil="b ucgendir";
        }else if (kenarSayisi==4){
            sekil =" dortgendir";
        }else if (kenarSayisi==5){
            sekil =" besgendir";
        }else if (kenarSayisi==6){
           sekil ="altigendir";
        }else{
            sekil ="belirlenmemis sekil";
        }
        if (kenarSayisi>=3 && kenarSayisi<=6){
            System.out.println("bu bir " +sekil+" dir.");
        }

    }
}
