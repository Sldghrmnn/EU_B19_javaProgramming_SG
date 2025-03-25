package day46_AccessModifiers.PackageB;

import day46_AccessModifiers.PackageA.AccessModifiers;

public class PackageB {

    public static void main(String[] args) {

        AccessModifiers accessModifiers=new AccessModifiers();

        System.out.println(accessModifiers.publicStr);
        accessModifiers.publicMethod();

         /*
      accessModifiers.protectedMethod();
      accessModifiers.defaultMethod();
      accessModifiers.privateMethod();

      System.out.println(accessModifiers.protectedStr);
      System.out.println(accessModifiers.defaultStr);
      System.out.println(accessModifiers.privateStr);

      Bunların hiçbirine ulaşamyız
       */
    }
}
