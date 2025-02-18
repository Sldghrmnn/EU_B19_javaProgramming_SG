package day26_StringClass01;

public class C03_IsEmpty {
    public static void main(String[] args) {

        // isEmpty ve isBlank boolean döndürür. bos mu? icin...
        String str = "Merhaba";
        System.out.println(str.isEmpty()); // bos mu ? false
        System.out.println(str.isBlank()); // bos mu? false

        str = "";
        System.out.println(str.isEmpty());   //bos mu? true
        System.out.println(str.isBlank());   // bos mu? true

        str = " ";
        System.out.println(str.isEmpty()); // bosluk dahi olsa onu false cevirir
        System.out.println(str.isBlank());  //   boslugu tanimaz true verir.

    }
}
