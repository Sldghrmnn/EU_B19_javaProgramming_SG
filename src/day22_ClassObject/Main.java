package day22_ClassObject;

public class Main {
    public static void main(String[] args) {

        int i1=6;
        int i2=4;
        Calculator calculator=new Calculator();

        System.out.println(calculator.cikart(i1, i2));
        System.out.println(calculator.topla(i1, i2));

        Calculator calculator1=new Calculator();
        System.out.println(calculator1.topla(i1, i2));




        Circle circle=new Circle();
        System.out.println("circle.r = " + circle.r);
        circle.r=5;
        System.out.println("circle.r = " + circle.r);
        System.out.println("circle.pi = " + circle.pi);

        circle.alanHesapla();
        System.out.println("------------------------------------");

        circle.r=7;
        System.out.println("circle.r = " + circle.r);
        System.out.println("circle.pi = " + circle.pi);

        circle.alanHesapla();

        System.out.println("---------------------------------------");

        Circle circle1=new Circle();
        circle1.r=3;

        circle1.alanHesapla();
        System.out.println("circle1.cevreHesapla() = " + circle1.cevreHesapla());

        System.out.println("------------------------------------------");

        Person selda=new Person();
        selda.isim="Selda";
        selda.yas=49;
        selda.cinsiyet="Kadin";
        selda.tcNo="1234567890";

        selda.uyu();
        System.out.println("selda.yas = " + selda.yas);
        System.out.println("selda.isim = " + selda.isim);
        System.out.println("selda.cinsiyet = " + selda.cinsiyet);
        System.out.println("selda.tcNo = " + selda.tcNo);
        selda.oyunOyna();

        System.out.println("--------------------------");

        Person ahmet=new Person();
        ahmet.isim="Ahmet";
        ahmet.yas=25;
        ahmet.cinsiyet="Erkek";
        ahmet.tcNo="987654321";
        ahmet.yilsonuOrtalama=79;

        ahmet.uyu();
        ahmet.oyunOyna();

        System.out.println("----------------------------------");

        Car car1=new Car();
        car1.marka="Audi";
        car1.model="A-1";
        car1.renk="Beyaz";
        car1.hiz=180.0;

        car1.calistir();
        car1.hizlan();
        car1.dur();

        System.out.println("------------------------");

        Car car2=new Car();
        car2.marka="Mercedes";
        car2.model="C320";
        car2.renk="Siyah";
        car2.hiz=220.0;

        car2.calistir();
        car2.hizlan();
        car2.dur();

        System.out.println(car1==car2); // bu asamada false dir!

        car1=car2;

        System.out.println("car1.marka = " + car1.marka);
        System.out.println("-----------------------------");

        String str=new String("Ahmet");
        System.out.println("str = " + str);

        String str2=new String("Ahmet");

        System.out.println(str == str2);
        // sitem icindekilere bakmaz,referanslatri kontrol eder
        // ve false verir.farkli obje olarak tanimliyor.

        System.out.println("--------------------------------------------");

        System.out.println("Math2.sayiKuvveti() = " + Math2.sayiKuvveti(2,3));

        Math2 obj=new Math2();
        System.out.println("obj.pow(3,2) = " + obj.pow(2, 3));

    }
}
