package day08_Assignment_Relational_Logical_Operators;

public class C11_LogicalExlusiveOR {
    public static void main(String[] args) {

     // cok kullanilmayan ama bilmekte zarar yok !...
       // gelen sonuclarin birbirinden farki varsa ve biz bunlarin ayni olmasini istemiyorsak
       // yani 2 islemde true yada false ise biz artik bunda devam etmek istemezsek!kod kesilsin istiyorsak
        //o zaman bu isareti temsil eden taramayi kullanabiliriz. cunku biz birbiriyle ayni olmayan dogrulamayi
        //kullanmak istedigimizde lazim olur!!!


        System.out.println(true ^ true );  // false
        System.out.println(true ^ false );  // true
        System.out.println(false ^ true );  // true
        System.out.println(false ^ false );  // false



        int sayi1= 20;
        int sayi2= 22;

        System.out.println("sayi1^sayi2) =" + (sayi1 ^ sayi2));  // 2
                                                                // arasindaki farki verir












    }
}
