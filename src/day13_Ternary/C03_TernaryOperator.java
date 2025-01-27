package day13_Ternary;

public class C03_TernaryOperator {
    public static void main(String[] args) {

        // if'in basit hali
        // (condotion) ? code (true) : code (false)
        //  condotion veriliyorsa  sart kosmak isteniyordur..bu boolean dir true /false de islem yapilcak

        //sayinin cift mi ,tek mi oldugunu yazdiran kod nedir ?
        int number = 15;

        // if-else

        if (number % 2 ==0){
            System.out.println(number+" sayisi cifttir.");
        }else {
            System.out.println(number+" sayisi tektir.");
        }


      //ternary
        System.out.println(number % 2 == 0 ?number+"sayisi cifttir." : number+ "sayisi tektir.");

       String mesaj = number % 2 == 0 ? "sayisi cifttir." : "sayisi tektir.";
        // cunku bunun degeri bir String dir...

        System.out.println("mesaj = " + mesaj);

        //  eger ternary sonucunda olusan deger bir degiskene atanmayacaksa ,
        //  ? ve : sonraki degerlerin data tipi farkli olabilir.

        System.out.println(number % 2 == 0 ? "sayisi cifttir." : number * 2);

       // int s =number % 2 == 0 ? "sayisi cifttir." : number * 2;hata verir..
        // cunku bu sekilde yazamayiz 2 farkli data tipi var string ve int var!



        // bir sartin gerceklesmesi durumunda birden fazla kod satiri calisicaksa mutlaka if-else
        // tek bir sart varsa ternary de calistirabilirsiniz
    }
}
