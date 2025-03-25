package day46_AccessModifiers.Constructor;

public class OgrenciTest {
    public static void main(String[] args) {

     // Ogrenci ogrenci= new Ogrenci(); //private constr.baska class'dan direk cagrilamaz
      Ogrenci ogrenci1 = new Ogrenci("Ahmet","Cakar");
      Ogrenci ogrenci2 = new Ogrenci("Gulden","Tazeoglu",11);
    }
}
