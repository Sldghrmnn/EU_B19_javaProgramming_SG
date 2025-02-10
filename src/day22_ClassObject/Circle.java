package day22_ClassObject;

public class Circle {

  int r;

  double pi=3.14;

     public void alanHesapla(){
      double alan= pi*r*r;

      System.out.println("alan = " + alan);
     }

     public double cevreHesapla(){
      double cevre= 2*pi*r;
      return cevre;
     }

}
/*
    Fields (özellikleri) yaricap pi=3.14

    Methods (action) alanHesapla()
    cevreHesapla()

*/
