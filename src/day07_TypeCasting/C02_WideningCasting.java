package day07_TypeCasting;

public class C02_WideningCasting {
    public static void main(String[] args) {
      // byte < short < int < long < float < double   ( kucugu buyugun icine atama -otomattik gecer)

    byte b= 127;
    short sh= 45;

      sh=b;   // widening casting, implicit casting - automatic

       System.out.println("sh = " + sh);


    int i=14;      // widening casting, implicit casting - automatic
       i= sh;

    long l= 53726382983l;

        l=b;          // widening casting, implicit casting - automatic

        System.out.println("l = " + l);

    float f= 2.5f;
    double d= 5.6;

        d=f;          // widening casting, implicit casting - automatic

        System.out.println("d = " + d);


    }
}
