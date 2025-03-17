package day42_staticMemebers;

public class C13_OuterClassTest {
    public static void main(String[] args) {

        C12_OuterClass.Inner innerObje = new C12_OuterClass.Inner();

        innerObje.mesaj();

        System.out.println("---------------------------------");

        C12_OuterClass outerClass = new C12_OuterClass();

        C12_OuterClass.NormalInner normalInner = outerClass.new NormalInner();
        normalInner.mesaj();

    }
}
