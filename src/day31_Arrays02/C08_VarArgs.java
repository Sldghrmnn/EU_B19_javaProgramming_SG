package day31_Arrays02;

public class C08_VarArgs {
    public static void main(String[] args){
        int [] x={1,2,3,4,5,6};
        toplam(x);

        System.out.println("--------------------");
        toplam1(x);
        System.out.println("--------------------");
        toplam1(1,2,3,4,5,6,7);

        System.out.println("--------------------");

        concat("Ahmet","Mehmet","Ayse","Fatma");
        String [] cars = {"Toyota","Honda","Opel","Mercedes","Audi"};
        concat(cars);


    }

    public static void toplam(int[] arr){
        int toplam=0;
        for (int a :arr ) {
            toplam += a;
        }
        System.out.println("toplam = " + toplam);
    }

    public static void toplam1(int... arr){
        int toplam=0;
        for (int a :arr ) {
            toplam += a;
        }
        System.out.println("toplam = " + toplam);
    }

    public static void concat(String...str){
        String result = "";
        for (String a : str) {
            result += a;
        }
        System.out.println("result = " + result);
    }

}
