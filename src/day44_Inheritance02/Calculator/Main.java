package day44_Inheritance02.Calculator;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        System.out.println("calculator.cikarma(23,12) = " + calculator.cikarma(23, 12));
        System.out.println("calculator.toplama(12,34) = " + calculator.toplama(12, 34));

        AdvanceCalculator advanceCalculator = new AdvanceCalculator();
        System.out.println("advanceCalculator.toplama(12,23) = " + advanceCalculator.toplama(12, 23));
        System.out.println("advanceCalculator.carpma(12,4) = " + advanceCalculator.carpma(12, 4));

        ScinCalculator scinCalculator = new ScinCalculator();
        System.out.println("scinCalculator.ustAlma(12,2) = " + scinCalculator.ustAlma(12, 2));
        System.out.println("scinCalculator.bolme(24,4) = " + scinCalculator.bolme(24, 4));
        System.out.println("scinCalculator.toplama(12,34) = " + scinCalculator.toplama(12, 34));
        System.out.println();

        FlightCalculator flightCalculator = new FlightCalculator();
        System.out.println("flightCalculator.cikarma(12,2) = " + flightCalculator.cikarma(12, 2));
        flightCalculator.yonHesapla();
        System.out.println("flightCalculator.carpma(13,3) = " + flightCalculator.carpma(13, 3));
        System.out.println();



    }
}

/*
single level inheritance -> parent-child  (mümkün)
multi level inheritance --> grandparent - parent - child.... (mümkün)
bir parenta ait birden fazla child --(bu da mümkün)

sadece bir tane 'is a relationship -> extend 'iliskisi kurabiliriz

multiple inheritance -- java'da yok--parent-parent > child-----(MÜMKÜN DEGIL!)

is a relationship
parent - child
super - sub
base - derived
 */
