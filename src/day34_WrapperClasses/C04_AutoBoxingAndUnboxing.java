package day34_WrapperClasses;

public class C04_AutoBoxingAndUnboxing {
    public static void main(String[] args) {
        System.out.println("Autoboxing and Unboxing Java");

        //Autoboxing primitive to Wrapper type

        int sayi = 3245;   //primetive
        Integer sayiWrp = sayi; //Autoboxing
        System.out.println("sayiWrp = " + sayiWrp);

        //Unboxing Wrapper to primitive

        Integer sayiWrp1 = 12345;

        int sayi1 = sayiWrp1; //unboxing
        System.out.println("sayi1 = " + sayi1);


        System.out.println(sayi + sayiWrp1);

    }
}
