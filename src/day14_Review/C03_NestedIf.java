package day14_Review;

public class C03_NestedIf {
    public static void main(String[] args) {
   // bir sayi al ve bu sayinin 2-3-6 ya bolunup bolunmedigini kontrol et!

   int sayi = 60;

   if (sayi%2 == 0){
       System.out.println(sayi+" 2 ye bolunebilir.");
       if (sayi%3 ==0){
           System.out.println(sayi+" 3 ye bolunebilir.");
           System.out.println(sayi+" 6 ye bolunebilir.");
       }else {
           System.out.println(sayi+" 3 ye bolunemez .");
           System.out.println(sayi+" 6 ye bolunemez .");
       }
   }else {
       System.out.println(sayi+" 2 ye bolunemez .");
   }




    }
}
