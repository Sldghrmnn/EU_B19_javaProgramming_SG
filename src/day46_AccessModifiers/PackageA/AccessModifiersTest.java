package day46_AccessModifiers.PackageA;

public class AccessModifiersTest {
    public static void main(String[] args) {

        AccessModifiers accessModifiers= new AccessModifiers();
        accessModifiers.publicMethod();
        accessModifiers.protectedMethod();
        accessModifiers.defaultMethod();
      //  accessModifiers.privateMethod(); -- farkli class icinde ulasilamaz

        System.out.println(accessModifiers.publicStr);
        System.out.println(accessModifiers.protectedStr);
        System.out.println(accessModifiers.defaultStr);
        //   System.out.println(accessModifiers.privateStr);  -- farklı class içinden ulaşılamaz

    }
}
