package day12_Switch_Case;

public class C02_SwitchIntro {
    public static void main(String[] args) {

        // switch kullanmak if-else ya gore daha basit ve okunmasi daha kolay !
        // bir degerin ne ollduguna bagli olarak, bir kodun calistirmaya yariyor!

        //sayinin alldigi degere gore durumunu kontrol edecegiz!

        int sayi= 20; //sayi 1 ile 4 arasi deger alir

        //10-A
        //20-B
        //30-C
        //40-D
        // disindaki degerler ise E dir


        switch (sayi){      //byte,short,int,String,char (wrapper + Enum)
            case 10:
                System.out.println("A");
                break;
            case 20:
                System.out.println("B");
                System.out.println("B");
                System.out.println("B");
                break;
            case 30:
                System.out.println("C");
                break;
            case 40:
                System.out.println("D");
                System.out.println("D");
                break;
            default:
                System.out.println("E");
        }








    }
}
