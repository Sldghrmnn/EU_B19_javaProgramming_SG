package day05_Variables_cont;

public class C01_Variables {
    public static void main(String[] args) {


       String name ="Ahmet";
        System.out.println("name.toUpperCase()=" +name.toUpperCase());

        int age = 30;

        boolean isOpen = true;


        System.out.println(age);
        System.out.println(age+1);

        System.out.println(name+age);

        System.out.println(40);              //bir depoda olmadigi icin hatirlamayiz


        //declaration
        String surname;                        //String de hicbirsey atanmadiysa ö:surname: null; dur

        surname= "Yilmaz";  //assigment  -- atama

        System.out.println(surname);

        byte b1 = 10+2;
        byte b2 = 12;
        //  byte,short ve int ile yapilan matematiksel islemlerin sonucu her zaman int`dir.

        int i = b1 + b2;

        boolean is_open = true;

        boolean control = (age >20);

        System.out.println("control=" +control);

        System.out.println("name.isEmpty()=" + name.isEmpty());

        //iki sayi esit olup olmadigi

        boolean isEqual;

        isEqual =(b1 == b2);

        System.out.println("isEqual = " + isEqual);

        //declaration

         int a=5, b=10, c;
         int eklenecekDeger =5;
         int e =a + eklenecekDeger,d;


         int x;
         int y;           // clean code





    }
}
