package day29_Memory_GarbageCollection;

public class C06_VehicleTest {
    public static void main(String[] args) {

        //          STACK        HEAP
        C05_Vehicle car1 = new C05_Vehicle();
        System.out.println("car1 = " + car1);

        System.out.println("car1.brandname = " + car1.brandname);



        car1.brandname = "Toyota";
        car1.model = "Corolla";
        car1.year =2023;

        System.out.println("car1 = " + car1);
        System.out.println("car1.brandname = " + car1.brandname);

        car1=null; // bunu yaparsak car1 artik bosa duser adresi null olur

        System.out.println("car1 = " + car1);

        // System.out.println("car1.brandname = " + car1.brandname); //NullPointerException


        for (int i = 0; i < 10000; i++) {
          C05_Vehicle vehicle = new C05_Vehicle();
            System.out.println("vehicle = " + vehicle);
        }


        //Garbage collection method
        System.gc(); // GC'nin calismasini istiyoruz



    }
}
