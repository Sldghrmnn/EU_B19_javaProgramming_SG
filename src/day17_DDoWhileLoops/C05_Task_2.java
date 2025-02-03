package day17_DDoWhileLoops;

public class C05_Task_2 {
    public static void main(String[] args) {

        int age = 62;
        int emeklilikYasi = 67;
        int year = 2025;

        if (18 <= age) {
            System.out.println("Giris izini verildi");
        }
        while (age < emeklilikYasi) {
            System.out.println();
            if (age == emeklilikYasi) {
                System.out.println("Emekli oldunuz!");
                break;
            }
            System.out.println("Yil : " + year);
            System.out.println("Sigortalinin yasi : " + age);
            System.out.println("Emekliligine kalan sure : " + (emeklilikYasi - age));
            age++;
            year++;
        }


        System.out.println("------------------------------\n");
        do {
            if (18 <= age) {
                System.out.println("Giris izini verildi");
            }
            while (age < emeklilikYasi) {
                System.out.println();
                if (age == emeklilikYasi) {
                    System.out.println("Emekli oldunuz!");
                    break;
                }
                System.out.println("Yil : " + year);
                System.out.println("Sigortalinin yasi : " + age);
                System.out.println("Emekliligine kalan sure : " + (emeklilikYasi - age));
                age++;
                year++;
            }
        } while (age <= emeklilikYasi) ;
        System.out.println("-----------------------------------\n");


        int counter=1;
        boolean flag=true;
        do {
            // web element sayfada mi?
            //if sayfada ise flag==false
            counter++;
        }while (flag && counter<=10);

        int counter2=1;
        do {
            //web elemente sayfada mi?
           // if sayfada ise, break
            counter2++;
        }while (counter2<=10);


        // web element'i kontrol et
        /// if(WebElement sayfada degilise){

        int counter3=1;
        while (counter3<=10){
            //web element sa<fada mi
            //if sayfada ise ,break
            counter3++;
        }
        int counter4=1;
        do {
            //kapi ziline bas
            counter++;
        }while (/*kapi acilana kadar zile bas*/true && counter < 40);









    }
}

