package day06_Arithmetic_UnaryOperators;

public class C02_ClassTask {
    public static void main(String[] args) {
  /*
        TASK 1
Fatih Sultan Mehmet 1453 yılında İstanbul u fethetmiştir.
İfadesini bir değişkene atayın ve yıl başka bir değişken ile
kontrol edilebilsin.

*/
  int yil= 1453;
 String str="Fatih Sultan Mehmet"+ yil+ "yilinda Istanbul ´u fethetmistir.";
 System.out.println(str);



/*
       TASK 2
Ali 1990 yılında doğmuştur. Ali kaç yaşındadır?


Ali ile Ahmet kardeştir. Ali 1990 yılında doğmuştur. Ali ,Ahmet
den 5 yaş büyük olduğuna göre Ahmet kaç yaşındadır.
*/


int dogumYili= 1990;

int yasAli= 2025-dogumYili;

    System.out.println("yasAli = " + yasAli);        // alinin yasi 35 dir.

    System.out.println("Ali'nin yasi " + yasAli +"dir");

int yasAhmet= yasAli - 5;

    System.out.println("Ahmet in yasi  " + yasAhmet +"dir");

 /*
            Task 3
//300 Fahrenheit kaç Celsius ‘dur?       formulu okut:celcius u bulmak icin  (C) fahrenheit  (F) den 32 yi cikariyor
// (°C=(°F-32)/1.8)                       1.8 e boluyor....
*/


double f= 300;
double c= (f -32) /1.8;
        System.out.println( f+ "Fahrenheit" +c+ "Celsius dur");


        //Task4
//Ali fizik dersinden 92,
// kimya dersinden 55,
// matematik dersinden 89 almıştır.
//1.Ali’nin not ortalaması kaçtır?

double fizik=92;
double kimya= 55;
double mate=89;
double ortalama =(fizik+kimya+mate)/3;
     System.out.println(ortalama );








    }
}
