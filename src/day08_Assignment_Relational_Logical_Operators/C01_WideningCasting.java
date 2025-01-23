package day08_Assignment_Relational_Logical_Operators;

public class C01_WideningCasting {
    public static void main(String[] args) {

byte b=25;
short s;
s=b;

  System.out.println("s = " + s);

int i= s;
   System.out.println("i = " + i);

long l= i;
   System.out.println("l = " + l);

double d= l;
   System.out.println("d = " + d);

int sayi= 10/ 3;
   System.out.println("s = " + s);

double sayi1= 10 / 3;
// islem her zaman sgdan okumaya basladigi icin, kusuratsiz yazar
// yani : double'a atasak bile sagdaki sayilari int olarak aliyor. sayilarda kusuratli rakam olmadigi surece !!!
   System.out.println("sayi1 = " + sayi1);


 String name="Yasemin";

// double db = name; // bu data tipleri tamamen farklidir.cast olmaz


    }
}
