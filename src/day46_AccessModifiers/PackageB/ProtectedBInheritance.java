package day46_AccessModifiers.PackageB;

import day46_AccessModifiers.PackageA.AccessModifiers;

public class ProtectedBInheritance extends AccessModifiers {

    public static void main(String[] args) {

        ProtectedBInheritance obj = new ProtectedBInheritance();
        obj.protectedMethod();
        System.out.println(obj.protectedStr);
    }
}
