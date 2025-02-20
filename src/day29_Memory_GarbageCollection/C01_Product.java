package day29_Memory_GarbageCollection;

public class C01_Product {
    //Properties states,fields
    //Refarans degiskenler

    String name; //------> Heap
    double unitPrice; //---> Heap

    // Behavior, function, method of object ---> STACK
     public double fiyatHesapla(int miktar){
        double fiyat = unitPrice*miktar;
        return fiyat;
     }


    public static void main(String[] args) {

        //           STACK         Heap
        C01_Product product = new C01_Product();

        System.out.println("product = " + product);

        product.name = "Elma"; //HEAP memory olusur
        product.unitPrice = 15; //HEAP memory olusur

        int miktar = 3; // Locak degiskenler STACK'de olusur

        double fiyat = product.fiyatHesapla(miktar); // Locak degisken STACK

        System.out.println("product.name = " + product.name);
        System.out.println("product.unitPrice = " + product.unitPrice);
        System.out.println("miktar = " + miktar);
        System.out.println("fiyat = " + fiyat);
    }
}
