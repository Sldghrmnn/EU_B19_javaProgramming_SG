package day42_staticMemebers;

public class C12_OuterClass {

    private static String outerStaticDegisken = "Outer static degiskenim";
    private String outerNormalDegisken = "Outer normal degiskenim";

    public static class Inner{
        void mesaj(){
            System.out.println(outerStaticDegisken);
          //  System.out.println(outerNormalDegisken);
            System.out.println("Burasi inner static class");
        }
    }

    public class NormalInner{
        void mesaj(){
            System.out.println(outerStaticDegisken);
            System.out.println(outerNormalDegisken);
            System.out.println("Normal inner class");
        }
    }
}
