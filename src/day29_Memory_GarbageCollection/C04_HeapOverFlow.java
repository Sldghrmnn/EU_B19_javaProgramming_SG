package day29_Memory_GarbageCollection;

public class C04_HeapOverFlow {
    public static void main(String[] args) {
        // STACK       HEAP
        String str1 = "Merhaba";  // Immutable--degistirilemez-silinemez
        System.out.println("str1 = " + str1);
        System.out.println("System.identityHashCode(str1) = " + System.identityHashCode(str1));


        str1 = "Merhaba Java";
        System.out.println("str1 = " + str1);
        System.out.println("System.identityHashCode(str1) = " + System.identityHashCode(str1));


        int counter = 0;

        // OutOfMemoryError (heap space) hatasi olusur.str1 degiskeni oyle bir degere temasina gelir ki
        //nesnenin buyuklugu heap'e sigmaz ve hata verir

        while (true){
            System.out.println(counter++);
            str1 += str1;     // her seferinde yeni bir nesne olusturup
            // karakter sayisini iki katina cikar
            //garbage collection calismasina ragmen bir zaman sonra
            // yeni olusacak nesne heap'e sigmaz ve hata verir
            System.out.println("System.identityHashCode(str1) = " + System.identityHashCode(str1));
        }


    }
}
