package day11_If_Elself_NestedIf;

public class C03_ElseIf_Examples {
    public static void main(String[] args) {
     /*
     aysenin harcligi 5 liradan az ise ,babasi 10 tl versin.
     50 liradan fazla ise, babasi 20 tl alsin.
     aksi durumda babasi para vermesin ve almasin
      */

       int aysePara=68;
       if (aysePara<5){
           aysePara+=10;
       }else if (aysePara>50){
           aysePara-=20;
       }else{
       }
        System.out.println("aysePara = " + aysePara);

        System.out.println("------------------------------------------");

        /*
        3 adet ic aci olsun ve bunun
        ucgen olup olmadigini kontrol edelim
         */

        int x,y,z;
        x=70;
        y=60;
        z=50;
        int toplam=x+y+z;

        boolean durum=toplam==180;

        if (durum){
            System.out.println("Bu bir ucgendir");
        }else {
            System.out.println("Bu bir ucgen degildir");
        }







    }
}
